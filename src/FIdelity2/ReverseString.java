package FIdelity2;

public class ReverseString {

	public static String reverseString (String str) {

		String strArr = "";
		str.toCharArray();

		for(int i=str.length()-1 ; i >= 0;i--)
		{
			strArr+=str.charAt(i);
		}
		return strArr;
	}

	public static void main(String[] args){
		String input="Peter";
		String reversedStr = reverseString(input);

		System.out.println("Reversed String : "+reversedStr);

	}
}