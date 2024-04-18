package Module3_Assignments;

public class Mod3Assignment2Review {
    public static void main(String[] args) {
        Mod3Assignment2Review mod3Assignment2Review = new Mod3Assignment2Review();
        mod3Assignment2Review.countNumsInRange();


    }

    public void countNumsInRange () {

        int sum = 0, a = 1, b = 3;

        for (int i = a; i <= b; i++) {
            sum = sum + i;

        }

        System.out.println("Sum is " + sum);

    }

}
