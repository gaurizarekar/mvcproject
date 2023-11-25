package project.model;

import javax.persistence.Entity;
import java.lang.*;
import javax.persistence.Id;

@Entity
public class result {
 @Id
  private int sid;
  private String name;
  private String date;
  private double mark;
  public result()
  {
	  super();
  }
public result(int sid, String name, String date, double mark) {
	super();
	this.sid = sid;
	this.name = name;
	this.date = date;
	this.mark = mark;
}
public int getId() {
	return sid;
}
public void setId(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
  
}