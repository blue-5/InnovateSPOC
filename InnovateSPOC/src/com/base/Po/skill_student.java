package com.base.Po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class skill_student {

	@Id
	private int id;//����ѧ����id
	private int sid;//ѧ��id
	private int kid;//����id
	private int skill_exp;//����ֵ
	
	public skill_student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public skill_student(int id, int sid, int kid, int skill_exp) {
		super();
		this.id = id;
		this.sid = sid;
		this.kid = kid;
		this.skill_exp = skill_exp;
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
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public int getSkill_exp() {
		return skill_exp;
	}
	public void setSkill_exp(int skill_exp) {
		this.skill_exp = skill_exp;
	}
	
	

}
