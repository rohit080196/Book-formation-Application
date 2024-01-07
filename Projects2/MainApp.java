package Projects2;



import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();

    public static void main(String[] args) {
        for (int i = 0; ; i++)
        {
            System.out.println("1.add book");
            System.out.println("2.display book");
            System.out.println("3.delete book");
            System.out.println("4.update book");
            System.out.println("5.restore book");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addBook();
                    break;
                case 2:
                    service.displayBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    updateprice();
                case 5 :
                    restorebookBook();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }

        }


        }
    public static void addBook()
    {
        System.out.println("ENTER BOOK ID");
        int id = sc.nextInt();
        System.out.println("ENTER BOOK NAME");
        String name = sc.next();
        System.out.println("ENTER BOOK  AUTHOR");
        String author = sc.next();
        System.out.println("ENTER BOOK PRICE");
        double price = sc.nextDouble();
        Book b1 = new Book(id,name,author,price);
        service.addBook(b1);

    }
   public static void deleteBook(){
        System.out.println("ENTER ID");
        int id = sc.nextInt();

       service.deleteBook(id);
    }
    public static void updateprice()
    {
        System.out.println("ENTER THE BOOK ID");
        int id = sc.nextInt();
        System.out.println("ENTER THE BOOK NEW PRICE");
        double newprice = sc.nextDouble();

        service.updatePrice(id,newprice);
    }
    public static void restorebookBook(){
       System.out.println("ENTER ID");
       int id = sc.nextInt();

        service.restoreBook(id);
   }

}
