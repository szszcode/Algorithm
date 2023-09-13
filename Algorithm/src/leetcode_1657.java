import java.util.Stack;

public class leetcode_1657 {
    public static String removeStars(String s) {
        Stack<Integer> starPositions = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Step 1: Find the positions of stars in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                starPositions.push(i);
            }
        }

        // Step 2: Process stars and remove closest non-star character to the left
        for (int i = 0; i < s.length(); i++) {
            if (!starPositions.isEmpty() && i == starPositions.peek()) {
                starPositions.pop();
            } else {
                result.append(s.charAt(i));
            }
        }
        System.out.println(result);

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        String s2 = "erase*****";

        String result1 = removeStars(s1);
        String result2 = removeStars(s2);

    }
}
