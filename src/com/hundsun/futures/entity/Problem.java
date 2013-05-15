package com.hundsun.futures.entity;
// default package

import java.util.Date;
import java.util.Set;


/**
 * Problem entity. @author MyEclipse Persistence Tools
 */

public class Problem  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String title;
     private String content;
     private Integer typeId;
     private Date time;
     private Integer uid;
     private boolean recomend;
     private boolean audit;
     private Integer hits;
     private Set<Reply> reply;


    // Constructors

    /** default constructor */
    public Problem() {
    }


	public Problem(Integer id, String title, String content, Integer typeId,
			Date time, Integer uid, boolean recomend, boolean audit, Integer hits) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.typeId = typeId;
		this.time = time;
		this.uid = uid;
		this.recomend = recomend;
		this.audit = audit;
		this.hits =hits;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


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
	 * @return the typeId
	 */
	public Integer getTypeId() {
		return typeId;
	}


	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}


	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}


	/**
	 * @return the recomend
	 */
	public boolean isRecomend() {
		return recomend;
	}


	/**
	 * @param recomend the recomend to set
	 */
	public void setRecomend(boolean recomend) {
		this.recomend = recomend;
	}


	/**
	 * @return the audit
	 */
	public boolean getAudit() {
		return audit;
	}


	/**
	 * @param audit the audit to set
	 */
	public void setAudit(boolean audit) {
		this.audit = audit;
	}
	
	public void setHits(Integer hits)
	{
		this.hits=hits;
	}
	public Integer getHits()
	{
		return hits;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */



	public Set<Reply> getReply() {
		return reply;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */


	public void setReply(Set<Reply> reply) {
		this.reply = reply;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Problem [id=" + id + ", title=" + title + ", content="
				+ content + ", typeId=" + typeId + ", time=" + time + ", uid="
				+ uid + ", recomend=" + recomend + ", audit=" + audit
				+ ", hits=" + hits + ", reply=" + reply + "]";
	}




   








}