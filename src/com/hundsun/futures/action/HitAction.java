package com.hundsun.futures.action;

public class HitAction extends BaseAction{
	
	private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public String execute()
	{
		ip=httpRequest.getRemoteAddr();
		System.out.println(ip);
		return "success";
	}

}
