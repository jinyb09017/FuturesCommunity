/**
 * 
 */
package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.FeedbackTypeDao;
import com.hundsun.futures.dao.ProblemDao;
import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;
import com.hundsun.futures.service.ProblemService;

/**
 * @author jinyb09017
 *
 */
public class ProblemServiceImpl implements ProblemService {
	private ProblemDao problemDao;
	
	public void setProblemDao(ProblemDao problemDao)
	{
		this.problemDao=problemDao;
	}


	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ProblemService#addProblem(com.hundsun.futures.entity.Problem)
	 */
	public void addProblem(Problem problem) {
		// TODO Auto-generated method stub
		problemDao.save(problem);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ProblemService#deleteProblem(int)
	 */
	public void deleteProblem(int id) {
		// TODO Auto-generated method stub
		problemDao.delete(id);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ProblemService#updateProblem(com.hundsun.futures.entity.Problem)
	 */
	public void updateProblem(Problem problem) {
		// TODO Auto-generated method stub
		problemDao.update(problem);

	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ProblemService#queryById(int)
	 */
	public Problem queryById(int id) {
		// TODO Auto-generated method stub
		return problemDao.queryById(id);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.futures.service.ProblemService#ListProblem()
	 */
	public List<Problem> ListProblem() {
		// TODO Auto-generated method stub
		return problemDao.queryList();
	}

	public List<Problem> ListProblemByFeedbackTypeId(int id) {
		// TODO Auto-generated method stub
		return problemDao.queryByCondition("from Problem problem where problem.typeId=?",id);
	}


	public List<Problem> ListProblemByConditons(String con,Object[] str) {
		// TODO Auto-generated method stub
		return problemDao.queryByConditions(con, str);//这是一个多条件查询接口
	}


	public List<Problem> ListByPage(Page page, String hql) {
		// TODO Auto-generated method stub
		return problemDao.pageQuery(page, hql);
	}


	public Page getPage(String hql,Object[] obj) {//需要针对相应的查询条件，初始化page信息
		// TODO Auto-generated method stub
		Page	page = new	Page();
		List<Problem>	l = problemDao.queryByConditions(hql, obj);
		page.setAllRows(l.size());
		page.setCurrentPage(1);
		int pageTotal=l.size()%page.getPageSize()==0?l.size()/page.getPageSize():l.size()/page.getPageSize()+1;
		page.setTotalPage(pageTotal);
		page.init();
		
		return page;
	}

}
