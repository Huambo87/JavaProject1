package lesson2;

public class Lesson2MainLoops {

    public static void main(String[] args) {

        Lesson2MainLoops loops = new Lesson2MainLoops();
        //loops.countNumbers(1);
        //loops.countNumbers();
        loops.numbersTemplate(9);


    }

    public void countNumbers(int i) {

//      System.out.println(i);
//      System.out.println(i+1);
//      System.out.println(i+2);
//      System.out.println(i+3);

        while (i <= 100) {

            //System.out.println(i);
            i = i + 10;

        }

    }

    public void countNumbers() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }

    }

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            //           if (i % 2 == 0) {
            //             continue;
            //       }

            //if (i==7) {
            //  break;


            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();

        }

    }

}

    //1
    //1 2
    //1 2 3
    //1 2 3 4











