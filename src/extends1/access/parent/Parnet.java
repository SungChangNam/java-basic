package extends1.access.parent;

public class Parnet {
    public int publicValue;
    protected  int protectedValue;

    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("parent.publicMethod");
    }
    protected  void protectedMethod(){
        System.out.println("parent.protectedMethod");
    }
    void defaultMethod(){
        System.out.println("parent.defaultMethod");
    }
    private void privateMethod(){
        System.out.println("parent.privateMethod");
    }

    public void printMethod (){
        System.out.println("==Parent inner method==");
        System.out.println("parentValue" +publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }

}