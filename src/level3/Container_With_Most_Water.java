package level3;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxArea(int[] height) {
		int start = 0;
		int end = height.length - 1;
		int maxArea = 0;
		while (start < end) {
			int hi = 0;
			if (height[start] < height[end])
				hi = height[start++];
			else
				hi = height[end--];
			maxArea = Math.max(maxArea, (end - start + 1) * hi);
		}
		return maxArea;
	}
}
