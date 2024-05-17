package Day10.Interface_Task;

import java.io.Serializable;

public class Student implements Mark, Serializable, Comparable<Student> {

    private int rollNo;
    private String name;
    private int mark;

    public Student() {
    }

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public int showRollNo() {
        return rollNo;
    }

    @Override
    public int compareTo(Student student) {
        if (this.mark > student.mark) {
            return 1;
        } else if (this.mark < student.mark) {
            return -1;
        } else {
            return 0;
        }
    }

}