/**
 * 
 */
package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.FeedbackType;

/**
 * @author jinyb09017
 *
 */
public interface FeedbackTypeDao {
    public abstract void save(FeedbackType feedbackType);
	
	public abstract void delete(Integer id);
	
	public abstract FeedbackType queryById(Integer id);
	
	public abstract void update(FeedbackType feedbackType);
	
	public abstract List<FeedbackType> queryList();
	
	public abstract List<FeedbackType> queryByCondition(String condition,int id);

}
