package lesson_9;

public class Payment {
    private final Item[] items;
    private int itemCount;

    public Payment(int maxItems) {
        items = new Item[maxItems];
        itemCount = 0;
    }

    public void addItem(String name, double price, int quantity) {
        if (itemCount < items.length) {
            items[itemCount++] = new Item(name, price, quantity);
        } else {
            System.out.println("Корзина полная!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].totalPrice();
        }
        return total;
    }

    public void Receipt() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
        System.out.println("Всего: " + calculateTotal() + "$");
    }

    private static class Item {
        private final String name;
        private final double price;
        private final int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double totalPrice() {
            return price * quantity;
        }

        @Override
        public String toString() {
            return name + " " + price + "$" + ", штук " + quantity + " всего " + totalPrice() + "$";
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment(5);

        payment.addItem("Яблоко", 1, 8);
        payment.addItem("Апельсин", 2, 6);
        payment.addItem("Ананас", 3, 5);

        payment.Receipt();
    }
}
