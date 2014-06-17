package level2;

import java.util.ArrayList;

public class Pascals_Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		if (rowIndex == 0) {
			return a;
		}
		for (int i = 1; i <= rowIndex; i++) {
			a.add(0, 1);
			for (int j = 1; j < i; j++) {
				a.set(j, a.get(j) + a.get(j + 1));
			}
		}
		return a;
    }
}
