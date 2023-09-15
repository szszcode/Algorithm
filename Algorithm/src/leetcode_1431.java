import java.util.*;

class leecode_1431 {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList();
		boolean[] array = new boolean[candies.length];

		for (int i = 0; i < candies.length; i++) {
			int tmp = candies[i] + extraCandies;
			for (int j = 0; j < candies.length; j++) {//1
				if (i == j)
					continue;
				if (tmp < candies[j]) {
					array[i] = false;
					break;
				} else {
					array[i] = true;
				}
			}
		}

		for(boolean bool : array) {
			list.add(bool);
		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		int[] can = {4,2,1,1,2};
		int ex = 1;
		kidsWithCandies(can, ex);
	}
}