package oo;

public class Student extends Person{
    public static final String ROLE_INTRODUCTION = " I am a student.";
    public static final String CLASS_INTRODUCTION = " I am in class %d.";
    public static final String LEADER_INTRODUCTION = " I am the leader of class %d.";
    public static final String DOT = ".";
    public static final String STUDENT = "student";
    private Klass klass;


    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
        role= STUDENT;
    }

    public String introduce() {
        String roleIntroduction=String.format(ROLE_INTRODUCTION,this.role);
        String classIntroduction=this.klass==null?"":String.format(CLASS_INTRODUCTION,klass.getNumber());
        String leaderIntroduction= this.getKlass().isLeader(this)
                ? String.format(LEADER_INTRODUCTION,klass.getNumber())
                : classIntroduction;
        return super.introduce()+ roleIntroduction + leaderIntroduction;
    }

    public Klass getKlass() {
        return klass;
    }

    public boolean isIn(Klass klass){
        return this.klass==klass;
    };

    public void join(Klass klass){
        this.klass=klass;
        klass.attach(this);
    };


}
