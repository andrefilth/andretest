package org.fiveware.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person", catalog = "public")
public class Person {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;
	
	@Column (name = "sex")
	private String sex;

	public Person() {
	}

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.setSex(sex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}