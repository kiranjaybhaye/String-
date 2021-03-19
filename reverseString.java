public class reverseString{
    public static void main(String[] args){
       String str = "Kiran Jaybhaye";
	StringBuilder str1 = new StringBuilder();

	// append a string (str) into StringBuilder input (str1)
	str1.append(str);

	// reverse StringBuilder input (str)
	str1.reverse();
	
	// print reversed String
	System.out.println("Reverse Str by using StringBuilder = "+str1);
    }
}