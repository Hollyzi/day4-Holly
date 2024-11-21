package oo;

public class School {
    private Klass klass;
    public void startSchool() {
        System.out.println(klass.getMember().introduce());
    }
    public School(Klass klass){
        this.klass=klass;
    }
}
