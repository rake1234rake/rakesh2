package rakesh2;

public class arjun {

	public static void main(String[] args) {
		b r=new b() ;
		r.run();
			
		}
	}

class v{
	void run() {
		System.out.println("vehical is runing");
	}
}
class b extends v{
	void run() {
	System.out.println("bike is runing");
}
}