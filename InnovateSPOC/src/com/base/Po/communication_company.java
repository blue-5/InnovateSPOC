package com.base.Po;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class communication_company {

	@Id
	private int id;//��ҵ������id
	private String title;//����
	private String photo;//��ҵͼƬ
	
	public communication_company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public communication_company(int id, String title, String photo) {
		super();
		this.id = id;
		this.title = title;
		this.photo = photo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
