/**
 * 
 */
package com.hundsun.futures.service;

import java.util.List;

import com.hundsun.futures.dao.FeedbackTypeDao;
import com.hundsun.futures.entity.FeedbackType;

/**
 * @author jinyb09017
 *
 */
public interface FeedbackTypeService {
   public abstract void addFeedbackType(FeedbackType feedbackType);
	
	public abstract void deleteFeedbackType(int id);
	
	public abstract void updateFeedbackType(FeedbackType feedbackType);
	
	public abstract FeedbackType queryById(int id);
	
	public abstract List<FeedbackType> ListFeedbackType();
	
	public abstract List<FeedbackType> ListFeedbackTypeByColumnId(int id);
	
}
