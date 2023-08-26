public class leetcode_1071 {
    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int commonLength = gcd(len1, len2);
        System.out.println(commonLength);
        String commonStr = str1.substring(0, commonLength);

        if (str1.replaceAll(commonStr, "").isEmpty() && str2.replaceAll(commonStr, "").isEmpty()) {
        	System.out.println(str1+ " "+str2+"---");
        	return commonStr;
        } else {
            return "";
        }
    }
 
    public static int gcd(int a, int b) {//최대공ㅇ약수
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    public static void main(String[] args) {
        String str1_1 = "DBD";
        String str2_1 = "DB";
        System.out.println(gcdOfStrings(str1_1, str2_1));  // 출력: "ABC"

        String str1_2 = "ABABAB";
        String str2_2 = "ABAB";
//        System.out.println(gcdOfStrings(str1_2, str2_2));  // 출력: "AB"

        String str1_3 = "LEET";
        String str2_3 = "CODE";
//        System.out.println(gcdOfStrings(str1_3, str2_3));  // 출력: ""
    }
}
