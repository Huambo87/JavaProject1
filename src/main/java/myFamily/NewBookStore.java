package myFamily;

public class NewBookStore {
    public static void main(String[] args) {
        NewBookStore newBookStore = new NewBookStore();
        newBookStore.newBookStore_("The Winter of Our Discontent", "John Steinbeck", 525, 10.25, true);
        newBookStore.newBookStore_("The The Godfather", "Mario Puzo", 527, 15.25, false);
        newBookStore.newBookStore_("Mowgli", "Rudyard Kipling", 560, 10.00, true);


    }

    public void newBookStore_(String bookTitle, String bookAuthor, int titleID, double priceUSD, boolean isAvailable) {

        double exchangeRate = 1.30;
        double priceCAD = priceUSD * exchangeRate;

        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Index: " + titleID);
        System.out.println("Price in USD: " + priceUSD);
        System.out.println("Price in CAD: " + priceCAD);


        if (isAvailable) {

            System.out.println("The Book is Available in Store");

        }

        else {

            System.out.println("The Book is Available Online");
        }

        System.out.println(" ");

    }


}





