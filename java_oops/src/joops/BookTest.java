package joops;
import java.util.*;
class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Author Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Gender (M/F): ");
        char gender = sc.next().charAt(0);
        Author au = new Author(name, email, gender);
        sc.nextLine(); 
        System.out.println("\nEnter Book Details:");
        System.out.print("Book Name: ");
        String bookname = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Book b = new Book(bookname, au, price, quantity);
        System.out.println("\nBook Details:");
        System.out.println(b);

        sc.close();
    }
}

 
