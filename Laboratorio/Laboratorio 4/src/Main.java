public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        store.addProduct(new Accessory("Mouse", 25.0));
        store.addProduct(new Accessory("Keyboard", 45.0));

        // Aplicar un descuento del 10%
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        // Aplicar un descuento fijo de $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);

        // Aplicar un descuento variable del 20% para productos electrónicos y 15% para accesorios
        Discountable variableDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.8;
            } else if (product instanceof Accessory) {
                return product.getPrice() * 0.85;
            }
            return product.getPrice();
        };
        store.applyDiscount(variableDiscount);

        // Aplicar un descuento combinado: 10% y luego $5 adicionales
        Discountable combinedDiscount = product -> {
            Double discountedPrice = product.getPrice() * 0.9;
            return discountedPrice - 5.0;
        };
        store.applyDiscount(combinedDiscount);
    }
}