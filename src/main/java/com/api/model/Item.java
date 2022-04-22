package com.api.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String serialNumber;
	
//	@ManyToOne
//	@JsonIgnore
//	@JsonBackReference
//	private Cart cart;
}
