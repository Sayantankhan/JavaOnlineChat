package com.OnlineChat.application.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tbl_onlineuser")
public class OnlineUser {

	@Id
	private String id;
	private String name;
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "OnlineUser [id=" + id + ", name=" + name + "]";
	}
	
}
