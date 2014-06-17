package level2;

import java.util.ArrayList;

public class Pascals_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		if (numRows == 0)
			return A;
		ArrayList<Integer> row = new ArrayList<Integer>();
		row.add(1);
		A.add(new ArrayList<Integer>(row));
		for (int i = 1; i < numRows; i++) {
			row.clear();
			for (int j = 0; j < i; j++) {
				if (j == 0)
					row.add(1);
				else
					row.add(A.get(i - 1).get(j - 1) + A.get(i - 1).get(j));
			}
			row.add(1);
			A.add(new ArrayList<Integer>(row));
		}
		return A;
	}
}
