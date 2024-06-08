package com.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
   }
	@Id
	@Column(name="courseid")
 private int courseId;
	@Column(name="coursename" ,length = 10)
 private String courseName;
	@Column(name="duration")
 private int duration;
	@ManyToMany(targetEntity =Student.class,cascade = CascadeType.ALL )
   @JoinTable(name="course_stu", joinColumns = {@JoinColumn(name="cid")},inverseJoinColumns = {@JoinColumn(name="sid")} )
	private Set<Student> students;
}
