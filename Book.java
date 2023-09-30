public class Book {
   // class book that gives the name of the publisher and the nums of pages and
   // compares two books
   // attributes/ data feild 
   private int pages;
   private String publisher;

   // default constructor
   public Book(int nums, String bookPub) {
      pages = nums;
      publisher = bookPub;
   }

   // getter

   public int getPages() {
      return pages;
   }

   public String getPublisher() {
      return publisher;
   }

   // setter
   public void setPages(int number) {
      pages = number;
   }

   public void setPublisher(String name) {
      publisher = name;
   }

   // toString method
   public String toString() {
      return publisher + "," + pages;
   }

   // equals method returns trye if both books have the same publisher and the same
   // num of pages
   public boolean equals(Book book2) {
      if ((pages == book2.getPages()) && (publisher == book2.getPublisher())) {
         return true;
      } else {
         return false;
      }
   }

   // compareTo method

   public int compareTo(Book book2) {
      if ((pages < book2.getPages())) {
         return -1;
      } else if ((pages > book2.getPages())) {
         return 1;
      } else {
         return 0;
      }

   }
}