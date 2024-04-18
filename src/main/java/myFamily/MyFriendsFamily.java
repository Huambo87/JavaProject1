package myFamily;

public class MyFriendsFamily {
    public static void main(String[] args) {

        MyFriendsFamily myFriendsFamily = new MyFriendsFamily();
        myFriendsFamily.printFamilyList(1, "Boris", "Broddky");
        myFriendsFamily.printFamilyList(2, "Larissa", "Broddky");




    }

    public void printFamilyList(int familyMemberNumber, String firstName, String lastName){

        System.out.println("Family Member Number " + familyMemberNumber + ": " + firstName + " " + lastName );


    }



}
