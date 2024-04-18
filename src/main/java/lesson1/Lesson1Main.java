package lesson1;
public class Lesson1Main {


    public static void main(String[] args) {
        Lesson1Main lesson1Main = new Lesson1Main();
        lesson1Main.listNumbers(5);

        int b = 5;

        }

        public void listNumbers(int b){

            String list = " ";

        while (b < 11){
            b = b + 2;
            if (b % 2 == 1);
            list = b + " " + list;

        }

            System.out.println(list);

        }
}