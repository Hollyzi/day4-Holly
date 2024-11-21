package oo;

public class Person {
    private String name;
    private Integer id;
    private Integer age;

    public Person(Integer id,String name,Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String introduce(){
    return String.format("My name is %s. I am %d years old.",name,age);
    }
}
