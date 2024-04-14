package access.a;

public class AccessData {
    public int publiField;
    int defaultField;
    private int privatedField;

    public  void publicMethod(){
        System.out.println("PublicMethod 호출 " + publiField);
    }
    public  void defaultMethod(){
        System.out.println("PublicMethod 호출 " + defaultField);
    }
    private void privateMethod (){
        System.out.println("privateMethod 호출 "+privatedField);
    }
    public void  innerAccess(){
        System.out.println("내부 호출");
        publiField =100;
        defaultField =200;
        privatedField=300;
        privateMethod();
        defaultMethod();
        privateMethod();

    }
}
