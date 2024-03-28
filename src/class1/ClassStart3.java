package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        ClassStart5.Student student1;
        student1 = new ClassStart5.Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;


        ClassStart5.Student student2 = new ClassStart5.Student();
        student2.name = "학생1";
        student2.age = 18;
        student2.grade = 80;



        System.out.println(student1);
        System.out.println(student2);
        System.out.println("name " + student1.name + " age " + student1.age + " graade " + student1.grade );
        System.out.println("name " + student2.name + " age " + student2.age + " graade " + student2.grade );

    }
}
