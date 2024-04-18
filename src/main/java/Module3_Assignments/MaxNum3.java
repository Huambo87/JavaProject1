package Module3_Assignments;

public class MaxNum3 {
    public static void main(String[] args) {
        MaxNum3 maxNum3 = new MaxNum3();
        maxNum3.maxNum(130, 26, 500);

    }

    public void maxNum(int a, int b, int c) {

        if (a > c) {
            if (a > b) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        else {
            System.out.println(c);
        }
    }
}






