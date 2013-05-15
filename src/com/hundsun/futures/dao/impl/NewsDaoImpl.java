/**
 * 
 */
package com.hundsun.futures.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.NewsDao;
import com.hundsun.futures.entity.News;

/**
 * @author jinyb09017
 *
 */
public class NewsDaoImpl extends HibernateDaoSupport implements NewsDao {

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#save(com.hundsun.futures.entity.News)
	 */
	public void save(News news) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(news);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#delete(java.lang.Integer)
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(queryById(id));

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#queryById(java.lang.Integer)
	 */
	public News queryById(Integer id) {
		// TODO Auto-generated method stub
		return (News) this.getHibernateTemplate().get(News.class, id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#update(com.hundsun.futures.entity.News)
	 */
	public void update(News news) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(news);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#queryList()
	 */
	@SuppressWarnings("unchecked")
	public List<News> queryList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from News");
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.NewsDao#queryByCondition(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<News> queryByCondition(String condition,int id) {
		// TODO Auto-generated method stub
		 return this.getHibernateTemplate().find(condition,id);
	}

}
