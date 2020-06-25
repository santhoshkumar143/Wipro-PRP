import java.util.*;
public class PrintPercentage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String gen=s.next();
		if(gen.equals("Female") &&(Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
			System.out.println("The Percentage of interest is 8.2%");
		else if(gen.equals("Female") &&(Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
			System.out.println("The Percentage of interest is 9.2%");
		else if(gen.equals("Male") &&(Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
			System.out.println("The Percentage of interest is 8.4%");
		else if(gen.equals("Male") &&(Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
			System.out.println("The Percentage of interest is 10.5%");
	}

}
