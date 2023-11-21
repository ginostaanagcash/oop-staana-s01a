/*
	- objects
		- allows us to represent things that have characteristics (states) and actions (behaviors)
			- example:
				- Car is an object
					- color
					- brand
					- model
					- actions (behavior)
						- moving
						- honking
						- stopping
				- Toyota Corolla - an object
	- class
		- it is like a blueprint for creating different types of cars.
	- methods
		- an action
	- instance variables	
		- unique values/what makes it different from other cars

*/
class Main{
	public static void main (String[] args){
		System.out.println("Hello");
		// declare the variable - syntax: dataType <variableName>
		int age;
		// assign data to variables
		age = 24;
		int childAge = 12;

		// print varialbes
		System.out.println(age);
		System.out.println(childAge);

		/*
			Data Types
				- int type
					- integral number
						- ex. 2, -10, 89
				- double type
					- floating-point numbers
						- ex. 54.5, 89.6
				- char type
					- single character
						- ex: 's', 't'
				- string type
					- "f", "juan"
		*/
		char ans = 'y';
		System.out.println("Are you available today? " + ans);

		String name = "Juan Dela Cruz";
		// \n inserting new line
		System.out.println("My name is\n" + name);
		System.out.println("adam \"apple\".");

		/*
			Operators:
				- Arithmetic operators
				- Relational operators
				- Logical operators
				- Assignment operators
					- (=) equal sign
		*/
		// assignment operators
		String lastName = "Sta. Ana";

		// addition assignment operators +=
		int num = 7;
		num = num + 2;

		num += 2;
		System.out.println("This is the result of addition assignment operator: " + num);

		// subtraction assignment operators -=
		num -= 1;
		System.out.println("This is the result of subtraction assignment operator: " + num);

		// multiplication assignment operators *=
		num *= 2;
		System.out.println("This is the result of multiplication assignment operator: " + num);

		// division assignment operators /=
		num /= 2;
		System.out.println("This is the result of division assignment operator: " + num);

		// modulus assignment operators %=
		num %= 2;
		System.out.println("This is the result of modulus assignment operator: " + num);

		// Arithmetic operations - + - * / % ++ (increment) -- (decrement)

		int result = num + 4;
		System.out.println("The result is: " + result);

		result = num - 2;
		System.out.println("The result is: " + result);

		// increment
		System.out.println(num);
		System.out.println(++num);//pre-increment
		System.out.println(num++);//post-increment
		System.out.println(num);

		// decrement
		System.out.println(num);
		System.out.println(--num);//pre-increment
		System.out.println(num--);//post-increment
		System.out.println(num);

		// Relational Operators == != > >= < <=
		int a = 5;
		int b = 12;

		boolean boolResult = a == b; //false
		System.out.println(boolResult);

		boolResult = a >= b; //false
		System.out.println(boolResult);

		/*
			Logical Operators
				- && (logical AND)
					- if the operands are both true, then the condition is true. Otherwise false.
				- || (logical OR)
					- if any of the 2 operands are true, then the condition becomes true.
				- ! (Logical NOT)
					- reverse the logical state
		*/
		boolResult = (a > 0) && (b < 10) || !(a == 5);
		System.out.println(boolResult);

		/*
			Conditional Operator (?:)
				- Ternary operator
					- syntax:
						variable x = (expression) ? value if true : value if false

		*/

		int min = (a < b) ? a : b;
		System.out.println("The result is: " + min);

		String msg = (a > b) ? "A is greater than B" : "B is greater than or equal to A";
		System.out.println("Message: " + msg);

		// if-elseif - else statement statement 
		/*
			if the grade is above 90, assign equivalent grade A
			if the grade is above 75, assign equivalent grade B
			if the grade is above 65, assign equivalent grade C
		*/
		int grade = 85;
		char equiv;

		if (grade > 90){
			equiv = 'A';
		} else if(grade > 75){
			equiv = 'B';
		} else if(grade > 65){	
			equiv = 'C';
		} else {
			equiv = 'D';//assign a default value

		}
		System.out.println ("The grade is " + grade + " with letter a equivalent of " + equiv);

		/*
			Switch Statement:
				switch(expression){
					case value1:
					code
					break;
				}
				*
				*
				*
				default: 
					default statements
		*/

		// Convert to switch
		switch(grade / 10){
		case 10:
		case 9:
			equiv = 'A';
			break;
		case 8:
			equiv = 'B';
			//break;
		case 7:
			equiv = 'C';
			break;
		default:
			equiv = 'D';
			break;	
		}
		System.out.println ("The grade is " + grade + " with letter a equivalent of " + equiv);

		// Loops
		// for loops
		for (int i = 0; i <= 5; i++){
			System.out.println(i);
		}

		int n = 7;
		for (int i = 1; i <= n; ++i){
			System.out.println("Hello! My name is Sarah. How are you?");
		}

		int sum = 0;
		int max = 1000;
		for (int i = 1; i <= max; ++i){
			sum += 1;
		}
		System.out.println ("Sum = " + sum);

		/*
			for each - alternative for loop
				syntax: for(dataType item : arrayName){
					code block
				}
		*/

		// for each - alternative for loop
		// create an array
		int[] numbers = {2, 4, 6, 8};

		for (int number: numbers){
			System.out.println(number);
		}

		// vowels for loop
		char[] vowels =	 {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < vowels.length; ++i){
			System.out.println(vowels[i]);
		}

		// vowels for each loop
		//char[] vowels =	 {'a', 'e', 'i', 'o', 'u'};
		for (char item : vowels){
			System.out.println(item);
		}

		// while loop
		/*
			while (expression){
				code block
			}
		*/
		int k = 1, p =5;

		while (k <= p){
			System.out.println(k);
			k++;
		}

		/* 
			do-while loop
			do{
				code block
			} while (expression)
		*/
		int c = 1, d = 4;
		do{
			System.out.println(c);
			c++;
		} while (c <= d);

	}
}