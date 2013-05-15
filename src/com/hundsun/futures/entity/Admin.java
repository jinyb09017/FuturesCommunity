package com.hundsun.futures.entity;
// default package



/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String pwd;
     private Integer level;
     private Integer state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer id, String name, String pwd, Integer level,
			Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.level = level;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", level=" + level + ", state=" + state + "]";
	}

   
}