package jp.co.tonaise.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String emppNameString;
    private Double salary;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getEmppNameString() {
	return emppNameString;
    }

    public void setEmppNameString(String emppNameString) {
	this.emppNameString = emppNameString;
    }

    public Double getSalary() {
	return salary;
    }

    public void setSalary(Double salary) {
	this.salary = salary;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((emppNameString == null) ? 0 : emppNameString.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((salary == null) ? 0 : salary.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (emppNameString == null) {
	    if (other.emppNameString != null)
		return false;
	} else if (!emppNameString.equals(other.emppNameString))
	    return false;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (salary == null) {
	    if (other.salary != null)
		return false;
	} else if (!salary.equals(other.salary))
	    return false;
	return true;
    }

}
