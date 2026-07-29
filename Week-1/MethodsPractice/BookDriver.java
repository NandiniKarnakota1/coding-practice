package MethodsPractice;
public class BookDriver {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.name = "Guru Charithra";
        b1.author = "Vasudevananda Saraswati";
        b1.price = 500;
        b1.printBookDetails();

        Book b2 = new Book();
        b2.name = "Guru Charithra";
        b2.author = "Gangadhara Saraswati";
        b2.price = 500;
        b2.printBookDetails();

        /*
        Disadvantage -> More lines of code.
         */
    }
}
