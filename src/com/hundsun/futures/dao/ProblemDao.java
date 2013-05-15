/**
 * 
 */
package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;

/**
 * @author jinyb09017
 *
 */
public interface ProblemDao {
    public abstract void save(Problem problem);
	
	public abstract void delete(Integer id);
	
	public abstract Problem queryById(Integer id);
	
	public abstract void update(Problem problem);
	
	public abstract List<Problem> queryList();
	
	public abstract List<Problem> queryByCondition(String condition,int id);
	
	public abstract List<Problem> queryByConditions(String condition,Object[] str);
	
	public abstract List<Problem> pageQuery(final Page page,final String hql);

}
