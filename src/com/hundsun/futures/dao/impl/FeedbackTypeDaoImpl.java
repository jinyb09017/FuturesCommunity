/**
 * 
 */
package com.hundsun.futures.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.FeedbackTypeDao;
import com.hundsun.futures.entity.FeedbackType;

/**
 * @author jinyb09017
 *
 */
public class FeedbackTypeDaoImpl extends HibernateDaoSupport implements FeedbackTypeDao {

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#save(com.hundsun.futures.entity.FeedbackType)
	 */
	public void save(FeedbackType feedbackType) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(feedbackType);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#delete(java.lang.Integer)
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(queryById(id));

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#queryById(java.lang.Integer)
	 */
	public FeedbackType queryById(Integer id) {
		// TODO Auto-generated method stub
		return (FeedbackType) this.getHibernateTemplate().get(FeedbackType.class, id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#update(com.hundsun.futures.entity.FeedbackType)
	 */
	public void update(FeedbackType feedbackType) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(feedbackType);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#queryList()
	 */
	@SuppressWarnings("unchecked")
	public List<FeedbackType> queryList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from FeedbackType");
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.FeedbackTypeDao#queryByCondition(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<FeedbackType> queryByCondition(String condition,int id) {
		// TODO Auto-generated method stub
		 return this.getHibernateTemplate().find(condition,id);
	}

}
