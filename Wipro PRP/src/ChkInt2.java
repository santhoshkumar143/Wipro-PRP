import java.util.*;
public class ChkInt2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if((n1%10)==(n2%10))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
