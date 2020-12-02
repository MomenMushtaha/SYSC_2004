package Assignments.SYSC2004A5;

import java.util.Objects;
import java.util.logging.Logger;  
public class Course {

private static final Logger LOGGER = Logger.getLogger(Course.class.getName());

//Declared class members as a private access specifiers.
private String department;
private int courseNumber;
private int courseCredits;
private double courseCost;

// illustrates the use of Encapsulation.

public Course() {
department = "unknown";
courseNumber = 0;
courseCost = 0;
courseCredits = 0;
}

/**
*
* @param department
* @param courseNumber
* @param courseCredits
*/
public Course(String department, int courseNumber, int courseCredits) {
this.department = department;
this.courseNumber = courseNumber;
this.courseCredits = courseCredits;
courseCost = courseCredits / 2 * 500;
}

public String getDepartment() {
return department;
}

public void setDepartment(String department) {
this.department = department;
}

public int getCourseNumber() {
return courseNumber;
}

public void setCourseNumber(int courseNumber) {
this.courseNumber = courseNumber;
}

public int getCourseCredits() {
return courseCredits;
}

public void setCourseCredits(int courseCredits) {
this.courseCredits = courseCredits;
}

public double getCourseCost() {
return courseCost;
}

public void setCourseCost(double courseCost) {
this.courseCost = courseCost;
}

@Override
public int hashCode() {
int hash = 3;
hash = 89 * hash + Objects.hashCode(this.department);
hash = 89 * hash + this.courseNumber;
hash = 89 * hash + this.courseCredits;
hash = 89 * hash + (int) (Double.doubleToLongBits(this.courseCost) ^ (Double.doubleToLongBits(this.courseCost) >>> 32));
return hash;
}

//illustartes the use of Polymorphism.

@Override
public boolean equals(Object obj) {
if (this == obj) {
return true;
}
if (obj == null) {
return false;
}
if (getClass() != obj.getClass()) {
return false;
}
final Course other = (Course) obj;
if (this.courseNumber != other.courseNumber) {
return false;
}
if (this.courseCredits != other.courseCredits) {
return false;
}
if (Double.doubleToLongBits(this.courseCost) != Double.doubleToLongBits(other.courseCost)) {
return false;
}
if (!Objects.equals(this.department, other.department)) {
return false;
}
return true;
}

@Override
public String toString() {
return "Course{" + "department=" + department + ", courseNumber=" + courseNumber + ", courseCredits=" + courseCredits + ", courseCost=" + courseCost + '}';
}

}