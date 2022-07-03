package week2.day1;
import java.util.Arrays;


public class Anagram {
	public static void main(String[] args) {
		String s1="save";
		String s2="vase";
		
		int len1=s1.length();
		int len2=s2.length();
		
		if(s1.length()==s2.length()) {
		}
		char[]Array1 = s1.toCharArray();
		char[]Array2 = s2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		if(Arrays.equals(Array1,Array2)) {
		System.out.println("The given String is Anagram");
	}

		
		else {
		
			System.out.println("The given String is not Anagram");
		}
		
}
}



