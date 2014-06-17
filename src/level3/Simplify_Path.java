package level3;

import java.util.Stack;

public class Simplify_Path {

	public static void main(String[] args) {
		String s = "/a/./b/../../c/";
		String[] strs = s.split("/");
		System.out.println(strs);
	}

	public static String simplifyPath(String path) {
		Stack<String> s = new Stack<String>();
		String[] strs = path.split("/");
		for (String str : strs) {
			if ("".equals(str) || ".".equals(str))
				continue;
			if ("..".equals(str)) {
				if (!s.isEmpty())
					s.pop();
			} else
				s.push(str);
		}
		StringBuilder sb = new StringBuilder();
		for (String str : s)
			sb.append("/").append(str);
		return s.isEmpty() ? "/" : sb.toString();
	}
}
