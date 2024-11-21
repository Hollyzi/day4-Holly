package oo;

import javax.management.relation.Role;

public class Student extends Person{
    public static final String ROLE_INTRODUCTION = " I am a student.";
    public static final String CLASS_INTRODUCTION = " I am in class %d.";
    public static final String DOT = ".";
    private Klass klass;


    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
        role="student";
    }

    public String introduce() {
        String classIntroduction=this.klass==null?"":String.format(CLASS_INTRODUCTION,klass.getNumber());
        return super.introduce()+ ROLE_INTRODUCTION +classIntroduction;
    }

    public Klass getKlass() {
        return klass;
    }

    public boolean isIn(Klass klass){
        return this.klass==klass;
    };

    public void join(Klass klass){
        this.klass=klass;
    };


}
