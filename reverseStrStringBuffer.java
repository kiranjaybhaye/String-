import java.util.Scanner;
public class reverseStrStringBuffer{
	public static void main(String[] args){
		//String str= "KiranJaybhaye";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A string = ");
		String str = sc.nextLine();               // To read String
		//Convert String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		
		//Te reverse String
		sbr.reverse();
		System.out.println(sbr);
	}
}