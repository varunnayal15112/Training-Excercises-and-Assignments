package ArrayImplementation;

import java.util.Scanner;
import java.util.ArrayList;

class StudentRecord {
    private int studentID;
    private String studentName;
    private String departmentName;
    private Scanner scan = new Scanner(System.in);

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void getStudentRecord() {
        System.out.print("Enter Student ID : ");
        studentID = scan.nextInt();
        System.out.print("Enter Student Name : ");
        scan.nextLine();
        studentName = scan.nextLine();
        System.out.print("Enter Student Department Name : ");
        departmentName = scan.nextLine();
    }

    public void displayStudentRecord() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Department Name : " + departmentName);
    }

    public String toString() {
        return "[Student Name : "+ this.studentName + " Student ID : " + this.studentID + " Department Name : " + this.departmentName + "]";
    }
}
public class ArrayListImplementation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<StudentRecord> recordDatabase = new ArrayList<StudentRecord>();
        int numberOfRecords;
        System.out.println("Enter number of records : ");
        numberOfRecords = scan.nextInt();

        for(int i=0;i<numberOfRecords;i++) {
            StudentRecord rec = new StudentRecord();
            rec.getStudentRecord();
            recordDatabase.add(rec);
        }
        for(int i=0;i<numberOfRecords;i++) {
            System.out.println("Record : " + (i+1) + "\n" + recordDatabase.get(i).toString());
        }
        scan.close() ;
    }
}
