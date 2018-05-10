import com.sun.prism.paint.Color;

public class Main {

    /*class Enum{
        public static ATM atm = new ATM();
        public static ALFAMART alfamart = new ALFAMART();
    }*/

    enum Payment{
        ATM("01"), ALFAMART("04"), GOPAY("09"), CREDIT("10");

        String payCode;
        Payment(String payCode) {
            this.payCode = payCode;
        }
        public String getPayCode() {
            return payCode;
        }
    }

    public static void main(String[] args) {
        sendTransaction("{}", Payment.ATM);
    }

    static void sendTransaction(String data, Payment payment){
        //http://api.ecommerce.id?data=json&payment=01

        String code = payment.getPayCode();
//        String code;
//        switch (payment){
//            case ATM:
//                code = "01";
//                break;
//            case ALFAMART:
//                code = "04";
//                break;
//            case GOPAY:
//                code = "09";
//                break;
//            case CREDIT:
//                code = "10";
//                break;
//            default:
//                code = null;
//        }
//
//        if(payment == Payment.ATM){
//
//        }

        System.out.println("CODE : "+code);
    }
}
