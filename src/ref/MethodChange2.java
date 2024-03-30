package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA =" + dataA.value);
        System.out.println("dataA =" + dataA);
        ChangeReference(dataA);
        System.out.println("메서드 호출 전: dataA =" + dataA.value);

    }

    public static void ChangeReference(Data dataX){
        System.out.println("dataX =" + dataX);
        dataX.value = 20;

    }
}
