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
