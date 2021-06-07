package com.cg.onlineshoppingapps.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int catId;

	@Column(name = "category_name")
	private String categoryName;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Set<Product> product = new HashSet<>();

	public Category() {
		super();
	}

	public Category(int catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
	}
}
