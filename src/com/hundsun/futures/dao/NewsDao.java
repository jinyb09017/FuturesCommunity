/**
 * 
 */
package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.News;

/**
 * @author jinyb09017
 *
 */
public interface NewsDao {
    public abstract void save(News news);
	
	public abstract void delete(Integer id);
	
	public abstract News queryById(Integer id);
	
	public abstract void update(News news);
	
	public abstract List<News> queryList();
	
	public abstract List<News> queryByCondition(String condition,int id);

}
