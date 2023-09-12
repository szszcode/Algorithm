import java.util.Arrays;

public class leetcode_1732 {
    public static int largestAltitude(int[] gain) {
    	int[] gain_copy = new int[gain.length+1];
    	
    	gain_copy[0] = 0;
    	for (int i = 0; i < gain.length; i++) {
    		gain_copy[i+1] = gain[i];
		}
    	
    	int sum = 0, max = -99999;
    	for (int i = 0; i < gain_copy.length; i++) {
    		int tmp = gain_copy[i];
    		sum+=tmp;
    		gain_copy[i] = sum;
    		if(max < gain_copy[i]) max = gain_copy[i];
    	}
    	System.out.println(Arrays.toString(gain_copy));
    	System.out.println(max);
    	
    	return max;
    }
    public static void main(String[] args) {
		int[] gain = {-5,1,5,0,-7};
		largestAltitude(gain);
	}
}
