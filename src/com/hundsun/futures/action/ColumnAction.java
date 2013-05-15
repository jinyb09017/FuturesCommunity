/**
 * 
 */
package com.hundsun.futures.action;

import java.util.List;

import com.hundsun.futures.entity.Column;
import com.hundsun.futures.service.ColumnService;

/**
 * @author jinyb09017
 *
 */
public class ColumnAction extends BaseAction{
	private Column myCol;
	private ColumnService columnService;
//	private Integer id;//这里需要一个setid方法来获得url传过来的id参数，否则无法获得啊。
	private String column;
//	public void setId(Integer id)
//	{
//		this.id=id;
//	}
	public void setColumn(String column)
	{
		this.column=column;
	}
//	
	/**
	 * @return the column
	 */
//	public Column getMycol() {
//		return myCol;
//	}
	/**
	 * @param column the column to set
	 */
	public void setMyCol(Column myCol) {
		this.myCol = myCol;
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
		List<Column> columnList=columnService.ListColumn();
		httpRequest.setAttribute("columnList", columnList);
		return "list";
	}
	public String upd()
	{

		this.myCol.setColumn(this.column);

		columnService.updateColumn(this.myCol);
		return "upd";
	}
	public String del()
	{
		//这个也可以从注入的user那儿的getId方法获得传过来的id值。
		columnService.deleteColumn(this.myCol.getId());
		return "del";
	}
	public String search()
	{
		Column col=columnService.queryById(this.myCol.getId());
		httpRequest.setAttribute("col", col);
		return "edit";
	}
	public String add()
	{
//		Column col=new Column();
//		col.setColumn(this.column);
		columnService.addColumn(this.myCol);
		return "add";
	}
	

}
