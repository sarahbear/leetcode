package level3;
import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		ArrayList<ArrayList<Integer>> A = permute(num);
		System.out.println(A);
	}

	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[num.length];
		createList(A, visited, num, new ArrayList<Integer>());
		return A;
	}

	private static void createList(ArrayList<ArrayList<Integer>> A, boolean[] visited, int[] num,
			ArrayList<Integer> each) {
		if (each.size() == num.length) {
			A.add(new ArrayList<Integer>(each));
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				each.add(num[i]);
				createList(A, visited, num, each);

				visited[i] = false;
				each.remove(each.size() - 1);
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> permute1(int[] num) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		helper(num, 0, res);
		return res;
	}

	public static void helper(int[] num, int index, ArrayList<ArrayList<Integer>> rs) {
		if (index == num.length) {
			ArrayList<Integer> single = new ArrayList<Integer>();
			for (int i = 0; i < num.length; i++)
				single.add(num[i]);
			rs.add(single);
		} else {
			for (int i = index; i < num.length; i++) {
				int temp = num[index];
				num[index] = num[i];
				num[i] = temp;

				helper(num, index + 1, rs);

				num[i] = num[index];
				num[index] = temp;
			}
		}
	}

	/*
	 * Loop through the array, in each iteration, a new number is added to
	 * different locations of results of previous iteration. Start from an empty
	 * List.
	 */
	public static ArrayList<ArrayList<Integer>> permute2(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++) {
			ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

			for (ArrayList<Integer> each : result) {
				// # of locations to insert is largest index + 1
				for (int j = 0; j < each.size() + 1; j++) {
					// + add num[i] to different locations
					each.add(j, num[i]);
					ArrayList<Integer> temp = new ArrayList<Integer>(each);
					current.add(temp);
					// System.out.println(temp);
					// - remove num[i] add
					each.remove(j);
				}
			}
			result = new ArrayList<ArrayList<Integer>>(current);
		}
		return result;
	}

	public static ArrayList<ArrayList<Integer>> permute3(int[] num) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		int len = num.length;
		if (len == 0)
			return ans;

		boolean[] vis = new boolean[len];
		int[] kase = new int[len];

		dfs(ans, 0, len, num, kase, vis);
		return ans;
	}

	public static void dfs(ArrayList<ArrayList<Integer>> ans, int k, int n, int[] num, int[] kase,
			boolean[] vis) {
		if (k == n) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < kase.length; i++) {
				arr.add(kase[i]);
			}
			ans.add(arr);
			return;
		} else {
			for (int i = 0; i < num.length; i++) {
				if (!vis[i]) {
					kase[k] = num[i];
					vis[i] = true;
					dfs(ans, k + 1, n, num, kase, vis);
					vis[i] = false;
				}
			}
		}
	}
}
