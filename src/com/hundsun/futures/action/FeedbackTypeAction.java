/**
 * 
 */
package com.hundsun.futures.action;

import java.util.List;

import com.hundsun.futures.entity.FeedbackType;
import com.hundsun.futures.service.FeedbackTypeService;

/**
 * @author jinyb09017
 *
 */
public class FeedbackTypeAction extends BaseAction{
	private FeedbackType feedbackType;
	private FeedbackTypeService feedbackTypeService;
	private String type;
//	private Integer id;//������Ҫһ��setid���������url��������id�����������޷���ð���
//	private String feedbackType;
//	public void setId(Integer id)
//	{
//		this.id=id;
//	}
//	public void setFeedbackType(String feedbackType)
//	{
//		this.feedbackType=feedbackType;
//	}
//	
	/**
	 * @return the feedbackType
	 */
//	public FeedbackType getMycol() {
//		return myCol;
//	}
	/**
	 * @param feedbackType the feedbackType to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	public void setFeedbackType(FeedbackType feedbackType) {
		this.feedbackType = feedbackType;
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
		List<FeedbackType> feedbackTypeList=feedbackTypeService.ListFeedbackType();
		httpRequest.setAttribute("feedbackTypeList", feedbackTypeList);
		return "list";
	}
	public String upd()
	{
//		FeedbackType col=new FeedbackType();
//		col.setFeedbackType(this.feedbackType);
//		col.setId(this.id);
		this.feedbackType.setType(type);
		feedbackTypeService.updateFeedbackType(this.feedbackType);
		return "upd";
	}
	public String del()
	{
		//���Ҳ���Դ�ע���user�Ƕ���getId������ô�������idֵ��
		feedbackTypeService.deleteFeedbackType(this.feedbackType.getId());
		return "del";
	}
	public String search()
	{
		FeedbackType col=feedbackTypeService.queryById(this.feedbackType.getId());
		httpRequest.setAttribute("feedbackType", feedbackType);
		return "edit";
	}
	public String add()
	{
//		FeedbackType col=new FeedbackType();
//		col.setFeedbackType(this.feedbackType);
		feedbackTypeService.addFeedbackType(this.feedbackType);
		return "add";
	}
	

}
