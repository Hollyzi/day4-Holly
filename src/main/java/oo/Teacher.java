package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    public static final String ROLEINTRODUCTION = " I am a teacher. ";
    public static final String CLASSINTRODUCTION = "I teach Class ";
    List<Klass> klasses;
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        klasses=new ArrayList<>();
    }

    public String introduce() {

        String klassString=  klasses.stream()
                .map(klass -> klass.getNumber().toString())
                .collect(Collectors.joining(", "))
            ;
        return super.introduce()+ROLEINTRODUCTION+CLASSINTRODUCTION+klassString+'.';
    }

    public void assignTo(Klass klass){
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass){
        return klasses.contains(klass);
    }

    public boolean isTeaching(Student student){
        return klasses.contains(student.getKlass());
    }
}