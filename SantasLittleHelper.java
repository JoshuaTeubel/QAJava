/*
 *Joshua Teubel
 *15/5/2017
 */
 import java.util.*;
 import java.text.*;
 public class SantasLittleHelper {
 	//Global Defs
 	static Scanner scanner;
 	static String iFName, oToyCost1, oToyCost2, oTotTax, oSubTotal, oTotal;
 	static String iLName;
 	static String iToy1;
 	static String iToy2;
 	static String iData;
 	static double iToyCost1;
 	static double iToyCost2;
 	static String iAge;
 	staic  double discout = .2;
 	static Double cTax = 0.07;
 	static Double cTotTax;
 	static Double cSubTotal;
 	static Double cTotal;
 	static Date		today;
 	static SimpleDateFormat simpleDF;
 	static DecimalFormat dfDouble4v2;
 	
 	
 	
 	public static void main(String[] args) {
 		// Local Defs
 		init();
 		input();
 		calcs();
 		output();
 		
 	}
 	
 	public static void init() {
 		scanner = new Scanner(System.in); //Don't forget the date
 		scanner.useDelimiter("\r\n");
 		
 		today	= new Date();
 		
 		simpleDF = new SimpleDateFormat ("MM/dd/yyyy");
 		
 		dfDouble4v2 = new DecimalFormat("####.00");
 	}
 	
 	public static void input() {
 		System.out.println("Please enter your first name.");
 		iFName = scanner.next();
 		
 		
 		System.out.println("Please enter your last name.");
 		iLName = scanner.next();
 		
 		
 		System.out.println("How old are you?");
 		iAge = scanner.next();
 		
 		
 		System.out.println("Please enter name of toy.");
 		iToy1 = scanner.next();
 		
 		
 		System.out.println("Please enter the price.");
 		iData = scanner.next();
 		
 		try {
 			iToyCost1 = Double.parseDouble(iData);
 		}
 		catch (Exception e) {
 			System.out.println("Invalid price entered. Price assigned $o.oo");
 			iToyCost1 = 0.00;
 		}
 		
 		System.out.println("Please enter name of second toy.");
 		iToy2 = scanner.next();
 		
 		
 		System.out.println("Please enter the price for the second toy.");
 		iData = scanner.next();
 		
 		try {
 			iToyCost2 = Double.parseDouble(iData);
 		}
 		catch (Exception e) {
 			System.out.println("Invalid price entered. Price assigned $o.oo");
 			iToyCost2 = 0.00;
 		}
 	}
 	
 	public static void calcs() {
 		cSubTotal = iToyCost1 + iToyCost2;
		
		// discount added
 		double subDiscount = cSubtotal - (cSubTotal * discout);
 		cTotTax = subDiscount * cTax;
 		cTotal = cSubTotal + cTotTax;
 	}
 	
 	public static void output() {
 		oToyCost1 = dfDouble4v2.format(iToyCost1);
 		oToyCost2 = dfDouble4v2.format(iToyCost2);
 		oSubTotal = dfDouble4v2.format(cSubTotal);
 		oTotTax = dfDouble4v2.format(cTotTax);
 		oTotal = dfDouble4v2.format(cTotal);
 		
 		System.out.println("\nThank you for shopping with us " + iFName + " " + iLName + ".");
 		System.out.println(" ");
 		System.out.println("Today is " + simpleDF.format(today) );
 		System.out.println(" ");
 		System.out.println("First toy: " + iToy1);
 		System.out.println("Price: $" + oToyCost1);
 		System.out.println("Second toy: " + iToy2);
 		System.out.println("Second price: $" + oToyCost2);
 		System.out.println("Subtotal: $" + oSubTotal);
 		System.out.println("Total tax: $" + oTotTax);
 		System.out.println("Total Bill: $" + oTotal + "\n");
 		System.out.println("Merry Christmas!!!");
 	}
 	
 	
 }