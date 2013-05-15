/**
 * 
 */
package com.hundsun.futures.service;

import java.util.List;


import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Reply;

/**
 * @author jinyb09017
 *
 */
public interface ReplyService {
   public abstract void addReply(Reply reply);
	
	public abstract void deleteReply(int id);
	
	public abstract void updateReply(Reply reply);
	
	public abstract Reply queryById(int id);
	
	public abstract List<Reply> ListReply();
	
	public abstract List<Reply> ListReplyByFeedbackTypeId(int id);
	
	public abstract List<Reply> ListReplyByConditons(String con,Object[] str);
	
	public abstract List<Reply> ListByPage(Page page,String hql);
	
	public abstract Page getPage(String hql,Object[] obj);
	
}
