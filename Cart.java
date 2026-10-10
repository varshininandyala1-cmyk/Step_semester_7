public class Cart {
    private final double[] prices;
    private final String cartId;
    private int count = 0;

    public Cart(String cartId, int size) {
        this.cartId = cartId;
        prices = new double[size];
    }

    public void addItem(double price) {
        if (price > 0 && count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        int itemCount = 0;

        for (int i = 0; i < count; i++) {
            itemCount++;
        }

        return itemCount;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}