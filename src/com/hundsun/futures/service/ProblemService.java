/**
 * 
 */
package com.hundsun.futures.service;

import java.util.List;


import com.hundsun.futures.entity.Page;
import com.hundsun.futures.entity.Problem;

/**
 * @author jinyb09017
 *
 */
public interface ProblemService {
   public abstract void addProblem(Problem problem);
	
	public abstract void deleteProblem(int id);
	
	public abstract void updateProblem(Problem problem);
	
	public abstract Problem queryById(int id);
	
	public abstract List<Problem> ListProblem();
	
	public abstract List<Problem> ListProblemByFeedbackTypeId(int id);
	
	public abstract List<Problem> ListProblemByConditons(String con,Object[] str);
	
	public abstract List<Problem> ListByPage(Page page,String hql);
	
	public abstract Page getPage(String hql,Object[] obj);
	
}
