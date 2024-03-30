package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        ClassStart5.Student student1 = new ClassStart5.Student();

        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;


        ClassStart5.Student student2 = new ClassStart5.Student();
        student2.name = "학생1";
        student2.age = 18;
        student2.grade = 80;


        ClassStart5.Student[] students = new ClassStart5.Student[2];
        students[0] = student1;
        students[1] = student2;



        System.out.println("name " + students[0].name + " age " + students[0].age + " graade " + students[0].grade );
        System.out.println("name " + students[1] .name + " age " + students[1] .age + " graade " + students[1] .grade );

    }

    public static class Student {
    }
}
