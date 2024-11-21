package oo;

import java.util.ArrayList;

public class School {
    private Klass klass;
    public void startSchool() {
       ArrayList<String> introduces=new ArrayList<String>();
       klass.getMembers().stream()
               .forEach(member->introduces.add(member.introduce()));
       System.out.println(introduces);
    }
    public School(Klass klass){
        this.klass=klass;
    }
}
