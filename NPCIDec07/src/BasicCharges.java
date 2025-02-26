public class BasicCharges implements ServiceCharge{

    @Override
    public int calculate(int amount) {
        return amount + (amount / 10);
    }
}
