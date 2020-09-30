package test_suite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/***
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 ***/
public class longestConseqInArray {

	public int longestConsecutive(int[] array) {

		Set<Integer> setNumbers = new HashSet<Integer>();
		ArrayList<Integer> subSeqArrayList = new ArrayList<>();

		for (int i : array) {
			setNumbers.add(i);
		}

		int subSeqLength = 0;

		for (int num : setNumbers) {

			if (!setNumbers.contains(num - 1)) {

				int currentElement = num;
				

				while (setNumbers.contains(currentElement + 1)) {

					subSeqArrayList.add(currentElement+1);
					currentElement += 1;
					subSeqLength += 1;
				}
			}
		}
		return subSeqLength;
	}

	@Test
	public void testLongestConsequence() {

		int[] array = { 1, 9, 3, 10, 20, 2 };
		System.out.println(longestConsecutive(array));
	}
}
