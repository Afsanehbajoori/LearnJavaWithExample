import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class LearnJava {

	public static void main(String[] args) {
		String message ="Hello \"Afsaneh\"" + "How are you?";
		System.out.println(message.indexOf("?"));
		System.out.println(message.replace("?", "?!"));
		System.out.println(message);
		// c:\Windows\...
		String message1 ="c:\\Windows\\...";
		System.out.println(message1);
		String message2="\nNext Line";
		System.out.println(message2);
		String message3="\tTab";
		System.out.println(message3);

		
		//Arrays:
		//int[] numbers= new int[5];
		//numbers[0]=1;
		//numbers[1]=5;
		//numbers[2]=10;
		int[] numbers= {5,3,5,4,10};
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[4]);
		
		//to dimantion arrays:
		int[][] dimenNumbers= new int[2][3];
		dimenNumbers[0][0]=1;
		System.out.println(Arrays.deepToString(dimenNumbers));
		int x = dimenNumbers[0][0];
		System.out.println(x);
		int[][] dimenNumbers1= {{5,3,5,4,10} , {8,7,6,4,5}};
		System.out.println(Arrays.deepToString(dimenNumbers1));
		for(int i=0; i<dimenNumbers1.length; i++) {
			for(int j=0; j<dimenNumbers1[i].length; j++) {
				System.out.println(dimenNumbers1[i][j]);
			}
		}
		
		
		double result= (double)10/ (double)3;
		System.out.println(result);
		
		//casting:
		String x2="1";
		int y=Integer.parseInt(x2) +2;
		System.out.println(y);
		
		String x3="1.1";
		double y3= Double.parseDouble(x3)+2;
		System.out.println(y3);
		
		
		//formating numbers or number format:
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result2=currency.format(1234678.258);
		System.out.println(result2);
		
		
		String result3=NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result3);
		
		
		//reading input:
		Scanner scan = new Scanner(System.in);
		System.out.print("Name:");
		String name=scan.nextLine().trim(); // nextline() is a method that can accept full name . if we use next() method and we enter full name , we can see only name in the output.
		System.out.println("Your name " + name);
	}

}
