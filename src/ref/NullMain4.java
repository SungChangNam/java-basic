package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigDAta.count ="+ bigData.count); //0
        System.out.println("bigDAta.data ="+ bigData.data); //null

        //NullPointerException
        System.out.println("bigDAta.data.value =" + bigData.data.value); //0

    }
}
