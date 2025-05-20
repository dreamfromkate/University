package ru.university.classDir;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private String numberGroup;

    public Group(String numberGroup) {
        this.numberGroup = numberGroup;
        this.students = new ArrayList();
    }

    public String getNumberGroup() {
        return this.numberGroup;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }

    public float avgMark() {
        float sum = 0.0F;

        for(int i = 0; i < this.students.size(); ++i) {
            sum += this.students.get(i).getQuantity();
        }

        return sum / this.students.size();
    }

    public int size() {
        return this.students.size();
    }
}

