public class Fl4 {
    public static void main(String[] args) {
		int n=10,n1=99;
		while(n < n1) {
			boolean f=false;
			for(int i=2;i<n/2;++i) {
				if(n%i==0) {
					f=true;
					break;
				}
			}
			if(!f && n!=0 && n!=1)
				System.out.println(n+" ");
			++n;
		}
	}

}