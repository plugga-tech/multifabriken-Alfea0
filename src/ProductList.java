public class ProductList {
    private List<Product> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    // Lägg till en produkt i listan
    public void addProduct(Product product) {
        products.add(product);
    }

    // Visa alla produkter
    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Hämta alla produkter
    public List<Product> getProducts() {
        return products;
    }
    
}
