package Module3_Assignments;

public class LastDigit2 {
    public static void main(String[] args) {
        LastDigit2 lastDigit2 = new LastDigit2();
        lastDigit2.lastDigit(27, 15);

    }

    public void lastDigit (int a, int b) {

        if (a % 10 == b % 10) {

            System.out.println("Same Last Digit - True");
        }

        else {

            System.out.println("Same Last Digit - False");


        }


    }

}
