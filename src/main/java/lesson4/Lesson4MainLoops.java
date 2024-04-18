package lesson4;

public class Lesson4MainLoops {
    public static void main(String[] args) {
        Lesson4MainLoops loops = new Lesson4MainLoops();
  //      loops.countNumbers(-1.00);
        loops.countNumbers();


    }

    public void countNumbers(double d) {

        while (d<=10) {

            System.out.println(d);
            d=d+0.25;

        }

    }

    public void countNumbers() {

        for (double d = -10.00; d<=10.00; d++) {
            System.out.println(d);

        }


        }


    }


