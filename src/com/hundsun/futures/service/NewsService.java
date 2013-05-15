/**
 * 
 */
package com.hundsun.futures.service;

import java.util.List;

import com.hundsun.futures.dao.NewsDao;
import com.hundsun.futures.entity.News;

/**
 * @author jinyb09017
 *
 */
public interface NewsService {
   public abstract void addNews(News news);
	
	public abstract void deleteNews(int id);
	
	public abstract void updateNews(News news);
	
	public abstract News queryById(int id);
	
	public abstract List<News> ListNews();
	
	public abstract List<News> ListNewsByColumnId(int id);
	
}
