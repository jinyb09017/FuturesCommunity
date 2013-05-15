/**
 * 
 */
package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.Column;

/**
 * @author jinyb09017
 *
 */
public interface ColumnDao {
	public abstract void save(Column column);
	
	public abstract void delete(Integer id);
	
	public abstract Column queryById(Integer id);
	
	public abstract void update(Column column);
	
	public abstract List<Column> queryList();
	
	public abstract List<Column> queryByCondition(String condition);

}
