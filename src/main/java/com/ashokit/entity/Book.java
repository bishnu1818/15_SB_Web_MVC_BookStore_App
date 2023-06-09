package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Book_Details")
@Data
public class Book {
	
	@Id
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="BOOK_NAME")
	private String bookName;
	@Column(name="BOOK_PRICE")
	private Double bookPrice;
	@Column(name="BOOK_AUTHOR")
	private String bookAuthor;
	
	


}
