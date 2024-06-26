package com.products.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class ProductDto {
	@NotEmpty(message = "이름은 필수 항목입니다.")
	private String name;
	
	@NotEmpty(message = "브랜드는 필수 항목입니다.")
	private String brand;
	
	@NotEmpty(message = "카테고리는 필수 항목입니다.")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 10, message = "설명은 최소 10자이어야 합니다.")
	@Size(max = 2000, message = "설명은 최대 2000자이어야 합니다.")
	private String description;
	
	private MultipartFile imageFile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	
	
}
