package lesson2;

import java.sql.SQLOutput;

public class Lesson2Main {
    public static void main(String[] args) {

      Lesson2Main lesson2 = new Lesson2Main();
        //lesson2.printUserInfo("John Doe", 1);
        //lesson2.printUserInfo("Max Gladkov",2);
        boolean isBonusAvailable = true;
        boolean isPenaltyApplicable = false;
        lesson2.checkScore("Max Gladkov", 2, 40.2, isBonusAvailable, isPenaltyApplicable);
        lesson2.checkScore("John Doe", 1, -80.35, isBonusAvailable, isPenaltyApplicable);
        lesson2.checkScore("Lana Gladkov", 3, 80.15, isBonusAvailable, isPenaltyApplicable);
        lesson2.checkScore("Sasha Gladkov", 4, 61.00, isBonusAvailable, isPenaltyApplicable);

    }

      public void printUserInfo2(String userName, int userId) {

        System.out.println("User name is " + userName);
        System.out.println("User Id is " + userId);

    }

    public void checkScore(String userName, int userId, double userScore, boolean isBonusAvailable, boolean isPenaltyApplicable){

        System.out.println("User name is " + userName);
        System.out.println("User ID is " + userId);
        System.out.println("User Score is: " + userScore);

        if (userName.equals("Sasha Gladkov")){

            userScore = userScore + 30;

        }

        if (isPenaltyApplicable) {

            userScore = userScore - 10;
            System.out.println("Penalty Applies: " + userScore);

        }

        if (isBonusAvailable){

            userScore = userScore + 10;
            System.out.println("User Score with bonus: " + userScore);
        }

        if (userScore>100 || userScore<0) {
            System.out.println("Error");
        }

        else if (userScore>=60){
            System.out.println("Passed");
        }

        else {
            System.out.println("Failed");
        }




    }

}
