package myFamily;

public class TheirFamily {
    public static void main(String[] args) {


       // TheirFamily theirFamily = new TheirFamily();
        //theirFamily.printMemberList(1, "Peter", "Penn");
        //theirFamily.printMemberList(2, "Mary", "Penn");
        //theirFamily.printMemberList(3, "Jane", "Penn");

        TheirFamily theirFamily = new TheirFamily();
        boolean isBonusAvailable = true;
        theirFamily.checkScore(1, "Peter", "Penn", 65, false);
        theirFamily.checkScore(2, "Mary", "Penn", 60, isBonusAvailable);
        theirFamily.checkScore(3, "Jane", "Penn", 40, isBonusAvailable);

    }

    public void printMemberList (int listNum, String fName, String lName) {

       System.out.println("Family Member Number " + listNum + ": " + fName + " " + lName);

        }

    public  void checkScore (int listNum, String fName, String lName, int memberScore, boolean isBonusAvailable) {

        if (fName.equals("Jane")) {

            System.out.print("Family Member Number " + listNum + ": " + fName + " " + lName + " Junior");
        }

        else {

            System.out.print("Family Member Number " + listNum + ": " + fName + " " + lName);

        }

        if(isBonusAvailable==false) {


        }

        else {

            memberScore = memberScore + 10;

        }

        if (memberScore>60) {

            System.out.println(" " + memberScore + " Passed");
        }

        else if (memberScore==60) {

            System.out.println(" " + memberScore + " Repeat");

        }

        else {

            System.out.println(" " + memberScore + " Failed");

        }


    }


    }



