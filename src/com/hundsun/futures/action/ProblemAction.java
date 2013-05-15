/**
 * 
 */
package com.hundsun.futures.action;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hundsun.futures.entity.FeedbackType;
import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;
import com.hundsun.futures.entity.Reply;
import com.hundsun.futures.service.FeedbackTypeService;
import com.hundsun.futures.service.ProblemService;
import com.hundsun.futures.service.ReplyService;

/**
 * @author jinyb09017
 *
 */
public class ProblemAction extends BaseAction {
	private ProblemService problemService;
	private FeedbackTypeService feedbackTypeService;
	private Problem problem;
	private List<FeedbackType> fbackList;
	private String problemAudit;
	private Page page;
	private Map<Integer,String> fbackMap;
	private ReplyService replyService;
//	private static final int AUDIT_NO=0;//���δͨ��
//	private static final int AUDIT_YES=1;//��Уͨ��
//	private static final Map<String,Integer> auditMap;
//	static
//	{
//		auditMap=new HashMap<String, Integer>();
//		auditMap.put(key, value)
//	}
	public void setPage(Page page)
	{
		this.page = page;
	}
	public Page getPage()
	{
		return this.page;
	}
	public void setProblem(Problem problem)
	{
		this.problem = problem;
	}
	public Problem getProblem()//����ط�����Ҫ����getProblem�����޷�ȡ�ñ���ȫ��ֵ�ģ�ע���ˡ�
	{
		return this.problem;
	}
	public void setProblemAudit(String problemAudit)
	{
		this.problemAudit = problemAudit;
	}
	public String getProblemAduit()
	{
		return this.problemAudit;
	}
	/**
	 * @return the problemService
	 */
	public ProblemService getProblemService() {
		return problemService;
	}
	/**
	 * @param problemService the problemService to set
	 */
	public void setProblemService(ProblemService problemService) {
		this.problemService = problemService;
	}
	/**
	 * @return the feedbackTypeService
	 */
	public FeedbackTypeService getFeedbackTypeService() {
		return feedbackTypeService;
	}
	/**
	 * @param feedbackTypeService the feedbackTypeService to set
	 */
	public void setFeedbackTypeService(FeedbackTypeService feedbackTypeService) {
		this.feedbackTypeService = feedbackTypeService;
	}
	public String list()
	{
		List<Problem> problemList=null;
		fbackList = feedbackTypeService.ListFeedbackType();
		System.out.println(this.problem);
		if(null!=problem&&null!=problem.getTypeId()&&null!=problemAudit&&!"3".equals(problemAudit))
		{
			if(problemAudit.equals("1"))
				problem.setAudit(true);
			else
				problem.setAudit(false);
			problemList = problemService.ListProblemByConditons("from Problem problem where problem.audit=? and problem.typeId=?", new Object[]{problem.getAudit(),problem.getTypeId()});
		}
		else if(null!=problem&&null!=problem.getTypeId()&&!"3".equals(problemAudit))
		{
			problemList = problemService.ListProblemByFeedbackTypeId(problem.getTypeId());
		}
		else if(null!=problemAudit&&!"3".equals(problemAudit))
		{
			if(problemAudit.equals("1"))
				problem.setAudit(true);
			else
				problem.setAudit(false);
			problemList = problemService.ListProblemByConditons("from Problem problem where problem.audit=?", new Object[]{problem.getAudit()});
		}
		else
		{
            problemList = problemService.ListProblem();
		}
		httpRequest.setAttribute("problemList", problemList);
		httpRequest.setAttribute("feedbackTypeList", fbackList);
		//httpRequest.setAttribute("problemAudit", problemAudit);
		return "list";
		
		
			
		
	}
	public String myList()
	{
		List<Problem> problemList=null;
		fbackList = feedbackTypeService.ListFeedbackType();
		fbackMap = getFbackMap();
		System.out.println(this.problem);
		Page p=null;
		System.out.println(page);
		session.put("uid", 1);
		int uid = (Integer) session.get("uid");
		if(null!=problem&&null!=problem.getTypeId())
		{
			
			p=problemService.getPage("from Problem p where p.uid=? and p.typeId=?", new Object[]{uid,problem.getTypeId()});//���ݲ�ѯ�������page
			if(page!=null&&this.page.getCurrentPage()!=0)//����з�ҳ����
				p.setCurrentPage(this.page.getCurrentPage());
			problemList = problemService.ListByPage(p, "from Problem problem where problem.uid="+uid+" and problem.typeId='"+problem.getTypeId()+"'");
		
		}
		else
		{
			p = problemService.getPage("from Problem problem where problem.uid=?", new Object[]{uid});//����uid��ʼ��page��Ϣ��
			if(page!=null&&this.page.getCurrentPage()!=0)//����з�ҳ����
				p.setCurrentPage(this.page.getCurrentPage());
			problemList = problemService.ListByPage(p, "from Problem problem where problem.uid="+uid);
			//problemList = problemService.ListProblemByConditons("from Problem problem where problem.uid=?", new Object[]{uid});
		}
		httpRequest.setAttribute("problemList", problemList);
		httpRequest.setAttribute("feedbackTypeList", fbackList);
		httpRequest.setAttribute("page", p);
		httpRequest.setAttribute("problem", problem);//��Ҫ���ڴ���typeId��ֵ
		httpRequest.setAttribute("pid", this.problem==null?"":this.problem.getTypeId());
		httpRequest.setAttribute("fbackMap", fbackMap);
		return "myList";
		
		
			
		
	}
	public String replyList()
	{
		List<Problem> problemList=null;
		fbackList = feedbackTypeService.ListFeedbackType();
		fbackMap = getFbackMap();
		System.out.println(this.problem);
		Page p=null;
		System.out.println(page);
		if(null!=problem&&null!=problem.getTypeId())
		{
			
			p=problemService.getPage("from Problem p where p.audit=? and p.typeId=?", new Object[]{true,problem.getTypeId()});//���ݲ�ѯ�������page
			if(page!=null&&this.page.getCurrentPage()!=0)//����з�ҳ����
				p.setCurrentPage(this.page.getCurrentPage());
			problemList = problemService.ListByPage(p, "from Problem problem where problem.audit="+true+" and problem.typeId='"+problem.getTypeId()+"'");
		
		}
		else
		{
			p = problemService.getPage("from Problem problem where problem.audit=?", new Object[]{true});//�����Ƽ���ʼ��page��Ϣ��
			if(page!=null&&this.page.getCurrentPage()!=0)//����з�ҳ����
				p.setCurrentPage(this.page.getCurrentPage());
			problemList = problemService.ListByPage(p, "from Problem problem where problem.audit="+true);
			//problemList = problemService.ListProblemByConditons("from Problem problem where problem.uid=?", new Object[]{uid});
		}
		for(Problem pro:problemList)
		{
			System.out.println("reply �ĸ���"+pro.getReply().size());
			//if(pro.getReply().size()!=0)
				
		}
		httpRequest.setAttribute("problemList", problemList);
		httpRequest.setAttribute("feedbackTypeList", fbackList);
		httpRequest.setAttribute("page", p);
		httpRequest.setAttribute("problem", problem);//��Ҫ���ڴ���typeId��ֵ
		httpRequest.setAttribute("pid", this.problem==null?"":this.problem.getTypeId());
		httpRequest.setAttribute("fbackMap", fbackMap);
		return "replyList";
		
		
			
		
	}
	public String exchangePro()
	{
		if(page==null)
		{
			page=problemService.getPage("from Problem", new Object[]{});		
		}
		List<Problem> problemList=problemService.ListByPage(page, "from Problem");
		httpRequest.setAttribute("problemList", problemList);
		return "success";
		
		
	}
	
	public String edit()
	{
		System.out.println("edit���"+problem);
		Problem n=problemService.queryById(this.problem.getId());
		httpRequest.setAttribute("problem", n);
		String fback=feedbackTypeService.queryById(n.getTypeId()).getType();
		httpRequest.setAttribute("fback", fback);
		return	"edit";
	}
	public String del()
	{
		System.out.println("�Ƿ��Ѿ��õ�problemid"+problem.getId());
		problemService.deleteProblem(problem.getId());
		return	"del";
	}
	public String forwardAdd()
	{
		fbackList = feedbackTypeService.ListFeedbackType();
		httpRequest.setAttribute("feedbackTypeList", fbackList);
		return "forwardAdd";
	}
	public String add()
	{

		this.problem.setTime(new Date());
		this.problem.setUid(1);//�Լ����
		this.problem.setHits(0);
		System.out.println(problem);
		problemService.addProblem(this.problem);
		return "add";
	}
	public String upd()
	{
		System.out.println(this.problem);
		Problem n=problemService.queryById(this.problem.getId());
		n.setAudit(this.problem.getAudit());
		n.setRecomend(this.problem.isRecomend());
		problemService.updateProblem(n);
		//problemService.updateProblem(problem);
		return "upd";
	}
	public Map<Integer,String> getFbackMap()//��ȡһ��map����
	{
		Map<Integer,String> fbackMap = new	HashMap<Integer,String>();
		List<FeedbackType> list	= feedbackTypeService.ListFeedbackType();
		for(FeedbackType f:list)
		{
			fbackMap.put(f.getId(), f.getType());
		}
		return	fbackMap;
	}
	public String detail()
	{
		Problem p=problemService.queryById(problem.getId());
		httpRequest.setAttribute("problem", p);
		
		List<Reply> replyList=replyService.ListReply();
		for(Reply reply:replyList)
		{
			System.out.println(reply);
		}
		return "detail";
	}
	public ReplyService getReplyService() {
		return replyService;
	}
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

}
