import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private double price;
    private Publisher publisher;

    public Book(String title, double price, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {  // Fixed method name to getPrice
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Publisher: " + (publisher != null ? publisher.getName() : "Unknown"));
    }
}

class Literature extends Book {
    public Literature(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}

public class Publish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        Publisher publisher1 = new Publisher("Publisher A");
        Publisher publisher2 = new Publisher("Publisher B");

        books.add(new Literature("Literature Book1", 20.99, publisher1));
        books.add(new Fiction("Literature Book2", 18.50, publisher2));
        books.add(new Fiction("Fiction Book1", 15.99, publisher1));
        books.add(new Literature("Fiction Book2", 12.99, publisher2));

        System.out.print("Enter the category (Literature/Fiction): ");
        String category = sc.nextLine();  // Taking category as input from the user

        System.out.println("Books in the " + category + " category:");
        for (Book book : books) {
            if ((category.equalsIgnoreCase("Literature") && book instanceof Literature)
                    || (category.equalsIgnoreCase("Fiction") && book instanceof Fiction)) {
                book.display();
                System.out.println();
            }
        }
        sc.close();  // Correctly closing the Scanner
    }
}
