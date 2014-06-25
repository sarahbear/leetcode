package unknowlevel;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private LinkedHashMap<Integer, Integer> map;

	public LRUCache(final int capacity) {
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
				return size() > capacity;
			}
		};
	}

	public int get(int key) {
		Integer value = map.get(key);
		if (value == null) {
			return -1;
		}
		return value;
	}

	public void set(int key, int value) {
		map.put(key, value);
	}
}
