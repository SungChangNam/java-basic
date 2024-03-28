package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = new Student[]{student1,student2};

        for (int i=0; i < students.length; i++){
            System.out.println("name " + students[i].name + " age " + students[i].age + " graade " + students[i].grade );
        }
        for (int i=0; i < students.length; i++){
            Student s =students[i];
            System.out.println("name " + s.name + " age " + s.age + " graade " + s.grade );
        }
        for (Student s: students) {
            System.out.println("name " + s.name + " age " + s.age + " graade " + s.grade );
        }

    }

    public static class Student {
        String name;
        int age;
        int grade;
    }
}
