package myFamily;

public class LoopsSelfTest {
    public static void main(String[] args) {
        LoopsSelfTest loopsSelfTest = new LoopsSelfTest();
        //loopsSelfTest.whileTest(1);
        //loopsSelfTest.forTest();
        loopsSelfTest.patternTest(9);
    }

    public void whileTest(int i) {
        while (i <= 100) {

            System.out.println(i);

            i = i + 1;
        }
    }

    public void forTest() {
        for (int i = 1; i <= 100; i++) {

            System.out.println(i);
        }
    }

    public void patternTest(int rows) {
        for (int i = 1; i <= 9; i++) {
            if(i % 2 == 0){
                continue;
            }

            if(i==7){

                break;
            }


            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println(" ");
        }

    }

}
