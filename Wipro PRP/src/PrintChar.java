
public class PrintChar {

	public static void main(String[] args) {
		char c='s';
		if(c>=48 && c<=57)
			System.out.print("Digit");
		else if((c>=65 && c<=90)||(c>=97 && c<=122))
			System.out.print("Alphabets");
		else
			System.out.print("Special Character");


	}

}
