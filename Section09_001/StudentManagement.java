package Section09_001;

import java.util.Scanner;

public class StudentManagement {
    private String id;
    private String studentName;
    private int studentAge;
    private String major;

    //default contructor
    public StudentManagement() {
    }

    //contructor
    public StudentManagement(String id, String studentName, int studentAge, String major) {
        this.id = id;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.major = major;
    }

    //setter getter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhap vao ID:");
        this.id = scanner.nextLine();
        System.out.println("Nhap vao studentName:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhap vao studentAge:");
        this.studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao major:");
        this.major = scanner.nextLine();
    }

    public void display(){
        System.out.println("ID: " + this.id);
        System.out.println("StudentName: " + this.studentName);
        System.out.println("StudentAgae: " + this.studentAge);
        System.out.println("Student Major: " + this.major);
    }
}
