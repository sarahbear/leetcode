package level3;

import java.util.Arrays;
import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		System.out.println(new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring3("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {//TLE
		int[] prevPos = new int[Character.MAX_VALUE + 1];
		Arrays.fill(prevPos, -1);
		int substringBegin = 0;
		int maxSubstringLen = 0;
		for (int i = 0; i < s.length(); i++) {
			substringBegin = Math.max(substringBegin, prevPos[s.charAt(i)] + 1);
			prevPos[s.charAt(i)] = i;
			maxSubstringLen = Math.max(maxSubstringLen, i - substringBegin + 1);
		}
		return maxSubstringLen;
	}
	
	public static int lengthOfLongestSubstring2(String s) {//TLE
		int len = 0;
		String result = "";
		String sb = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (sb.indexOf(s.charAt(i)) == -1)
				sb += s.charAt(i);
			else {
				if (len < sb.length()) {
					len = sb.length();
					result = sb;
				}
				sb = "";
				i = count++;
			}
		}

		if (len < sb.length())
			return sb.length();
		else
			return len;
	}
	
	public int lengthOfLongestSubstring3(String s) {//Accepted
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int maxLen = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                maxLen = Math.max(maxLen, map.size());
                int last = map.get(c);
                int toRemoveLen = map.size() - (i - last) + 1;
                for(int j = 0; j < toRemoveLen; j++)
                    map.remove(s.charAt(last - j));
            }
            map.put(c,i);
        }
        return Math.max(maxLen, map.size());
	}
}
