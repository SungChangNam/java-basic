package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1=creatStudent("student1", 15, 90);
        System.out.println("student1= " +student1);
        Student student2=creatStudent("student2", 17, 80);
        System.out.println("student2= " +student2);

        printStudent(student1);
        printStudent(student2);

    }
    static Student creatStudent(String name, int age, int grade){
        Student student = new Student(); //x001
        System.out.println("student= " +student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001
    }


    static void printStudent (Student student){
        System.out.println("name : "+student.name + " age : " +student.age+" grade: "+ student.grade);
    }
}
