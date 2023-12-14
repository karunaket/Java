import java.util.ArrayList;
import java.util.Collections;

public class SupermarketProductList {
    public static void main(String[] args) {
        ArrayList<String> productList = new ArrayList<>();

        productList.addAll(List.of("Bread", "Milk", "Eggs", "Cheese", "Fruits"));
        productList.addAll(List.of("Vegetables", "Snacks", "Juice"));
        productList.remove("Milk");

        System.out.println("Total count of products: " + productList.size());

        System.out.println("Product names in reverse order:");
        Collections.reverse(productList);
        productList.forEach(System.out::println);

        productList.clear();
        System.out.println("Product list cleared. Total count: " + productList.size());

        String targetProduct = "Bread";
        int position = productList.indexOf(targetProduct);

        System.out.println((position != -1) ? (targetProduct + " found at position: " + position) : (targetProduct + " not found in the productList."));

    }
}