public class main {
    public static void main(String[] args) {
        double priceOfItem = 77.50;
        double SHIPPING_TAX = 0.02;
        double FREE_SHIPPING = 100.00;
        double shippingCost;
        double totalPrice;

        if (priceOfItem >= FREE_SHIPPING)
        {
            shippingCost = 0;
            totalPrice = shippingCost + priceOfItem;
            System.out.println("Shipping is free, the total price is " + totalPrice);
        }
        else
        {
            shippingCost = priceOfItem * SHIPPING_TAX;
            totalPrice = shippingCost + priceOfItem;
            System.out.println("The shipping cost is " + shippingCost + " dollars and the total price is " + totalPrice + " dollars.");
        }
    }
}
