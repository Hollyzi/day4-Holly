package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    public static final String NOT_IN_CLASS = "It is not one of us.";
    private Integer number;
    private Person Leader;

    private List<Person> members;
    private Person member;

    public Klass(Integer number){
        this.number=number;
        this.member=member;
        this.members=new ArrayList<>();
    }

    public Integer getNumber() {
        return number;
    }

    public Person getLeader() {
        return Leader;
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
        return Leader==null?false:Leader.equals(student);
    }

    public List<Person> getMembers() {
        return members;
    }

    public Person getMember() {
        return member!=null?member:null;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == this) {
            this.Leader = student;
            if(this.member!=null){
                String attachComment= String.format("I am %s, %s of Class %d. I know %s become Leader.",
                        member.name,
                        member.role,
                        this.getNumber(),
                        this.getLeader().name);
                System.out.println(attachComment);
            }
        } else {
            System.out.println(NOT_IN_CLASS);
        }
    }

    public void attach(Person person) {
        this.member=person;
        this.members.add(person);

    }
}
