import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);
        while(true) {
         System.out.println("1. Add Product");
            System.out.println("2. Make a Sale");
            System.out.println("3. Display Products");
            System.out.println("4. Modify Product");
            System.out.println("5. Search product ");
            System.out.println("6. Remove Product");
            System.out.println("0. Exit");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;
                case 3:
                    shop.displayProducts();
                    break;
                case 4:
                    shop.modifyProduct();
                    break;
                case 5:
                    shop.searchProductById();
                    break;
                case 6:
                    shop.removeProduct();
                    break;
                case 0:
                   System.exit(0);
                   break;
                default:
                System.out.println("Invalid choice");
            }
        }
    }
}