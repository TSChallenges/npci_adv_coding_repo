import java.util.function.Function;

public class ServiceOperations {

    public static void main(String[] args) {

        ServiceCharge basicCharge = num -> num + ( num / 10);
        ServiceCharge advCharge = num -> num + ( num / 20);
        ServiceCharge premiumCharge = num -> num + ( num / 10) + 2;

        String serviceType = "PREMIUM";

        int amount = 1000;
        int finalCharges = 0;

        if (serviceType.equals("BASIC")){
            finalCharges = basicCharge.calculate(amount);
        }else
        if (serviceType.equals("ADVANCE")){
            finalCharges = advCharge.calculate(amount);
        }else
        if (serviceType.equals("PREMIUM")){
            finalCharges = premiumCharge.calculate(amount);
        }

        System.out.println("Service Charge = " + finalCharges);


//        BasicCharges basicCharges = new BasicCharges();
//        basicCharges.calculate(amount);


    }
}
