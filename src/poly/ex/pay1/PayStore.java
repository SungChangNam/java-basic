package poly.ex.pay1;

public  abstract class PayStore {


    public  static Pay findePay (String option){

        //변화는 부분
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }else if (option.equals("newPay")) {
            return new NewPay();
        } else {
            return new DeFaultPay();

        }


    }
}
