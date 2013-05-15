/**
 * 
 */
package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.FeedbackTypeDao;
import com.hundsun.futures.dao.ReplyDao;
import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Reply;
import com.hundsun.futures.service.ReplyService;

/**
 * @author jinyb09017
 *
 */
public class ReplyServiceImpl implements ReplyService {
	private ReplyDao replyDao;
	
	public void setReplyDao(ReplyDao replyDao)
	{
		this.replyDao=replyDao;
	}


	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ReplyService#addReply(com.hundsun.futures.entity.Reply)
	 */
	public void addReply(Reply reply) {
		// TODO Auto-generated method stub
		replyDao.save(reply);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ReplyService#deleteReply(int)
	 */
	public void deleteReply(int id) {
		// TODO Auto-generated method stub
		replyDao.delete(id);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ReplyService#updateReply(com.hundsun.futures.entity.Reply)
	 */
	public void updateReply(Reply reply) {
		// TODO Auto-generated method stub
		replyDao.update(reply);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ReplyService#queryById(int)
	 */
	public Reply queryById(int id) {
		// TODO Auto-generated method stub
		return replyDao.queryById(id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ReplyService#ListReply()
	 */
	public List<Reply> ListReply() {
		// TODO Auto-generated method stub
		return replyDao.queryList();
	}

	public List<Reply> ListReplyByFeedbackTypeId(int id) {
		// TODO Auto-generated method stub
		return replyDao.queryByCondition("from Reply reply where reply.typeId=?",id);
	}


	public List<Reply> ListReplyByConditons(String con,Object[] str) {
		// TODO Auto-generated method stub
		return replyDao.queryByConditions(con, str);//这是一个多条件查询接口
	}


	public List<Reply> ListByPage(Page page, String hql) {
		// TODO Auto-generated method stub
		return replyDao.pageQuery(page, hql);
	}


	public Page getPage(String hql,Object[] obj) {//需要针对相应的查询条件，初始化page信息
		// TODO Auto-generated method stub
		Page	page = new	Page();
		List<Reply>	l = replyDao.queryByConditions(hql, obj);
		page.setAllRows(l.size());
		page.setCurrentPage(1);
		int pageTotal=l.size()%page.getPageSize()==0?l.size()/page.getPageSize():l.size()/page.getPageSize()+1;
		page.setTotalPage(pageTotal);
		page.init();
		
		return page;
	}

}
