package com.base.Po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class teachers {

	@Id
    private int tid;//��ʦid
	private String tname;//��ʦ����
	private String teacher_introduce;//���ҽ���
	private String photo_address;//��Ƭ����ַ��
	public teachers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public teachers(int tid, String tname, String teacher_introduce,
			String photo_address) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.teacher_introduce = teacher_introduce;
		this.photo_address = photo_address;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTeacher_introduce() {
		return teacher_introduce;
	}

	public void setTeacher_introduce(String teacher_introduce) {
		this.teacher_introduce = teacher_introduce;
	}

	public String getPhoto_address() {
		return photo_address;
	}

	public void setPhoto_address(String photo_address) {
		this.photo_address = photo_address;
	}
	
	
}