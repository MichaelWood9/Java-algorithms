package Practical11;

public class Student {
    String studentID;

    public Student(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}';
    }


}
