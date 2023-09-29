package Practical12;

public class Module {
    String moduleID;
    int averageGrade;

    public Module(String moduleID, int averageModuleGrade) {
        this.moduleID = moduleID;
        this.averageGrade = averageModuleGrade;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public int getAverageModuleGrade() {
        return averageGrade;
    }

    public void setAverageModuleGrade(int averageModuleGrade) {
        this.averageGrade = averageModuleGrade;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleID='" + moduleID + '\'' +
                ", averageModuleGrade=" + averageGrade +
                '}';
    }
}
