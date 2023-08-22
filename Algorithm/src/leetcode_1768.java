
public class leetcode_1768 {
	 public static String mergeAlternately(String word1, String word2) {
		 StringBuilder merged = new StringBuilder();
		 
		 int i = 0, j = 0;
		 while(i<merged.length() && j<merged.length()) {
			 merged.append(word1.charAt(i));
			 merged.append(word2.charAt(j));
			 i++; j++;
		 }
		 while(i<word1.length()) {
			 merged.append(word1.charAt(i));
			 i++;
		 }

		 while(j<word2.length()) {
			 merged.append(word2.charAt(j));
			 j++;
		 }
		 System.out.println(merged.toString());
		 
		 
		 return merged.toString();
       
   }
	 public static void main(String[] args) {
		 String word1 = "ab";
		 String word2 = "pqrs";
		 mergeAlternately(word1, word2);
	 
	 }
}
