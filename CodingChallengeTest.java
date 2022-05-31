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
