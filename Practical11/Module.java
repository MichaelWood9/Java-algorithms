package Practical11;

import java.util.Arrays;

public class Module {


    String moduleID;
    int size;
    Student[] class1 = new Student[5];
    int count = 0;

    public Module(String moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Student[] getClass1() {
        return class1;
    }

    public void setClass1(Student[] class1) {
        this.class1 = class1;
    }




    @Override
    public String toString() {
        return "Module{" +
                "moduleID='" + moduleID + '\'' +
                ", size=" + size +
                ", class1=" + Arrays.toString(class1) +
                '}';
    }
// the method below is the enroll method
// it takes a student as a parameter and adds it to the class and adds one to the class size
    public void Enroll(Student stud) {
        class1[size] = stud;
        size = size + 1;


    }
//the method below is an unenroll method
// this method loops through the classlist and see if the student matches
// the inputted student and removes it from the list
    public void Unenroll(Student stud){
        count = 0;
        for (Student s : class1) {
            if (s == stud){
                class1[count] = null;
                size = size - 1;
            }
            count = count + 1;


        }
    }
//the method below prints the class list
// it print out the module and then loops through the list only printing out students in the list.
    public void printlist() {
        System.out.println(moduleID);
        for (Student s : class1) {
            if (s == null){

            }
            else{
                System.out.println(s);
            }
        }
        System.out.println("\n");
    }
}
