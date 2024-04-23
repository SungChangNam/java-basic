package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final  int data1;
        data1 =10;
        //data1 = 20;


        //final 지역번수2
        final int daata2=10;
        //daata2 =20; 컴파일 오류

        method(10);


    }
    static void method(final int prameter) {
        //prameter=20; 컴파일 오류

    }

}
