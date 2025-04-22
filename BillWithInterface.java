interface Billable{
    double calculate();
}
class Product implements Billable{
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(int id, String productName, int qty, double price){
        productId = id;
        name = productName;
        quantity = qty;
        unitPrice = price;
    }
    public double calculate(){
        return quantity * unitPrice;
    }
    public void displayProduct(){
        System.out.prinf("%-10d%-10s%-10d%-15.2f%-10.2f%n", productId, name, quantity, unitPrice, calculate());
    }
}

public class BillWithInterface{
    public static void main(String[] args){
        Product product1 = new Product(101, "A", 2, 25.0);
        Product product2 = new Product(102, "B", 1, 100.0);

        dobule netAmount = product1.calculate() + product2.calculate()

        System.out.println("Order No. Date: ");
        System.out.println("Product Id  Name  Quantity  Unit Price  Total");
        product1.displayProduct();
        product2.displayProduct();
        System.out.printf("%-50s%-10.2f%n", "Net Amount", netAmount);
    }
}
