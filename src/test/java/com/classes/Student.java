package com.classes;

public class Student extends Person
{
private String branchname;
public String getCollegeName() 
{
	return "CBIT";
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}

}
