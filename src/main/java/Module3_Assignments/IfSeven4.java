package Module3_Assignments;

public class IfSeven4 {
    public static void main(String[] args) {
        IfSeven4 ifSeven4 = new IfSeven4();
        ifSeven4.ifSeven(3, 2);


    }

    public void ifSeven (int a, int b){
        if (a == 7 || b == 7 || (a+b) == 7) {

            System.out.println("If Seven? - True");

        }

        else {

            System.out.println("If Seven? - False");

        }


    }

}
