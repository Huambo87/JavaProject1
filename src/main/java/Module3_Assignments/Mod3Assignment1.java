package Module3_Assignments;

public class Mod3Assignment1 {
    public static void main(String[] args) {
        Mod3Assignment1 mod3Assignment1 = new Mod3Assignment1();
        mod3Assignment1.classifyNumbers();

    }

    public void classifyNumbers() {

        int i = 1;

        for (i = 1; i <= 100; i++) {

            if (i % 2 == 1) {

                if (i % 3 == 0) {

                    System.out.println("Number " + i + " is divisible by 3");

                }

                else {

                    System.out.println("Number " + i + " is odd");

                }

            } else {

                if (i % 2 == 0 && i % 3 == 0) {

                    System.out.println("Number " + i + " is divisible by 2 and 3");

                }

                else {

                    System.out.println("Number " + i + " is even");

                }

            }
        }

        }

    }