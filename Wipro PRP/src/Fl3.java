import java.util.*;
public class Fl3 {
     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean f=false;
		for(int i=2;i<= num/2;++i) {
			if(num %i ==0) {
				f=true;
				break;
			}
		}
		if(!f)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime");

	}

}