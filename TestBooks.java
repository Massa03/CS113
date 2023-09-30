import java.util.Scanner;

public class TestBooks {
    public static void main(String[] args) {
        // create 2 books
        // Book book1 = new Book(2, "name");
        // Book book2 = new Book(3, "name2");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of books you want to review:");
        int numBooks = input.nextInt();
        //
        Book bookList[] = new Book[numBooks];
        String name;
        for(int i =0; i<numBooks;i++){
            System.out.print("Enter publisher Informantion: ");
            name = input.next();
            int rand = (int) (Math.random() * 99) + 1;
            bookList[i] = new Book(rand,name);
        }
        int maxPages = -1;
        String maxPub ="";
        int sumPage = 0;
        for(int i =0; i<numBooks;i++){
            if(bookList[i].getPages()>maxPages){
                maxPages=bookList[i].getPages();
                maxPub=bookList[i].getPublisher();
            }
            sumPage= sumPage+bookList[i].getPages();
        }
        int avgPage= sumPage/numBooks;
        System.out.println("Most Pages: " + maxPages + " Publisher: "+ maxPub +" Average Pages: " + avgPage);




        //System.out.println(numBooks);
        // System.out.println("Publisher name:");
        // String strPub = input.nextLine();
        // System.out.println(strPub);

        // while (numBooks) {
        //     //int rand = (int) (Math.random() * 99) + 1;
        //     int randPages = pages.rand();
        // }

    }
}