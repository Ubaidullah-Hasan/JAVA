package Encapsulation.StudentManagementSystem;

public class StudentManagementSystem {
    private String name;
    private String id;
    private double gpa;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }
}
