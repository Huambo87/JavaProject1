package Module3_Assignments;

public class EqualSlices6 {
    public static void main(String[] args) {
        EqualSlices6 equalSlices6 = new EqualSlices6();
        equalSlices6.equalSlices(12, 3,6);

    }

    public void equalSlices (int numSlices, int numRecipients, int share) {
        if (numRecipients * share <= numSlices) {

            System.out.println("Each recipient can get their fair share.");

        }

        else {

            System.out.println("Fair distribution is impossible. Alas!");

        }

    }

}
