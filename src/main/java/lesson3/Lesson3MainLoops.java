package lesson3;

public class Lesson3MainLoops {
    public static void main(String[] args) {
        Lesson3MainLoops lesson3MainLoops = new Lesson3MainLoops();
        lesson3MainLoops.countNumbers(-10);


    }

    public void countNumbers(double d){

        while (d<=10) {

            System.out.println(d);
            d = d + 0.25;


        }


    }


}
