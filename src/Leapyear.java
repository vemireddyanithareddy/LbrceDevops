
public class Leapyear {

	public static void main(String[] args) {
		int a=2003;
		if(a%4==0 || a%100!=0 && a%400==0)
		{
			System.out.println("leap year");
		}
		else
			System.out.println("not a leap year");
	
			

	}

}
