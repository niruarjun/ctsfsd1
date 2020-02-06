package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;

@Document
@Data

	public class Item {
		@Id
		private String itemId;
		private String itemName;
		private double itemPrice;
		
		public Item(String itemName, double itemPrice ) {
			super();
			this.itemName = itemName;
			this.itemPrice = itemPrice;
				
					
		}
		public Item() {
			super();
		}
		
		
		

}
