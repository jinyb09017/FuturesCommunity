/**
 * 
 */
package com.jyb.crawler.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hundsun.futures.entity.Problem;
import com.hundsun.futures.entity.Reply;
import com.hundsun.futures.service.ProblemService;
import com.hundsun.futures.service.ReplyService;


/**
 * @author jinyb09017
 *
 */
public class SpringTest {
	private static ApplicationContext context;
	@BeforeClass
	public static void init()
	{
		context= new ClassPathXmlApplicationContext(new String[]{"ssh-base.xml",
				"ssh-dao.xml","ssh-service.xml","ssh-transaction.xml"});
	}
	@Before
	public void start()
	{
		System.out.println("开始测试");
	}
	@After
	public void end()
	{
		System.out.println("本测试结束");
	}
	@Ignore
	public void reply()
	{
		ReplyService rs=(ReplyService) context.getBean("replyService");
		List<Reply> replyList=rs.ListReply();
		for(Reply reply:replyList)
		{
			System.out.println(reply);
		}
	}
	@Test
	public void problem()
	{
		ProblemService rs=(ProblemService) context.getBean("problemService");
		List<Problem> replyList=rs.ListProblem();
		for(Problem reply:replyList)
		{
			System.out.println(reply);
		}
	}
	
	

}
