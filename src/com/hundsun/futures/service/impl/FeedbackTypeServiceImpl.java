/**
 * 
 */
package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.ColumnDao;
import com.hundsun.futures.dao.FeedbackTypeDao;
import com.hundsun.futures.entity.FeedbackType;
import com.hundsun.futures.service.FeedbackTypeService;

/**
 * @author jinyb09017
 *
 */
public class FeedbackTypeServiceImpl implements FeedbackTypeService {
	private FeedbackTypeDao feedbackTypeDao;
	
	public void setFeedbackTypeDao(FeedbackTypeDao feedbackTypeDao)
	{
		this.feedbackTypeDao=feedbackTypeDao;
	}


	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.FeedbackTypeService#addFeedbackType(com.hundsun.futures.entity.FeedbackType)
	 */
	public void addFeedbackType(FeedbackType feedbackType) {
		// TODO Auto-generated method stub
		feedbackTypeDao.save(feedbackType);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.FeedbackTypeService#deleteFeedbackType(int)
	 */
	public void deleteFeedbackType(int id) {
		// TODO Auto-generated method stub
		feedbackTypeDao.delete(id);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.FeedbackTypeService#updateFeedbackType(com.hundsun.futures.entity.FeedbackType)
	 */
	public void updateFeedbackType(FeedbackType feedbackType) {
		// TODO Auto-generated method stub
		feedbackTypeDao.update(feedbackType);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.FeedbackTypeService#queryById(int)
	 */
	public FeedbackType queryById(int id) {
		// TODO Auto-generated method stub
		return feedbackTypeDao.queryById(id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.FeedbackTypeService#ListFeedbackType()
	 */
	public List<FeedbackType> ListFeedbackType() {
		// TODO Auto-generated method stub
		return feedbackTypeDao.queryList();
	}

	public List<FeedbackType> ListFeedbackTypeByColumnId(int id) {
		// TODO Auto-generated method stub
		return feedbackTypeDao.queryByCondition("from FeedbackType feedbackType where feedbackType.tid=?",id);
	}

}
