package oo;

import java.util.Objects;

public class Person {
    protected String name;
    protected Integer id;
    protected Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return  Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }
}
