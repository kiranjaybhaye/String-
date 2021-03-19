public class Main
{
	public static void main(String[] args) {
	    String str1="Vishal";
	    String str2="Ubale";
	    String str3=str1.concat(str2);
		System.out.println("You are getting Selecte d for MPSC  "+" = "+str3);
	    System.out.println("Length of the String is = "+str1.length());
	    System.out.println("Index of Character S = "+str1.indexOf('s'));
	    System.out.println("Character at Position 3 = "+str1.charAt(2));
	    System.out.println("Compare To String 'Vishal' = "+str1.compareTo("Vishal"));
	    System.out.println("Compare To String 'Vishal' - IgnoreCase = "+str1.compareToIgnoreCase("VISHAL"));
	    System.out.println("Contains Sequence 'sha' = "+str1.contains("sha"));
	    System.out.println("String Ends With char 'l' = "+str1.endsWith("l"));
	    System.out.println("String Replace 'Vis' with 'Uba' = "+ str1.replace("Vis" , "Uba"));
	    System.out.println("String Replace All 'Vishal' to 'Ubale' = "+str1.replaceAll("Vishal" , "Ubale"));
	    System.out.println("String ReplaceFirst 'Vi' to 'xxx' = "+str1.replaceFirst("Vi" , "xxx"));
	    System.out.println("String convert toLowerCase = "+str1.toLowerCase());
	    System.out.println("String convert toUpperCase = "+str1.toUpperCase());
	    
	}
}
