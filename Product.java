package com.qa.java.excercises;

public class Product {
	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;

	static String SELLER_NAME = "John";
	static String SELLER_CONTACT_NO = "07999999999";
	static String SELLER_EMAIL = "seller@seller.com";
	
	

	public Product(int id, String name, double price, String category, double rating, int discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
		System.out.println("Product id: " + this.id);
		System.out.println("Product name: " + this.name);
		System.out.println("Product Catergory: " + this.category);
		System.out.println("Product rating: " + this.rating + "/5.0");
		System.out.println("Product in stock: " + this.isAvailable);
		System.out.println(this.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + this.price);
		System.out.println("Discounted Product Price: £" + (this.price - (this.price * this.discountPercentage / 100)));
		System.out.println();
	}

// Sellers information

	static void sellerDetails() {
		System.out.println("Name is: " + SELLER_NAME);
		System.out.println("Phone number is: " + SELLER_CONTACT_NO);
		System.out.println("email is: " + SELLER_EMAIL);
	}
}