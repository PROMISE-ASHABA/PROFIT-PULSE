package profitpulse;//our file exists here
import java.util.Scanner;//helps us read user input 

public class ProfitPulse {//the class name which matches our file

	public static void main(String[] args) {//our code starts running officially hence users can now operate our application
		// you are welcome to our profit pulse.
		
 Scanner scanner = new Scanner(System.in);// this is what listens to the keyboard in fact will collect the response 
		        
 System.out.println("PROFIT PULSE");// the title
 String repeat;

		        // do-while: runs the whole program or code once, then repeats if the user says yes,if they indeed have what they are selling
 do {
		            System.out.print("What are you selling? ");
		            String product = scanner.next();// this will enable the user for example input one good they are selling so it can be analyzed,one at a time.
		            

		            // general or cost price(original price)       
		            System.out.print("Cost price of 1 item: ");
		            double costPrice = scanner.nextDouble();     // we used this kind of updating because we had to change the variable state hence ++ was not suitable
		            
		                                                                   
		                while (costPrice <= 0) {
		                System.out.print("Enter an amount above 0: ");     
		                costPrice = scanner.nextDouble();                      
		                                                                    
		      }                                                             
		                                                                    
             
		            System.out.print("Selling price of 1 item: ");                              
		            double sellPrice = scanner.nextDouble(); 
		            //while loop : keep asking as long as the answer is 0 or less
		            while (sellPrice <= 0) {
		                System.out.print("Enter an amount above 0: ");
		                sellPrice = scanner.nextDouble();
		       }

		            // while loop: daily expenses which realistically cannot be negative
		            System.out.print("Daily expenses (transport, data) type 0 if none: ");
		            double dailyExpenses = scanner.nextDouble();
		            //here we can accept a 0 but not a negative
		            while (dailyExpenses < 0) {
		                System.out.print("Expenses cannot be negative. Try again: ");
		                dailyExpenses = scanner.nextDouble();
		            }

	  // for loop: sales for 7 days...this is a fair view
		         int totalItems = 0;
		         //NOTE:we are looking at 7 days so it will repeat 7 times.
		         // so int day is the start, day<= 7 keep going of course day++ add 1 to each round
		         for (int day = 1; day <= 7; day++) {
		                System.out.print("Day " + day + "  how many did you sell? ");
		                int Items = scanner.nextInt();
		                while (Items < 0) {
		                    System.out.print("Cannot be negative. Try again: ");
		                  Items = scanner.nextInt();
		                }
		                totalItems = totalItems + Items;
		            }

		      // calculations
		            double revenue = totalItems * sellPrice;//money coming in
		            double expenses = (totalItems * costPrice) + (dailyExpenses * 7);//money going out
		            double profit = revenue - expenses;// what we have left

		       // ternary: condition? answer if true : answer if false
		            //if revenue is above 0,work out the percentage,otherwise use 0, hence we cannot divide by 0 if nothing was sold
		        double margin = (revenue > 0) ? (profit / revenue) * 100 : 0;

		       // ternary: if profit is 0 or more say profit otherwise say loss
		            String status = (profit >= 0) ? "PROFIT" : "LOSS";

		            // outcome
		            System.out.println();
		            System.out.println(" WEEKLY REPORT: " + product );
		            System.out.println("Items sold: " + totalItems);
		            System.out.println("Money in: " + revenue);
		            System.out.println("Money out: " + expenses);
		            System.out.println(status + ": " + Math.abs(profit));
		            System.out.println("Profit margin: " + margin + "%");
		     

		            // if / else if / else-java checks from top to bottom printing out the first true
		            if (profit < 0) {
		                System.out.println("You are LOSING money. Raise your price or cut expenses.");
		            } else if (margin < 15) {
		                System.out.println("Barely profitable. One bad day could wipe you out.");
		            } else if (margin > 20) {
		                System.out.println("Healthy business. Keep going!");
		            } else {
		                System.out.println("Excellent! Consider growing your stock.");
		            }

		            // break-even advice: in short how many goods must be sold to cover expenses
		            if (sellPrice > costPrice) {
		                double gainPerUnit = sellPrice - costPrice;//profit on one item
		                int breakEven = (int) Math.ceil(dailyExpenses * 7 / gainPerUnit);// removes the decimal like 43.0 to 43
		                System.out.println("Sell at least " + breakEven + " units a week to break even.");
		            } else {
		                System.out.println("Warning: selling price is not above cost price!");
		            }
//asks our user if you would like to go again
		            System.out.print("Check another product? (yes/no): ");// if they say yes then definately repeat 
		            repeat = scanner.next();

		        } while (repeat.equalsIgnoreCase("yes"));

		        System.out.println("Keep hustling smart!");
		        //close the scanner if we are done
		        scanner.close();
		    }
}

	
