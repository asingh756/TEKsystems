# TEKsystems

------------------Java Code------------------
import java.util.Arrays;
import java.util.LinkedList;

public class CodingChallenge {

	public static int[][] restrictedZones(int[][] ranges){
		
        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        int [][] solution;
        for (int[] interval : ranges) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        solution = merged.toArray(new int[merged.size()][]);
        return solution;
	}

}


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CodingChallengeTest {


	@Test
	public void testZipCodes() {
		
		int[][] range = {{94133,94133},{94200,94299},{94600,94699}};
		int[][] actual = CodingChallenge.restrictedZones(range);
		int[][] expected = {{94133,94133},{94200,94299},{94600,94699}};
		assertTrue(Arrays.deepEquals(actual, expected));
	}
	@Test
	public void testZipCodes2() {
		
		int[][] range = {{94133,94133},{94200,94299},{94226,94399}};
		int[][] actual = CodingChallenge.restrictedZones(range);
		int[][] expected = {{94133,94133},{94200,94399}};
		assertTrue(Arrays.deepEquals(actual, expected));
	}
}
