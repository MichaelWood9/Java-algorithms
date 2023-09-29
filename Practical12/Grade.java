package Practical12;




public class Grade {
    int Score;
    Module modules;
    Student student;

    public Grade(int score, Module modules, Student student) {
        Score = score;
        this.modules = modules;
        this.student = student;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public Module getModules() {
        return modules;
    }

    public void setModules(Module modules) {
        this.modules = modules;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "Score=" + Score +
                ", modules=" + modules +
                ", student=" + student +
                '}';
    }
}
