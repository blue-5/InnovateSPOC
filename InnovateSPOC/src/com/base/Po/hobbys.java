package com.base.Po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class hobbys {

	@Id
	private int id;//��Ȥ���ñ�id
	private int sid;//ѧ��id
	private String hobby;//��������
	private String begin_time;//��ʼʱ��
	private String end_time;//����ʱ��
	private String HobbyDescription;//��������
	
	public hobbys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hobbys(int id, int sid, String hobby, String begin_time,
			String end_time, String hobbyDescription) {
		super();
		this.id = id;
		this.sid = sid;
		this.hobby = hobby;
		this.begin_time = begin_time;
		this.end_time = end_time;
		HobbyDescription = hobbyDescription;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(String begin_time) {
		this.begin_time = begin_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getHobbyDescription() {
		return HobbyDescription;
	}
	public void setHobbyDescription(String hobbyDescription) {
		HobbyDescription = hobbyDescription;
	}
	
	
}
