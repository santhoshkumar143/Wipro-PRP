import java.util.*;
public class Wl2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num , rev = 0, rem, org;
		System.out.println("Enter the number :");
		num=s.nextInt();
        org = num;
        while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }
        if (org == rev)
            System.out.println(org + " is a palindrome.");
        else
            System.out.println(org + " is not a palindrome.");
	}

}