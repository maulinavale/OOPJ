
/*
		1. Arithmetic & Assignment Operators

Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or - .
Hint : Use bitwise XOR ^ operator.


class Assignment{
public static void main(String args[]){
int a =5;
int b=6;
System.out.println("Value of a : "+a+" Value of b : "+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("Value of a : "+a+" Value of b : "+b);
}
}
*/

/*
Q2: Write a program to check whether a given number is even or odd using only bitwise
operators .
Hint : Use n & 1 to check.

class Assignment{
public static void main(String args[]){
int a =5;
int b=1;


if((a&b)==0){
	System.out.println("Even");
}
else
{System.out.println("Odd");}
}
}
*/

/*
Q3: Implement a program that calculates the sum of digits of an integer using modulus
( % ) and division ( / ) operators .

class Assignment{
public static void main(String args[]){
int a = 12345;
int sum =0;
while(a>0){
	sum += a%10;
	a /= 10;
}
System.out.println("The Sum of is : "+sum);
}
}
*/

/*
Q4: Write a program to find whether a given number is divisible by 3 without using the
modulus ( % ) or division ( / ) operators.
Hint : Use subtraction and bitwise shifts .

class Assignment{
public static void main(String args[]){
int a = 12345;

while(a>2 ){
	a -=3;
}
if (a==0){
System.out.println("Divisible ");}
else{System.out.println("Indivisible ");}
}
}
*/

/*
Q5: Write a Java program to swap two numbers using the += and -= operators only.

class Assignment {
public static void main(String args[]){
int a=10;
int b = 9;
	System.out.println("Value of a : "+a+" Value of b : "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Value of a : "+a+" Value of b : "+b);
}
}
*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
		2. Relational & Logical Operators
Q6: Write a program to find the largest of three numbers using only the ternary operator
( ? : ) .

class Assignment{
	public static void main (String args[]){
		int a =10;
		int b = 11;
		int c = 15;
		
		int g =(a>b && a>c)? a:(b>a && b>c)?b:c;
			System.out.println("The largest among all is : "+g);
		
	}
}
*/

/*
Q7: Implement a Java program that checks whether a given year is a leap year or not using
logical ( && , || ) operators

class Assignment{
	public static void main(String args[]){
		int y= 1234;
		if(y%400==0 ||(y%4==0 && y%100!=0)){
			System.out.println("Leap Year");
		}
		else{
		System.out.println("Leap Year");
		}
	}
}
*/
/*
Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true .
Hint : Use logical operators ( && , || ).

class Assignment{
	public static void main(String args[]){
		boolean a =true, b=false, c=false;
		if(a||b||c){
			System.out.println("One of the inputs is True");
		}
		else{System.out.println("One of the inputs is False");}
	}
}
*/

/*
9. Write a program that checks if a number is within a specific range (20 to 50) without using if-else.

class Assignment{
	public static void main (String args[]){
		int a= 30;
		String b =(a>20 && a<50)? "Yes" : "No" ;
		System.out.println("Is the Number within range? --> "+b);
	}
}
*/

/*
10. Write a program to determine if a character is a vowel , consonant using the ternary operator

class Assignment{
	public static void main (String args[]){
		char x='z';
	boolean b=(x=='a')?true:(x=='e')?true:(x=='i')?true:(x=='o')?true:(x=='u')?true:false;
	if(b){System.out.println("Vowel Recognised");}
	else{System.out.println("Vowel not Recognised");}
	}
}
*/

/*
	3. Bitwise Operators
Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
Hint : n & (n - 1) == 0 for positive numbers.

class Assignment{
	public static void main(String args[]){
		int a=8;
		String s = ((a&(a-1))==0)?"The given number is in the power of 2":"No, The given number is not of the power 2";
		System.out.println(s);
		
	}
}
*/

/*
Q12: Write a Java program to multiply a number by 8 without using * or / operators.
Hint : Use bitwise left shift ( << ).

class Assignment{
	public static void main(String args[]){
			int a =69;
			int b = 69<<3;
			System.out.println("The number "+a+" on multiplication with 8 gives "+b);
	}
}
*/
/*
Q13: Implement a Java program to find the absolute value of an integer using bitwise
operators.
Hint : mask = num >> 31; abs = (num + mask) ^ mask;

class Assignment{
	public static void main(String args[]){
		int a =-8;
		int mask = -8>>31;
		int abs = (a+mask)^mask;
		System.out.println("Absolute of "+a+" is "+abs);
		
	}
}
*/

/*
Q14: Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.
Hint : Use n & (n - 1) .

class Assignment{
	public static void main (String args[]){
		int x = 9;
		int count=0;
		while(x>0){
			x=x&(x-1);
			count ++;
		}
		System.out.println("Total no. of 1 bit is : "+count);
	}
}
*/

/*
Q15: Implement a program to swap odd and even bits of a number using bitwise
operators.
Hint : Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 .

class Assignment{
	public static void main(String args[]){
		int x = 169;
		int y = (x & 0xAAAAAAA)>>1|(x & 0x5555555<<1);
		System.out.println("Original Number : "+x+" After swapping of bits "+y);
	}
}
*/

/*
	4. Ternary Operator Challenges
Q16: Write a program that determines whether a given number is positive, negative, or
zero using only the ternary operator

class Assignment{
	public static void main(String args[]){
		int a =-5;
		String s=(a<0)?"Negative":(a==0)?"Zero":"Positive";
		System.out.println("The Number is : "+s);
	}
}
*/

/*
Q17: Implement a Java program that finds the minimum of four numbers using nested
ternary operators

class Assignment{
	public static void main(String [] args){
		int a=4,b=6,c=9,d=10;
		System.out.print("The greatest number is : ");
		System.out.print((a>b&&a>c&&a>d)?a:(b>a&&b>c&&b>d)?b:(c>b&&c>a&&c>d)?c:d);
	}
}
*/

/*
Q18: Given a student’s percentage, print "Pass" if the percentage is 40 or above;
otherwise, print "Fail" , using only the ternary operator.

class Assignment{
	public static void main (String args[]){
		int a =60;
		System.out.println((a>40)?"Pass":"Fail");
	}
}
*/

/*
Q19: Write a java program that checks whether a character is uppercase, lowercase, or
not a letter using only the ternary operator.

class Assignment{
	public static void main (String args[]){
char ch = 'A'; 
String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :(ch >= 'a' && ch <= 'z') ? "Lowercase" :"Not a letter";
System.out.println("The character '" + ch + "' is: " + result);		
	}
}
*/

/*
Q20. Write a java program that returns the absolute value of a given number using
the ternary operator (without using Math.abs() ).

class Assignment{
	public static void main (String args[]){
		int number = -10; 
        int absoluteValue = (number >= 0) ? number : -number;

        System.out.println("The absolute value of " + number + " is: " + absoluteValue);
	}
}
*/
/*
	5. Miscellaneous Operator Questions
Q21: Write a program that increments a number without using + or ++ operators.
Hint : Use bitwise - (~x) .

class Assignment{
	public static void main (String args[]){
		int a = 9;
		System.out.println("Original value : "+a+" After Increment : "+(-(~a)));
	}
}
*/
/*
Q22: Implement a calculator that takes two numbers and an operator ( + , - , * , / ) as input
and prints the result using only switch-case

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two numbers and an operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; 
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; 
        }

        
        System.out.println("Result: " + result);
    }
}
*/

/*
Q23: Given a number, find whether it is odd or even using the & bitwise operator and print
the result without using if-else .

class OddEven {
    public static void main(String[] args) {
        int number = 7; 
       String result = (number & 1) == 0 ? "Even" : "Odd";
	  System.out.println("The number " + number + " is: " + result);
    }
}
*/
/*
Q24: Write a program that prints all even numbers from 1 to 100 using only bitwise AND
( & ) and for loop.

class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
*/
/*
Q25: Implement a program that reverses an integer number without using string
conversion ( StringBuilder or toCharArray ).
Hint : Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10;

class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; 
        int reversedNumber = 0;
		System.out.println("Original number: " + number);
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; 
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
*/