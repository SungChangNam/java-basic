package static2;

import static1.Data3;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();


        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        System.out.println();



        //추가
        //인스턴스를 통한 접근
        DecoData data3 =new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
