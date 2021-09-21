package codility;

import java.util.HashMap;
import java.util.Set;

import com.utils.Helper;

class OddOccurrencesInArray {
	public static int solution(int[] A) {
		HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
		int unpaired = 0;
		for (int i = 0; i < A.length; i++) {
			if (occurrencesMap.containsKey(A[i])) {
				int occurrences = occurrencesMap.get(A[i]);
				occurrences++;
				occurrencesMap.put(A[i], occurrences); // increment occurrence counter and store it
			} else {
				occurrencesMap.put(A[i], 1); // 1st occurrences of this value
			}
		}

		Set<Integer> keySet = occurrencesMap.keySet();

		for (int currentKey : keySet) {
			int occurrences = occurrencesMap.get(currentKey);

			// if occurs odd number of times, we found the unpaired value - no need to
			// continue checking
			if (occurrences % 2 != 0)
				unpaired = currentKey;
		}
		return unpaired;
	}

	public static void main(String[] args) {
		int[] ar = { 9, 3, 9, 3, 9, 7, 9 };
		Helper.log("The initial array is :");
		Helper.printArray(ar);
		int unpaired = solution(ar);
		Helper.log("unpaired element is :" + unpaired);

	}
}
