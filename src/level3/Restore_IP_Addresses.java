package level3;

import java.util.ArrayList;

public class Restore_IP_Addresses {

	public static void main(String[] args) {
		System.out.println(new Restore_IP_Addresses().restoreIpAddresses("000256"));
	}

	public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> res = new ArrayList<String>();
		dfs(res, 0, 0, "", s);
		return res;
	}

	private void dfs(ArrayList<String> res, int start, int step, String ip, String s) {
		if (step == 4 && start == s.length()) {
			res.add(ip.substring(0, ip.length() - 1));
			return;
		}
		if (s.length() - start > (4 - step) * 3 || s.length() - start < (4 - step))
			return;

		int num = 0;
		for (int i = start; i < start + 3 && i < s.length(); i++) {
			num = num * 10 + s.charAt(i) - '0';
			if (num <= 255) {
				ip += s.charAt(i);
				dfs(res, i + 1, step + 1, ip + '.', s);
			}
			if (num == 0)
				break;
		}
	}
}
