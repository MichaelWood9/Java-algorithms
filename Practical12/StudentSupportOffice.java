package Practical12;

import java.util.LinkedList;
import java.util.List;

public class StudentSupportOffice {


    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        List<Module> moduleList = new LinkedList<>();
        List<Grade> gradeList = new LinkedList<>();

        Student s1 = new Student("u1000000",0);
        Student s2 = new Student("u1100000",0);
        Module m1 = new Module("maths1",0);
        Module m2 = new Module("algoithms1",0);
        Grade G1 = new Grade(70,m1,s1);
        Grade G2 = new Grade(80,m1,s2);
        Grade G3 = new Grade(85,m2,s1);
        Grade G4 = new Grade(95,m2,s2);
        //System.out.println(G1);
        //System.out.println(s1);
        //s1.averageGrade =30;
        //System.out.println(s1);
        insert(gradeList,G1);
        insert(gradeList,G2);
        insert(gradeList,G3);
        insert(gradeList,G4);
        System.out.println(gradeList);
        //remove(gradeList,G1);
        System.out.println(gradeList);
        update(gradeList,G1,50);
        update(gradeList,G2,90);
        System.out.println(gradeList);
        studavg(gradeList);
        System.out.println(s1);
        System.out.println(s2);
        modavg(gradeList);
        System.out.println(m1);
        System.out.println(m2);



    }
    //the method below is and insert method
    //this method has a list as a paramter and a grade. the grade is then added to the list.
    public static void insert(List list,Grade grade){
        list.add(grade);
    }

    //the method below is a remove method
    // this method takes a list and a grade as a parameter and then adds the grade to the list
    public static void remove( List list,Grade grade){
        list.remove(grade);
    }

    //the method below is an update method
    // this method loops through an inputted list to find a inputted grade and then sets a score for that Grade.
    public static void update(List<Grade> list, Grade grade, int points){
        for (Grade g : list){
            if (g == grade){
                g.setScore(points);
            }
        }
    }
    //the method below studavg method this method updates the student average
    //the method takes a inputted list and loops through it and gets the student.
    //it then loops through the list and gets get grade for that student and then calculates the average then sets it
    public static void studavg(List<Grade> list){
        for(Grade g : list){
            int count =0;
            int total = 0;
            int avg = 0;
            Student s = (g.student);
            for(Grade f: list){
                if(f.student == s){
                    count++;
                    total = total+f.getScore();
                    avg = total/count;
                     s.setAverageGrade(avg);



                }

            }

        }

    }
    //the method below modavg this method updates the average grade of a module.
    //this method takes a list as a parameter it then loops through this list and gets the modules
    //it then loops through the list and gets the score for the module and then totals them and calculates the average grade.
    public static void modavg(List<Grade> list){
        for(Grade g : list){
            int count =0;
            int total = 0;
            int avg = 0;
            Module m = (g.modules);
            for(Grade f: list){
                if(f.modules == m){
                    count++;
                    total = total+f.getScore();
                    avg = total/count;
                    m.setAverageModuleGrade(avg);



                }

            }

        }
    }


}
