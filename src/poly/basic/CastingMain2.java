package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly =new Child();
        // 단 자식의 기능은 호출할 수 없다

        //일시적 다운캐스등 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
