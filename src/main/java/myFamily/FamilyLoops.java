package myFamily;

public class FamilyLoops {
    public static void main(String[] args) {
        FamilyLoops familyLoops = new FamilyLoops();
        // familyLoops.countNumbers(1);
        // familyLoops.countNumbers();
        familyLoops.numbersTemplate(9);

    }

    public void countNumbers(int i) {

//        System.out.println(i);
//        System.out.println(i+1);
//        System.out.println(i+2);


        while (i <= 10) {

            System.out.println(i);
            i = i + 1;

        }

    }

    public void countNumbers() {

        for (int i = 1; i <= 100; i = i + 2) {

            System.out.println(i);

        }

    }

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println();
        }
    }


}
