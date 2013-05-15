/**
 * 
 */
package com.hundsun.futures.action;


import java.util.Date;

import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;
import com.hundsun.futures.entity.Reply;
import com.hundsun.futures.service.ReplyService;

/**
 * @author jinyb09017
 *
 */
public class ReplyAction extends BaseAction {
	private ReplyService replyService;
	private Reply reply;
	private Problem problem;
	private Page page;
//	private static final int AUDIT_NO=0;//审核未通过
//	private static final int AUDIT_YES=1;//审校通过
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
	/**
	 * @return the problem
	 */
	public Problem getProblem() {
		return problem;
	}
	/**
	 * @param problem the problem to set
	 */
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	/**
	 * @param replyService the replyService to set
	 */
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}
	/**
	 * @return the replyService
	 */
	public ReplyService getReplyService() {
		return replyService;
	}
	public Page getPage()
	{
		return this.page;
	}
	public void setReply(Reply reply)
	{
		this.reply = reply;
	}
	public Reply getReply()//这个地方必须要加上getReply否则无法取得表单的全部值的，注意了。
	{
		return this.reply;
	}

	public String add()
	{
		Reply	rep = new	Reply();
		rep.setAid(1);
		rep.setChild(0);//默认表示没有子回复；
		rep.setContent(reply.getContent());
		rep.setPid(reply.getPid());
		rep.setTime(new Date());
		replyService.addReply(rep);
		System.out.println(rep);
		return "add";
	}
}
