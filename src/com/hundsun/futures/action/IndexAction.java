/**
 * 
 */
package com.hundsun.futures.action;


import java.util.List;

import com.hundsun.futures.dao.ColumnDao;
import com.hundsun.futures.entity.Column;
import com.hundsun.futures.service.NewsService;

/**
 * @author jinyb09017
 *
 */
public class IndexAction extends BaseAction {
	private NewsService newsService;
	private ColumnDao columnDao;
	
	public String index()
	{
		List<Column> listColumn=columnDao.queryByCondition("from Column c where c.column='ÐÂÎÅ¶¯Ì¬'");
		Column column=listColumn.get(0);
		httpRequest.setAttribute("column", column);
		return "index";
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public ColumnDao getColumnDao() {
		return columnDao;
	}

	public void setColumnDao(ColumnDao columnDao) {
		this.columnDao = columnDao;
	}


}
