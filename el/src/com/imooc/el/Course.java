package com.imooc.el;

public class Course {
	private String id;//课程id
	private String name;//课程名称
	private String category;//所属方向
	
	public Course() {
	}
	
	public Course(String id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
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
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
	
}
