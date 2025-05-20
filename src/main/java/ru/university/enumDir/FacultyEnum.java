package ru.university.enumDir;

public enum FacultyEnum {
    rtf("ИРИТ-РтФ"),
    st("СтИ"),
    fti("ФТИ"),
    inmt("ИНМТ");

    private String title;

    public FacultyEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
