package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_introduce_when_school_has_class_and_student_call_start(){
        Klass klass=new Klass(1);
        Student bob = new Student(1, "Bob", 18);
        bob.join(klass);
        School school=new School(klass);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am in class 1.");
    }
}
