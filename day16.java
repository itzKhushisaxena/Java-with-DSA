class human {
    public String name;

    human() {
    }

    human(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Human can eat");
    }

    public void dancehuman() {
        System.out.println("Human can dance");
    }
}
class teacher extends human{
    public int age;
    teacher(String name,int age) {
        super(name);
        this.age=age;
    }
    public void programmer() {
        System.out.println("I am a programmer");
    }

    @Override
    public void dancehuman() {
        System.out.println("Teacher can dance" + age);
    }
    }
public class day16{
    public static void main(String[] args) {
         human newhuman=new human("Vandana");
         newhuman.dancehuman();
         teacher newteacher=new teacher("neeraj",34);
         newteacher.dancehuman();
         human h1=new human("khushi");
         h1.eat();
         teacher t1=new teacher("neeraj",34);
         t1.programmer();
         human h2=new teacher("vandana",23);
         h2.eat();
         h2.dancehuman();

    }
}
