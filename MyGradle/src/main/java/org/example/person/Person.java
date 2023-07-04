package org.example.person;

public class Person {
    private String fullName;
    private int years;

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Person{" +
               "fullName='" + fullName + '\'' +
               ", years=" + years +
               '}';
    }
}