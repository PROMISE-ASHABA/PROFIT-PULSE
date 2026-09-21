PROFIT-PULSE
A profit checker for young entrepreneurs and growing businesses.
In short, a simple Java console program that helps small business owners find out if they are making a profit or a loss after selling a product for one week.Many small traders sell goods every day but never know exactly how much money they really make. *Profit Pulse*solves this.

You type in:
what you are selling,
how much it costs you,
how much you sell it for,
your daily expenses (like transport and data),
how many items you sold each day for 7 days.

The program then gives you a weekly report and tells you if your business is healthy.

Features
 Asks for product name, cost price and selling price
 Checks that prices are above 0 (keeps asking until correct)
 Checks that expenses and daily sales are not negative
 Records sales for 7 days.
 Calculates money in (revenue), money out (expenses) and profit or loss
 Calculates the profit margin(%)
 Gives simple business advice in form of a verdict
 Tells you the break-even point (how many items to sell to cover your expenses)
 Lets you check another product without restarting the program
 
 What You Need

 Java JDK 8 
 Any Java editor (Eclipse,VS Code) or just a browser
 
 How to Run the Program
Option 1: Using an editor Eclipse,etc
1. Download or clone this project.
2. Open it in your editor.
3. Open `ProfitPulse.java`.
4. Click Run

FOR EXAMPLE IF YOU RUN
PROFIT PULSE
What are you selling? bracelet
Cost price of 1 item: 2000
Selling price of 1 item: 2500
Daily expenses (transport, data) type 0 if none: 1000
Day 1  how many did you sell? 20
Day 2  how many did you sell? 15
Day 3  how many did you sell? 18
Day 4  how many did you sell? 22
Day 5  how many did you sell? 25
Day 6  how many did you sell? 30
Day 7  how many did you sell? 10

 WEEKLY REPORT: bracelet
Items sold: 140
Money in: 350000.0
Money out: 287000.0
PROFIT: 63000.0
Profit margin: 18.0%
Excellent! Consider growing your stock.
Sell at least 14 units a week to break even.
Check another product? (yes/no):

 How the Calculations Work
 Revenue (money in) items sold × selling price 
 Expenses (money out)  (items sold × cost price) + (daily expenses × 7) 
 Profit  revenue − expenses 
 Profit margin  (profit ÷ revenue) × 100 
 Break-even units (daily expenses × 7) ÷ (selling price − cost price) 

 Java Concepts Used (Learning Points)

This project was built to practice these Java topics:

 Concept  Where we used it 
 Scanner Reading what the user types 
 Variables & data types (String, double, int)  Storing product name, prices and items 
 do-while loop  Repeating the whole program if the user says "yes" 
 while loop  Input validation (no zero or negative values) 
 for loop  Collecting sales for 7 days 
Ternary operator ? Working out the margin and PROFIT/LOSS status 
 if / else if / else Giving business advice 
 Math.abs() and Math.ceil() Showing positive loss values and rounding break-even up 
 Type casting (int) Turning a decimal into a whole number 


  Group Members    Registration numbers
 1 .Aber Fortunate       25/U/1234 
 2 . Ashaba Promise      25/U/1240
 3 .Kalule Asmart         25/U/26881
 4 . Gune Winnie Peace    25/U/15042/ps
 5 .Mungudit Arthur Ryan   25/U/15286/ps


If we continue this project, we can:
Allow product names with spaces (like "Rice bag") using `nextLine()`
 Stop the program from crashing when a user types letters instead of numbers
 Compare several products at once.

This is a student project made for learning purposes.

**Keep hustling smart! 💪**
