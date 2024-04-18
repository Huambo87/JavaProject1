package lesson3;

import lesson2.Lesson2Main;

public class Lesson3Main {

    public static void main(String[] args) {

        Lesson3Main lesson3Main = new Lesson3Main();

        lesson3Main.checkStudentScore("Maxim Gladkov", "Linguistics", 1, 99.5);
        lesson3Main.checkStudentScore("Svetlana Gladkova", "Philology", 2, 75.0);
        lesson3Main.checkStudentScore("Sofia Gladkova", "Photography", 3, -70.5);
        lesson3Main.checkStudentScore("Alexandra Gladkova", "Statistics", 4, 101.5);
        lesson3Main.checkStudentScore("Julia Nelis", "I Know Everything", 5, 70.5);




    }

    public void printStudentInfo (String studentName, String studentMajor, int studentId, double studentScore) {

        System.out.println("Student's Name: " + studentName);
        System.out.println("Student's Major: " + studentMajor);
        System.out.println("Student's ID: " + studentId);
        System.out.println("Student's Score: " + studentScore);

    }

    public void checkStudentScore (String studentName, String studentMajor, int studentId, double studentScore) {

        System.out.println("Student's Name: " + studentName);
        System.out.println("Student's Major: " + studentMajor);
        System.out.println("Student's ID: " + studentId);
        System.out.println("Student's Score: " + studentScore);

        if (studentScore<0 || studentScore>100){

            System.out.println("Error");
        }

        else if (studentScore>=75) {

            System.out.println("Passed");
        }

        else {

            System.out.println("Failed");

        }
    }

}
