/**
 * 
 */
package com.hundsun.futures.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hundsun.futures.dao.ColumnDao;
import com.hundsun.futures.entity.Column;
import com.hundsun.futures.service.ColumnService;

/**
 * @author jinyb09017
 *
 */
public class ColumnServiceImpl implements
		ColumnService {
	private ColumnDao columnDao;
	/**
	 * @param columnDao the columnDao to set
	 */
	public void setColumnDao(ColumnDao columnDao) {//注入时只需要seter方法就ok了
		this.columnDao = columnDao;
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ColumnService#addColumn(com.hundsun.futures.entity.Column)
	 */
	public void addColumn(Column column) {
		// TODO Auto-generated method stub
		this.columnDao.save(column);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ColumnService#deleteColumn(int)
	 */
	public void deleteColumn(int id) {
		// TODO Auto-generated method stub
		this.columnDao.delete(id);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ColumnService#updateColumn(com.hundsun.futures.entity.Column)
	 */
	public void updateColumn(Column column) {
		// TODO Auto-generated method stub
		this.columnDao.update(column);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ColumnService#ListColumn()
	 */
	public List<Column> ListColumn() {
		// TODO Auto-generated method stub
		return this.columnDao.queryList();
	}

	public Column queryById(int id) {
		// TODO Auto-generated method stub
		return this.columnDao.queryById(id);
	}

}
