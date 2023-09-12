import java.util.*;

public class leecode_2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList();
        
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        
        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        
        List<Integer> result1 = new ArrayList();
        List<Integer> result2 = new ArrayList();
        
        for(int n : set1) {
        	if(!set2.contains(n)) result1.add(n);
        }
        
        for(int n : set2) {
        	if(!set1.contains(n)) result2.add(n);
        }
        
        answer.add(result1);
        answer.add(result2);
        System.out.println(answer);
        return answer;
    }
   
    public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};
		findDifference(nums1, nums2);
    }
}
