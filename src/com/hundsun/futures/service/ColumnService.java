/**
 * 
 */
package com.hundsun.futures.service;

import java.util.List;

import com.hundsun.futures.entity.Column;

/**
 * @author jinyb09017
 *
 */
public interface ColumnService {
	public abstract void addColumn(Column column);
	
	public abstract void deleteColumn(int id);
	
	public abstract void updateColumn(Column column);
	
	public abstract Column queryById(int id);
	
	public abstract List<Column> ListColumn();

}
