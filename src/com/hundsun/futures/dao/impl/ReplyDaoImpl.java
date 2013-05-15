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

import com.hundsun.futures.dao.ReplyDao;
import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Reply;

/**
 * @author jinyb09017
 *
 */
public class ReplyDaoImpl extends HibernateDaoSupport implements ReplyDao {

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#save(com.hundsun.futures.entity.Reply)
	 */
	public void save(Reply reply) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(reply);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#delete(java.lang.Integer)
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(queryById(id));

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#queryById(java.lang.Integer)
	 */
	public Reply queryById(Integer id) {
		// TODO Auto-generated method stub
		return (Reply) this.getHibernateTemplate().get(Reply.class, id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#update(com.hundsun.futures.entity.Reply)
	 */
	public void update(Reply reply) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(reply);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#queryList()
	 */
	@SuppressWarnings("unchecked")
	public List<Reply> queryList() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Reply");
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.dao.ReplyDao#queryByCondition(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Reply> queryByCondition(String condition,int id) {
		// TODO Auto-generated method stub
		 return this.getHibernateTemplate().find(condition,id);
	}

	@SuppressWarnings("unchecked")
	public List<Reply> queryByConditions(String condition, Object[] str) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(condition, str);
	}

	public List<Reply> pageQuery(final Page page, final String hql) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Reply> replyList = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
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
		return replyList;
	}

}
