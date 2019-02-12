package Interfaces;
import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
    int StudentRollNumber;
    String StudentName;

    Student(int rollNumber, String name) {
        this.StudentRollNumber = rollNumber;
        this.StudentName = name;
    }

    public String toString() {
        return "Student { " + " Roll Number : " + this.StudentRollNumber + " Name : " + this.StudentName + " }";
    }
}

class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.StudentRollNumber - b.StudentRollNumber;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a ,Student b) {
        return a.StudentName.compareTo(b.StudentName);
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        ArrayList<Student> record = new ArrayList<Student>();
        int numberOfRecords;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of records : ");
        numberOfRecords = scan.nextInt();
        for(int i=0;i<numberOfRecords;i++) {
            int roll;
            String name;
            System.out.println("Enter roll number of student : ");
            roll = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter name of student : ");
            name = scan.nextLine();
            record.add(new Student(roll,name));
        }

        System.out.println("Before Calling Sort() method status of records is : ");
        for(int i=0;i<numberOfRecords;i++) {
            System.out.println(record.get(i).toString());
        }

        System.out.println("Sorting records as per the student roll number : ");
        Collections.sort(record,new SortByRoll());
        for(int i=0;i<numberOfRecords;i++) {
            System.out.println(record.get(i).toString());
        }

        System.out.println("Sorting records as per the student name : ");
        Collections.sort(record,new SortByName());
        for(int i=0;i<numberOfRecords;i++) {
            System.out.println(record.get(i).toString());
        }
    }
}
