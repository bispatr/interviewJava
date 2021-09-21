package testalgo.arrays;

import com.utils.Helper;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = Helper.getIntArray();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		Helper.printArray(nums);
	}

}
