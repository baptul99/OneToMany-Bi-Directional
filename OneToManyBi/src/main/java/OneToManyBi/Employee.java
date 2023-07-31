package OneToManyBi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
@Id
@GeneratedValue (strategy =GenerationType.IDENTITY )
private int id;
private String name,desg;
private long phone;
private double salary;
@ManyToOne(cascade =CascadeType.ALL )
@JoinColumn(name = "department_id")
private Department dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
}
