package ru.university.classDir;

public class Student {
    private String fio;
    private float avg;

    public Student(String fio, float avg) {
        this.fio = fio;
        this.avg = avg;
    }

    public float getQuantity() {
        return this.avg;
    }

    public void setQuantity(float avg) {
        this.avg = avg;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
