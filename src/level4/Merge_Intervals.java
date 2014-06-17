package level4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
	static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Interval> merge(List<Interval> intervals) {
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		int i = 0;
		while (i < intervals.size() - 1) {
			Interval cur = intervals.get(i);
			Interval next = intervals.get(i + 1);
			if (cur.end >= next.start) {
				cur.end = Math.max(cur.end, next.end);
				intervals.remove(i + 1);
			} else
				i++;
		}
		return intervals;
	}
}
