package Module3_Assignments;

public class Mod3Last {
    public static void main(String[] args) {
        Mod3Last mod3Last = new Mod3Last();
        //mod3Last.revPyramid(6);
        mod3Last.sumCalc();


    }

    public void revPyramid(int rows) {


        for (int i = 1; i <= rows; i++) {

            for (int j = i; j <= rows; j++) {


               System.out.print("*" + " ");


            }

            System.out.println();
        }

    }

    public void sumCalc () {

        int min = 1, max = 3, sum = 0;

        for (int i = min; i <= max; i++ ) {
            sum = sum + i;

        }

        System.out.println(sum);

        }


    }


