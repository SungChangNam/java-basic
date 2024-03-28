package class1.ex;

public class ProductOderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.ProductName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.ProductName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.ProductName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        int totalAmount =0;
        ProductOrder[] prod = new ProductOrder[]{dubu, kimchi, coke};
        for (ProductOrder productOrder : prod) {
            System.out.println("상품명 :" +productOrder.ProductName +", 가격" + productOrder.price +", 수량: "+productOrder.quantity);
            totalAmount += productOrder.price * productOrder.quantity;
        }

        System.out.println("totalAmount:" + totalAmount);
        }

    }

