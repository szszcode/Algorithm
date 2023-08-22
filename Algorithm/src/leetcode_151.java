import java.util.Arrays;

public class leetcode_151 {
	public static String reverseWords(String s) {
		s = s.trim();
		StringBuilder reverse = new StringBuilder();
		String[] tmp = s.split(" ");

		for (int i = tmp.length-1; i >=0; i--) {
			if(!tmp[i].isEmpty()) {
				reverse.append(tmp[i]);
				if(i!=0) reverse.append(" ");
			}
		
		}
		System.out.println(reverse.toString());
		return reverse.toString();
	}
	public static void main(String[] args) {
		String s = " hello world ";
		reverseWords(s);
	}
}
