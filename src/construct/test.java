package construct;

public class test {
    public static void main(String[] args) {


        for (int i = 0; i<2; i++){
            System.out.println("First for start" + i);
            for(int j = 0; j <3; j++){
                System.out.println("-> iner for" + i +"-"+j);
            }
            System.out.println("out for is over i: "+i);
            System.out.println();
        }
    }
}
