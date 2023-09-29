package Practical11;

public class StudentSupportOffice {
    public static void main(String[] args) {
        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");

        Module m1 = new Module("CIS2344");
        Module m2 = new Module("CIS2360");
        Module m3 = new Module("CIM2130");


        m1.Enroll(s1);
        m1.Enroll(s4);

        m2.Enroll(s1);
        m2.Enroll(s3);
        m2.Enroll(s5);

        m3.Enroll(s3);
        m3.Enroll(s4);
        m3.Enroll(s5);

        m1.printlist();
        m2.printlist();
        m3.printlist();

        m1.Enroll(s2);
        m1.Enroll(s3);
        m1.Enroll(s5);

        m2.Enroll(s2);


        m2.Unenroll(s3);




        m3.Unenroll(s5);

        m3.Enroll(s1);



        m1.printlist();
        m2.printlist();
        m3.printlist();








    }


}
