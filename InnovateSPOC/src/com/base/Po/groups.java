package com.base.Po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class groups {

	@Id
	private int gid;//���id
	private String gname;//�������
	
	public groups() {
		super();
		// TODO Auto-generated constructor stub
	}

	public groups(int gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	
}
