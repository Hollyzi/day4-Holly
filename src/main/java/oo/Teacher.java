package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    public static final String ROLEINTRODUCTION = " I am a %s.";
    public static final String CLASSINTRODUCTION = " I teach Class %s.";
    public static final String TEACHER = "teacher";
    List<Klass> klasses;
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        role= TEACHER;
        klasses=new ArrayList<>();
    }

    public String introduce() {

        String classIntroduction=this.klasses.size()==0?"":String.format(CLASSINTRODUCTION,getKlassString());
        String roleIntroduction=String.format(ROLEINTRODUCTION,this.role);
        return super.introduce()+roleIntroduction+classIntroduction;
    }

    public String getKlassString() {
        return  klasses.stream()
                .map(klass -> klass.getNumber().toString())
                .collect(Collectors.joining(", "));
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