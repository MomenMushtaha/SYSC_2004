package Assignments.SYSC2004A5;

public class LabCourse extends Course {

LabCourse(String department, int courseNumber, int courseCredits) {
super.setCourseCost((courseCredits / 2 * 500) + 100);
}

@Override
public String toString() {
return super.toString(); //To change body of generated methods, choose Tools | Templates.
}

@Override
public boolean equals(Object obj) {
return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
}

@Override
public int hashCode() {
return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
}

@Override
public void setCourseCost(double courseCost) {
super.setCourseCost(courseCost); //To change body of generated methods, choose Tools | Templates.
}

@Override
public double getCourseCost() {
return super.getCourseCost(); //To change body of generated methods, choose Tools | Templates.
}

@Override
public void setCourseCredits(int courseCredits) {
super.setCourseCredits(courseCredits); //To change body of generated methods, choose Tools | Templates.
}

@Override
public int getCourseCredits() {
return super.getCourseCredits(); //To change body of generated methods, choose Tools | Templates.
}

@Override
public void setCourseNumber(int courseNumber) {
super.setCourseNumber(courseNumber); //To change body of generated methods, choose Tools | Templates.
}

@Override
public int getCourseNumber() {
return super.getCourseNumber(); //To change body of generated methods, choose Tools | Templates.
}

@Override
public void setDepartment(String department) {
super.setDepartment(department); //To change body of generated methods, choose Tools | Templates.
}

@Override
public String getDepartment() {
return super.getDepartment(); //To change body of generated methods, choose Tools | Templates.
}

}