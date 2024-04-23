package static2;

public class DecoData {
    private  int instanceValue;
    public  static  int staticValue;


    public static void staticCall(){
        //instanceValue; // 인스턴스 변수 접근, compile error
        //instanceMethpod(); // 인스턴스 메서드 접근. compile error
        staticValue++;// 정적 변수 접근
        staticeMethod();// 정적 메서드 접근

    }




    public void instanceCall(){
        instanceValue ++; // 인스턴스 변수 접근
        instanceMethpod(); // 인스턴스 메서드 접근

        staticValue++;// 정적 변수 접근
        staticeMethod();// 정적 메서드 접근

    }
    private void instanceMethpod(){
        System.out.println("instnaceValue" + instanceValue);

    }
    private  static void staticeMethod(){
        System.out.println("staticValue "+staticValue);

    }
}
