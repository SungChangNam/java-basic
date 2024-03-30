package ref.ex;


import java.util.Scanner;

public class ProductOderMain3 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOder[] orders =new ProductOder[n];
        for (int i= 0 ; i <orders.length; i++){
            System.out.println((i+1)+ "번쨰 주문정로를 입력하세요");

            System.out.print("삼풍명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOder(productName,price,quantity);
        }

        printOrders(orders);
        int totalAmount= getTotalAmount(orders);
        System.out.println("totalAmount:" + totalAmount);
    }
    static ProductOder createOder (String prodcutName, int price ,int quantity){
        ProductOder order= new ProductOder();
        order.ProductName =prodcutName;
        order.price = price;
        order.quantity =quantity;
        return order;
    }
    static  void printOrders(ProductOder[] oders){
        for (ProductOder oder : oders) {
            System.out.println("상품명 :" +oder.ProductName +", 가격" + oder.price +", 수량: "+oder.quantity);
        }

    }
    static int getTotalAmount(ProductOder[] oders){
        int totalAmount =0;
        for (ProductOder oder : oders) {
            totalAmount +=oder.price * oder.quantity;
        }
        return totalAmount;

    }
}
