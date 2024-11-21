package oo;

import java.util.Objects;

public class Klass {
    public static final String NOT_IN_CLASS = "It is not one of us.";
    private Integer number;
    private Person Leader;

    public Klass(Integer number){
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public boolean isLeader(Student student){
        return Leader.equals(student);
    }


    public void assignLeader(Student student) {
        if (student.getKlass() == this) {
            this.Leader = student;
        } else {
            System.out.println(NOT_IN_CLASS);
        }
    }
}
