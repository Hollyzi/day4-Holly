package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    List<Klass> klasses;
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        klasses=new ArrayList<>();
    }

    public String introduce() {
//        klasses.stream().
//                collect(Collectors.joining(", ");
        return klasses.stream()
                .mapToInt(klass -> klass.getNumber())
                .toString();
//       return super.introduce()+ " I am a teacher. I teach Class ";
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