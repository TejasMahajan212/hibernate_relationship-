package com.joinExample;

import java.util.Set;

public class Project {
  
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	public Set getProjectassign() {
		return projectassign;
	}
	public void setProjectassign(Set projectassign) {
		this.projectassign = projectassign;
	}
	private Set projectassign;
	private int projectid;
	private String projectName;
	private String projectDesc;
	
}
