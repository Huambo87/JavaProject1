package Module3_Assignments;

public class Mod3Assignment3 {
    public static void main(String[] args) {
        Mod3Assignment3 mod3Assignment3 = new Mod3Assignment3();
        //mod3Assignment3.straightPyramid(9);
        //mod3Assignment3.straightPyramidStars(9);
        //mod3Assignment3.reversePyramid(9);
        //mod3Assignment3.reversePyramidYes(9);
        mod3Assignment3.reversePyramidStars();


    }

    public void straightPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void straightPyramidStars(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void reversePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void reversePyramidYes(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("Yes" + " ");
            }
            System.out.println();
        }

    }

    public void reversePyramidStars() {
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j<=i; j++){
                System.out.print("*" + " ");

            }

            System.out.println( );

        }


    }

}



