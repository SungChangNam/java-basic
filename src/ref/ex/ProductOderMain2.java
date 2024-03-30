package ref.ex;



public class ProductOderMain2 {

    public static void main(String[] args) {

        ProductOder[] orders = new ProductOder[3];


        orders[0] = createOder("두부",2000,2);
        orders[1]= createOder("김치",5000,1);
        orders[2] = createOder("콜라",1500,2);

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
