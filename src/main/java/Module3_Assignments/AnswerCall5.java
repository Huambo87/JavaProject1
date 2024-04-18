package Module3_Assignments;

public class AnswerCall5 {
    public static void main(String[] args) {
        AnswerCall5 answerCall5 = new AnswerCall5();
        answerCall5.answerCall(false, true, true);

    }

    public void answerCall(boolean isMorning, boolean isMother, boolean isAsleep) {

        if (isAsleep == true) {

            System.out.println("Don't Take the Call");

        }

        else {
            if (isMorning == true) {

                if (isMother == true) {
                    System.out.println("Take the Call");
                }
                else {
                    System.out.println("Don't Take the Call");
                }

            }

            else {
                System.out.println("Take the Call");
            }


        }


    }
}








