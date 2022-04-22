package com.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="university_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id")
	private List<Student> student;
}
