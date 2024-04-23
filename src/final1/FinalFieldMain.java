package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInt constructInt1 = new ConstructInt(10);
        ConstructInt constructInt2 = new ConstructInt(20);

        System.out.println(constructInt1.value);
        System.out.println(constructInt2.value);

        //field 필드 -필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInt1= new FieldInit();
        FieldInit fieldInt2= new FieldInit();
        FieldInit fieldInt3= new FieldInit();
        System.out.println(fieldInt1.value);
        System.out.println(fieldInt2.value);
        System.out.println(fieldInt3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);


    }

}
