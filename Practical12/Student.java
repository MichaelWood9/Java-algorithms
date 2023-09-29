package Practical12;

public class Student {
    String studentID;
    int averageGrade;

    public Student(String studentID, int averageGrade) {
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

