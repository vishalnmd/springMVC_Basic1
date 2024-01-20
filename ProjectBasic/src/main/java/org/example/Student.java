package org.example;

public class Student
{
    private String firstN;
    private String lastN;
    private String address;

    public Student() {
        super();
    }

    public Student(String firstN, String lastN, String address) {
        this.firstN = firstN;
        this.lastN = lastN;
        this.address = address;
    }


    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
