/**
 * 
 */
package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Reply;

/**
 * @author jinyb09017
 *
 */
public interface ReplyDao {
    public abstract void save(Reply reply);
	
	public abstract void delete(Integer id);
	
	public abstract Reply queryById(Integer id);
	
	public abstract void update(Reply reply);
	
	public abstract List<Reply> queryList();
	
	public abstract List<Reply> queryByCondition(String condition,int id);
	
	public abstract List<Reply> queryByConditions(String condition,Object[] str);
	
	public abstract List<Reply> pageQuery(final Page page,final String hql);

}
