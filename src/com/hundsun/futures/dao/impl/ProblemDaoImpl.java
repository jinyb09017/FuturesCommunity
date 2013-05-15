/**
 * 
 */
package com.hundsun.futures.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.ProblemDao;
import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;

/**
 * @author jinyb09017
 *
 */
public class ProblemDaoImpl extends HibernateDaoSupport implements ProblemDao {

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#save(com.hundsun.futures.entity.Problem)
	 */
	public void save(Problem problem) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(problem);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#delete(java.lang.Integer)
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(queryById(id));

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#queryById(java.lang.Integer)
	 */
	public Problem queryById(Integer id) {
		// TODO Auto-generated method stub
		return (Problem) this.getHibernateTemplate().get(Problem.class, id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#update(com.hundsun.futures.entity.Problem)
	 */
	public void update(Problem problem) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(problem);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#queryList()
	 */
	@SuppressWarnings("unchecked")
	public List<Problem> queryList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Problem");
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ProblemDao#queryByCondition(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Problem> queryByCondition(String condition,int id) {
		// TODO Auto-generated method stub
		 return this.getHibernateTemplate().find(condition,id);
	}

	@SuppressWarnings("unchecked")
	public List<Problem> queryByConditions(String condition, Object[] str) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(condition, str);
	}

	public List<Problem> pageQuery(final Page page, final String hql) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Problem> problemList = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query	query = session.createQuery(hql);
				query.setFirstResult(page.getOffsetPage());
				query.setMaxResults(page.getPageSize());
				List list=query.list();
				return list;
			}
		});
		return problemList;
	}

}
