class Product {
    int pcode;
    String pname;
    double price;

    
    Product(int code, String name, double pr) {
        pcode = code;
        pname = name;
        price = pr;
    }

    
    void display() {
        System.out.println("Product code: " + pcode);
        System.out.println("Product name: " + pname);
        System.out.println("Product price: " + price);
    }

    public static void main(String[] args) {   
        
        Product p1 = new Product(1, "Apple", 10.0);
        Product p2 = new Product(2, "Orange", 20.0);
        Product p3 = new Product(3, "Cherry", 30.0);

        System.out.println("Product details:");
        
        
        p1.display();
        p2.display();
        p3.display(); 

        
        Product lowest;
        if (p1.price < p2.price && p1.price < p3.price)
            lowest = p1;
        else if (p2.price < p3.price)
            lowest = p2;
        else
            lowest = p3;

        
        System.out.println("\nProduct with the lowest price:");
        lowest.display();
    }
}
