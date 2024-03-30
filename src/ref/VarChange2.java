package ref;

public class VarChange2 {
    public static void main(String[] args) {

        // 참조형 데이터는 참조값을 갖고 오기 뗴문에
        // 참조값이 변경되면 참조됨 모든 값이 변경됨
        Data dataA =new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값" +dataA );
        System.out.println("dataB 참조값" +dataB );
        System.out.println("dataA.Value " +dataA.value );
        System.out.println("dataB.Value " +dataB.value );

        //dataA변경
        dataA.value = 20;
        System.out.println("변경 dataA.Value  = 20" );
        System.out.println("dataA.Value " +dataA.value );
        System.out.println("dataB.Value " +dataB.value );


        //dataB변경
        dataB.value = 30;
        System.out.println("변경 dataA.Value  = 30" );
        System.out.println("dataA.Value " +dataA.value );
        System.out.println("dataB.Value " +dataB.value );



    }
}
