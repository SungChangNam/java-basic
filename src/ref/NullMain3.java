package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigDAta.count ="+ bigData.count); //0
        System.out.println("bigDAta.data ="+ bigData.data); //null

        //NullPointerException
        System.out.println("bigDAta.count ="+ bigData.data.value); //0

    }
}
