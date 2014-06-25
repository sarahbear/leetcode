package unknowlevel;


public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		String s = " 1";
		System.out.println(reverseWords(s)+"<-");
	}

	public static String reverseWords(String s) {
		if(s.trim().equals("")){
			return "";
		}
        String[] strs = s.trim().split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = strs.length - 1; i > 0; i--) {
			sb.append(strs[i]).append(" ");
		}
		sb.append(strs[0]);
		return sb.toString();
	}

}
