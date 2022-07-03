package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String text="$Rolls Royce is the 2nd most expensive car$";
		int letter=0,space=0,num=0,specialChar=0;
		char[] charArray=text.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i])) {
				letter++;
			}
				if(Character.isDigit(charArray[i])) {
					num++;
				}
				if(Character.isSpaceChar(charArray[i])) {
					space++;
				}
						else {
							specialChar++;
							
						}
				System.out.println("letter : "+letter);
				System.out.println("num : "+num);
				System.out.println("space : "+space);
				System.out.println("special Character : "+specialChar);
		
				}
			
			
		}
	}


