package Module7_Task1;

import java.util.Arrays;

public class TypingChecker {
    public static void main(String[] args) {
        String[] userTypedArray = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correctArray = {"crt", "blue", "sky", "umbrella", "paddy"};

        int[] result = correctStream(userTypedArray, correctArray);

        System.out.println(Arrays.toString(result));
    }


    public static int[] correctStream(String[] userTypedArray, String[] correctArray) {
        int[] result = new int[userTypedArray.length];

        for (int i = 0; i < userTypedArray.length; i++) {
            if (userTypedArray[i].equals(correctArray[i])) {
                result[i] = 1;
            } else {
                result[i] = -1;
            }
        }

        return result;
    }


}

