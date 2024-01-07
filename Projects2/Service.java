package Projects2;

import java.util.ArrayList;

public class Service {
    ArrayList<Book> bookList = new ArrayList<>();
    {
        bookList.add(new Book(1011,"aaaa","mmmm",2467));
        bookList.add(new Book(1022,"bbbb","nnnn",738));
        bookList.add(new Book(1033,"cccc","oooo",1865));
        bookList.add(new Book(1044,"dddd","qqqq",120));
        bookList.add(new Book(1055,"eeee","pppp",200));
    };
    ArrayList<Book> recycleBin = new ArrayList<>();
    public void addBook(Book b)
    {
        bookList.add(b);
    }
    public void displayBook()
    {
        for(Book b : bookList)
        {
            System.out.println(b);
        }
    }
    public void deleteBook(int id)
    {
        for(int i = 0; i<bookList.size(); i++)
       {
           Book b1 = null;
            if(bookList.get(i).getBookId()== id)
                b1 = bookList.get(i);
               bookList.remove(i);
                recycleBin.add(b1);
        }
        System.out.println(recycleBin);
    }
    public void restoreBook(int id)
   {
        for(int i = 0 ; i <recycleBin.size(); i++)
       {
           if(recycleBin.get(i).getBookId() == id)
            {
                Book b1 = recycleBin.get(i);
               recycleBin.remove(i);
                bookList.add(b1);
            }
        }
    }
    public void updatePrice(int id,double newprice)
    {
        for(Book upb : bookList)
        {
            if(upb.getBookId() == id)
            {
                upb.setBookPrice(newprice);
            }
        }

    }


}
