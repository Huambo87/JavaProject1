package myFamily;

public class MyFamily {
    public static void main(String[] args) {
        MyFamily myFamily = new MyFamily();
        myFamily.myFamilyMembers("Alexandra");
        myFamily.myFamilyMembers("Sofia");
        myFamily.myFamilyMembers("Maxim");
        myFamily.myFamilyMembers("Svetlana");

    }

    public void myFamilyMembers(String fname) {

        if (fname == "Alexandra" || fname =="Sofia" || fname == "Svetlana") {

            System.out.println(fname + " Gladkova ");
        }

        else {
            System.out.println(fname + " Gladkov ");

        }


    }


    }


