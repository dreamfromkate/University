package ru.university.classDir;

import java.util.ArrayList;
import java.util.List;
import ru.university.enumDir.FacultyEnum;

public class Faculty {
    private List<Group> group;
    private FacultyEnum name;

    public Faculty(FacultyEnum faculty) {
        this.name = faculty;
        this.group = new ArrayList();
    }

    public FacultyEnum getName() {
        return this.name;
    }

    public void addGroup(Group group) {
        this.group.add(group);
    }
    public List<Group> getGroup() {
        return this.group;
    }

    public float avgFaculMark() {
        float sum = 0.0F;
        int count = 0;

        for(int i = 0; i < this.group.size(); i++) {
            sum += this.group.get(i).avgMark();

            if (this.group.get(i).avgMark() > 0.0F) {
                count++;
            }
        }

        return sum / count;
    }

    public void printFaculty() {
        System.out.println("Список групп факультета " + this.name.getTitle() + ":");

        for(int i = 0; i < this.group.size(); i++) {
            System.out.println(i + 1 + ". " + this.group.get(i).getNumberGroup());
        }

    }

    public void printAvgMark() {
        System.out.println("Список среднего балла по факультету " + this.name.getTitle() + ":");

        for(int i = 0; i < this.group.size(); i++) {
            System.out.println(i + 1 + ". " + this.group.get(i).getNumberGroup() + " - " + this.avgMark(i));
        }

        System.out.println("\nСредний балл успеваемости по факультету: " + this.avgFaculMark());
    }

    private float avgMark(int i) {
        return this.group.get(i).avgMark() > 0.0F ? this.group.get(i).avgMark() : 0.0F;
    }
}

