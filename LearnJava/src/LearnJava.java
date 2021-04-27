import java.text.NumberFormat;
import java.util.ArrayList;
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

		
		//Arrays:used to store multiple values in a single variable
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
		
		//two dimantion arrays:
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
		//Scanner scan = new Scanner(System.in);
		//System.out.print("Name:");
		//String name=scan.nextLine().trim(); // nextline() is a method that can accept full name . if we use next() method and we enter full name , we can see only name in the output.
		//System.out.println("Your name " + name);
		//scan.close();
		
		//while:
		Scanner scanner= new Scanner(System.in);
		String nameA ="";
		
		while(nameA.isBlank()) {
			System.out.print("Enter your name:");
			nameA=scanner.nextLine();
		}
		System.out.println("Hello " + nameA );
		
		//nested loops:
		int rows;
		int columns;
		String symble="";
		
		System.out.println("Enter of rows:");
		rows=scanner.nextInt();
		System.out.println("Enter of columns:");
		columns=scanner.nextInt();
		System.out.println("Enter symble to use:");
		symble=scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symble);
			}
		}
		
		
		//arrayList is a collaction:
		
	ArrayList<String> food= new ArrayList<String>();
	food.add("pizz");
	food.add("hotdog");
	food.add("hamberger");
	
	
	//replace: 
	food.set(0,"sushi");
	//remove:
	food.remove(2);
	//clear ArrayList:
	food.clear();
	
	for(int i=0; i<food.size(); i++ ) {
		System.out.println(food.get(i));
	}
	
	
	//two dimantion ArrayList:we can add 3 or more listes too
	ArrayList<String> bakeryList = new ArrayList<String>();
	bakeryList.add("pasta");
	bakeryList.add("garlic bread");
	bakeryList.add("dounats");
	System.out.println(bakeryList);
	System.out.println(bakeryList.get(0));
	
	ArrayList<String> produceList = new ArrayList<String>();
	produceList.add("tomatoes");
	produceList.add("zucchini");
	produceList.add("peppers");
	
	
	
	ArrayList<ArrayList<String>> groceryList =  new ArrayList<ArrayList<String>>();
	
	groceryList.add(bakeryList);
	groceryList.add(produceList);
	
	System.out.println(groceryList);
	System.out.println(groceryList.get(0)); //show all of the fist list
	System.out.println(groceryList.get(0).get(0)); //show a one element in the first list
	
	//for each in ArrayList:
	for(String i : bakeryList) {
		System.out.println(i);
	}
	
	
	 //for each loops:
	String[] animals= {"cat" , "dog"};
	
	for(String i:animals) {
		System.out.println(i);
	}
	
	
	//methods:
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
