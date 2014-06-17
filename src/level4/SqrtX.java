package level4;

public class SqrtX {

	public static void main(String[] args) {
		SqrtX s = new SqrtX();
		System.out.println(s.sqrt(16));
		System.out.println(s.sqrt(2147395599));
		System.out.println(s.sqrt(2));
		System.out.println(s.sqrt(3));
		System.out.println(s.sqrt(6));
		System.out.println(s.sqrt(7));
		System.out.println(s.sqrt(8));
		System.out.println(Math.sqrt(3));
		System.out.println(Integer.MAX_VALUE);
	}

	public int sqrt(int x) {
		if (x <= 1)
			return x;
		int left = 0;
		int right = x;
		int mid;
		while ((right - left) > 1) {
			mid = (left + right)/2;
			if (mid == x / mid)
				return mid;
			else if (x / mid < mid)
				right = mid;
			else
				left = mid;
		}
		return left;
	}
}
