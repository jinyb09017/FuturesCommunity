package com.hundsun.futures.entity;
// default package



/**
 * FeedbackType entity. @author MyEclipse Persistence Tools
 */

public class FeedbackType  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String type;


    // Constructors

    /** default constructor */
    public FeedbackType() {
    }

    
    /** full constructor */
    public FeedbackType(Integer id,String type) {
    	this.id=id;
        this.type = type;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FeedbackType [id=" + id + ", type=" + type + "]";
	}

   








}