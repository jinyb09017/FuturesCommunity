/**
 * 
 */
package com.hundsun.futures.action;

import java.util.Date;
import java.util.List;

import com.hundsun.futures.entity.Column;
import com.hundsun.futures.entity.News;
import com.hundsun.futures.service.ColumnService;
import com.hundsun.futures.service.NewsService;

/**
 * @author jinyb09017
 *
 */
public class NewsAction extends BaseAction {
	private NewsService newsService;
	private ColumnService columnService;
	private News news;
	private Column column;
	private List<Column> columnList;
	public void setNews(News news)
	{
		this.news = news;
	}
	public News getNews()
	{
		return news;
	}

	/**
	 * @return the column
	 */
	public Column getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(Column column) {
		this.column = column;
	}
	public NewsService getNewsService() {
		return newsService;
	}
	/**
	 * @param newsService the newsService to set
	 */
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	/**
	 * @return the columnService
	 */
	public ColumnService getColumnService() {
		return columnService;
	}
	/**
	 * @param columnService the columnService to set
	 */
	public void setColumnService(ColumnService columnService) {
		this.columnService = columnService;
	}
	public String list()
	{

		List<News> newsList=null;
		columnList = columnService.ListColumn();
		if(null!=column&&null!=column.getId())
		{
			newsList = newsService.ListNewsByColumnId(column.getId());
		}
		else
		{
            newsList = newsService.ListNews();
		}
		httpRequest.setAttribute("newsList", newsList);
		httpRequest.setAttribute("columnList", columnList);
		return "list";
		
		
			
		
	}
	public String edit()
	{
		System.out.println("edit输出"+news);
		News n=newsService.queryById(this.news.getId());
		httpRequest.setAttribute("news", n);
		String clmn=columnService.queryById(n.getTid()).getColumn();
		httpRequest.setAttribute("clmn", clmn);
		return	"edit";
	}
	public String del()
	{
		System.out.println("是否已经得到newsid"+news.getId());
		newsService.deleteNews(news.getId());
		return	"del";
	}
	public String forwardAdd()
	{
		columnList = columnService.ListColumn();
		httpRequest.setAttribute("columnList", columnList);
		return "forwardAdd";
	}
	public String add()
	{


		this.news.setHits(0);
		this.news.setTime(new Date());
		this.news.setAid(1);
		newsService.addNews(this.news);
		return "add";
	}
	public String upd()
	{
		News n=newsService.queryById(this.news.getId());
		n.setContent(this.news.getContent());
		n.setTitle(this.news.getTitle());
		n.setAid(1);//用户的修改,栏目不能修改
		n.setTime(new Date());
		n.setRecomend(this.news.isRecomend());
		newsService.updateNews(n);
		return "upd";
	}
	public String detail()
	{
		News n=newsService.queryById(news.getId());
		httpRequest.setAttribute("news", n);
		return "detail";
	}

}
