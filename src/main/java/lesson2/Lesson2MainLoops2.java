package lesson2;

public class Lesson2MainLoops2 {
    public static void main(String[] args) {
        Lesson2MainLoops2 lesson2MainLoops2 = new Lesson2MainLoops2();
        //lesson2MainLoops2.countNumbers(10);
        //lesson2MainLoops2.countNumbersFor();
        lesson2MainLoops2.numbersPyramid(9);

    }

    public void countNumbers(int i) {

        while (i<=100) {

            System.out.println(i);
            i = i + 1;
        }

    }

    public void countNumbersFor (){

        for (int i = 0; i<=100; i = i+10) {
            System.out.println(i);
        }

    }

    public void numbersPyramid (int rows) {
        for (int i = 1; i<=rows; i++) {

            if (i % 2 == 0) {
                continue;
        }
            for (int j = 1; j <= i; j++){

                if (j % 2 == 0) {

                    continue;

                }

                System.out.print(j + " ");
            }
            System.out.println();


        }


    }

}
