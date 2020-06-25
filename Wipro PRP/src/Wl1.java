import java.util.*;
public class Wl1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int num, rev = 0;
		 System.out.println("Enter the number :");
		 num=sc.nextInt();
	        while(num != 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num /= 10;
	        }

	        System.out.println(rev);

	}

}