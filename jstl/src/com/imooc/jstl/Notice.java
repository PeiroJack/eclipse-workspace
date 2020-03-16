package com.imooc.jstl;

public class Notice {
	private String id;//¹«¸æ
	private String name;//Ãû³Æ
	
	public Notice() {
		super();
	}
	
	@Override
	public String toString() {
		return "Notice [id=" + id + ", name=" + name + "]";
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Notice(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
