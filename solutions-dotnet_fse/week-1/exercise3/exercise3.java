import java.util.*;

class Product {
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void display() {
        System.out.println("Product: " + name + " | Category: " + category);
    }
}

class ECommercePlatform {
    private List<Product> products;

    public ECommercePlatform() {
        products = new ArrayList<>();
        // Adding sample products
        products.add(new Product("iPhone 14", "Electronics"));
        products.add(new Product("Samsung Galaxy", "Electronics"));
        products.add(new Product("AirPods Pro", "Accessories"));
        products.add(new Product("Nike Sneakers", "Footwear"));
        products.add(new Product("MacBook Pro", "Laptops"));
        products.add(new Product("Boat Headphones", "Accessories"));
    }

    public void searchProduct(String keyword) {
        System.out.println("\n Searching for: " + keyword);
        boolean found = false;

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No products found matching: " + keyword);
        }
    }
}

public class ECommerceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECommercePlatform platform = new ECommercePlatform();

        System.out.print("Enter product name to search: ");
        String input = sc.nextLine();

        platform.searchProduct(input);
        sc.close();
    }
}

