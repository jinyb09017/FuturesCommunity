/**
 * 
 */
package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.ColumnDao;
import com.hundsun.futures.dao.NewsDao;
import com.hundsun.futures.entity.News;
import com.hundsun.futures.service.NewsService;

/**
 * @author jinyb09017
 *
 */
public class NewsServiceImpl implements NewsService {
	private NewsDao newsDao;
	
	public void setNewsDao(NewsDao newsDao)
	{
		this.newsDao=newsDao;
	}


	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.NewsService#addNews(com.hundsun.futures.entity.News)
	 */
	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsDao.save(news);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.NewsService#deleteNews(int)
	 */
	public void deleteNews(int id) {
		// TODO Auto-generated method stub
		newsDao.delete(id);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.NewsService#updateNews(com.hundsun.futures.entity.News)
	 */
	public void updateNews(News news) {
		// TODO Auto-generated method stub
		newsDao.update(news);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.NewsService#queryById(int)
	 */
	public News queryById(int id) {
		// TODO Auto-generated method stub
		return newsDao.queryById(id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.NewsService#ListNews()
	 */
	public List<News> ListNews() {
		// TODO Auto-generated method stub
		return newsDao.queryList();
	}

	public List<News> ListNewsByColumnId(int id) {
		// TODO Auto-generated method stub
		return newsDao.queryByCondition("from News news where news.tid=?",id);
	}

}
