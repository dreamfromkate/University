package ru.university;

import ru.university.classDir.Faculty;
import ru.university.classDir.Group;
import ru.university.classDir.Student;
import ru.university.enumDir.FacultyEnum;

public class Main {
    public static void main(String[] args) {
        Faculty rtf = new Faculty(FacultyEnum.rtf);

        Group first = new Group("150004");
        Group second = new Group("240013");

        rtf.addGroup(first);
        rtf.addGroup(second);

        Student st1 = new Student("Popov", 2.2F);
        Student st2 = new Student("Sidorov", 3.3F);
        Student st3 = new Student("Shik", 4.4F);
        Student st4 = new Student("Kontur", 5.0F);

        Student st5 = new Student("Radik", 3.2F);
        Student st6 = new Student("Pavel", 4.5F);
        Student st7 = new Student("Andrey", 3.8F);
        Student st8 = new Student("Max", 4.1F);

        first.addStudent(st1);
        first.addStudent(st2);
        first.addStudent(st3);
        first.addStudent(st4);

        second.addStudent(st5);
        second.addStudent(st6);
        second.addStudent(st7);
        second.addStudent(st8);

        rtf.printAvgMark();

    }
}