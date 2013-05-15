package com.hundsun.futures.entity;
// default package

import java.util.Date;


/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer pid;
     private String content;
     private Date time;
     private Integer child;
     private Admin admin;
     private Integer aid;


    // Constructors

    /** default constructor */
    public Reply() {
    }


	public Reply(Integer id, Integer pid, Integer aid, String content,
			Date time, Integer child) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
		this.time = time;
		this.child = child;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}


	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}


	/**
	 * @return the aid
	 */


	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}


	/**
	 * @return the child
	 */
	public Integer getChild() {
		return child;
	}


	/**
	 * @param child the child to set
	 */
	public void setChild(Integer child) {
		this.child = child;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	


	public Admin getAdmin() {
		return admin;
	}


	@Override
	public String toString() {
		return "Reply [id=" + id + ", pid=" + pid 
				+ ", content=" + content + ", time=" + time + ", child="
				+ child + ", admin=" + admin + "]";
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public Integer getAid() {
		return aid;
	}


	public void setAid(Integer aid) {
		this.aid = aid;
	}

    
    








}