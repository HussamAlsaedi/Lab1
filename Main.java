import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        * Write a Java program to print
        *  the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
        * */
        Scanner input = new Scanner(System.in);

     /*   System.out.println("Input first number: " );
        int first_num = input.nextInt();
        System.out.println("Input second number: ");
        int second_num = input.nextInt();

        int addition_sum = first_num + second_num;
        int subtract_sum = first_num - second_num;
        int multiply_sum  = first_num * second_num;
        int division_sum  = first_num / second_num;
        int remainder_two_numbers_sum  = first_num % second_num;

        System.out.printf(" %d + %d = %d \n", first_num, second_num, addition_sum);
        System.out.printf(" %d - %d = %d \n", first_num, second_num, subtract_sum);
        System.out.printf(" %d * %d = %d \n", first_num, second_num, multiply_sum );
        System.out.printf(" %d / %d = %d \n", first_num, second_num,division_sum );
        System.out.printf(" %d mod %d = %d \n", first_num, second_num, remainder_two_numbers_sum );*/

// ----------------------------------------------------------------------------------------------------------------------------


        /*
        * 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8 Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
* */

        /*
        System.out.println("Input a number:: " );
        int multiplication = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            int addition_sum = i * multiplication;
            System.out.printf(" %d + %d = %d \n", multiplication, i, addition_sum);

        }*/



// ----------------------------------------------------------------------------------------------------------------------------

/*        3. Write a Java program to print the area and perimeter of a circle.
        2
        Test Data: Radius = 7.5 Expected Output Perimeter is = 47.12388980384689 Area is = 176.71458676442586
   */
        /*System.out.println("Input Radius : " );
        double radius = input.nextDouble();

        System.out.println("Perimeter = " + (2 * Math.PI * radius));
        System.out.println("Area = " + (Math.PI * Math.pow(radius, 2)));
*/

// ------ 4. Java program to find out the average of a set of integers ----------------------------------------------------------------------------------------------------------------------

/*
        System.out.println("Enter the count of numbers: " );
        int count_numbers = input.nextInt();
        double sum=0 ;
        double average=0 ;

        for (int i = 1; i <= count_numbers; i++) {
            System.out.println("Enter an integer:" );
            int integers = input.nextInt();
            sum =+ integers;

            }
        average = sum / count_numbers;
        System.out.println("The average integers is " +  average);
        }*/



// ----------------------------------------------------------------------------------------------------------------------------
/*
* 5. Write a Java program that accepts three integers as input, adds the first two integers together,
* and then determines whether the sum is equal to the third integer.
3
Sample Output: Input the first number : 5 Input the second number: 10 Input the third number : 15 The result is: true --------
* Input the first number : 10 Input the second number: 20 Input the third number : 25 The result is: false*/

/*

            System.out.println("Input the first number: " );
            int first_number = input.nextInt();

            System.out.println("Input the second number: " );
            int second_numbers = input.nextInt();

            System.out.println("Input the second number: " );
             int third_numbers = input.nextInt();

             if (first_number + second_numbers == third_numbers) {
                 System.out.println("true");
             }else {
                System.out.println("false");
             }
*/





// ----------------------------------------------------------------------------------------------------------------------------

        /*6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd*/

       /* System.out.println("Input a word: " );
        String name = input.nextLine();

        char[] characters = name.toCharArray();
        String reversed = "";

        for (int i = characters.length - 1; i >= 0; i--) {

            reversed += characters[i];
        }

        System.out.println("Reversed: " + reversed);*/


// ----------------------------------------------------------------------------------------------------------------------------

        /*
        * 7 - Java program to check whether the given number is even or odd
Enter a number:
33
The number is Odd
Enter a number:
24
The number is Even*/

       /* System.out.println("Input a number : " );
        int number = input.nextInt();

        if (number % 2 ==0 ){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }


        */
// ----------------------------------------------------------------------------------------------------------------------------

        /*
        * 8 - Java program to convert the temperature in Centigrade to Fahrenheit
4
Enter temperature in Centigrade:*/
/*        System.out.println("Enter temperature in Centigrade: ");
        double celsius = input.nextDouble();
       double Fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit is:"+ Fahrenheit);*/
// ----------------------------------------------------------------------------------------------------------------------------

        /*
        * Write a Java program that takes a string and a number from the user,then prints the character in the given index*/

/*
        System.out.println("Input a string: ");
        String word = input.nextLine();

        System.out.println("Input a number:");
        int number = input.nextInt();
        char[] characters = word.toCharArray();

        String [] words = new String[characters.length];


        for (int i = 0; i < characters.length; i++) {
            words[i] = String.valueOf(characters[i]);
        }

        System.out.println(words[number] );*/



// ----------------------------------------------------------------------------------------------------------------------------

        /*
        * 10. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
* */
/*
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Area is %s * %s = %s \n" ,length, width  ,area);
        System.out.printf("perimeter is 2 * ( %s * %s = %s )",length, width  ,perimeter);*/


// ----------------------------------------------------------------------------------------------------------------------------
/*11. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39*/
/*        System.out.println("Input first integer: " );
        int first_number = input.nextInt();

        System.out.println("Input second integer: " );
        int second_numbers = input.nextInt();

        if(first_number != second_numbers){
            System.out.printf("%d != %d \n", first_number, second_numbers);
        }
        if(first_number < second_numbers){
            System.out.printf("%d < %d \n", first_number, second_numbers);
        }
        if(first_number <= second_numbers){
            System.out.printf("%d <=  %d \n", first_number, second_numbers);
        }*/
// ----------------------------------------------------------------------------------------------------------------------------

/*
* 12. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:
Input seconds: 86399
23:59:59
* */
/*
        System.out.println("Input seconds:");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;

        int minutes = remaining / 60;

        int seconds = remaining % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);*/
        
        
        /// ---------------------------------------------

       /* 13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
                Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!*/
     /*
        System.out.println("Input first integer: " );
        int first_number = input.nextInt();

        System.out.println("Input second integer: " );
        int second_numbers = input.nextInt();
        
        System.out.println("Input third integer: " );
        int third_numbers = input.nextInt();
        
        System.out.println("Input fourth integer: " );
        int fourth_numbers = input.nextInt();

        if (first_number == second_numbers && third_numbers  == fourth_numbers ) {
            System.out.println("Numbers are equal");
            
        }else {
            System.out.println("Numbers are not equal");
        }
        */



      /*  // 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

        System.out.println("Input integer: " );
        int first_number_integer = input.nextInt();

        if (first_number_integer <= -0 ) {
            System.out.println("Number is Negative");
        }else if (first_number_integer == 0 ) {
            System.out.println("Number is Zero");
        }else if (first_number_integer >= 1) {
            System.out.println("Number is positive");
        }*/

   /*     15.Write a program to enter the numbers till the user wants and at the end it
    should display the count of positive, negative and zeros entered  (End loop use -1 , Don’t count -1).
                Test data

        2 positives*/
     /*   int first_number_integer=0;
        int sum_zero=0;
        int sum_positive=0;
        int sum_negative=0;

        while (first_number_integer != -1) {
            System.out.println("Input integers or -1 to quit: " );
            first_number_integer = input.nextInt();

            if (first_number_integer ==0) {
                sum_zero=+1;
            }
            if (first_number_integer >=-0) {
                if (first_number_integer == -1) {

                }else {
                sum_negative=sum_negative+1;}
            }

            if (first_number_integer >  0) {
                sum_positive=sum_negative+1;

            }

        }

        System.out.println("count of positive: " +(sum_positive-1));
        System.out.println("count of negative: " + (sum_negative-1));
        System.out.println("count of zeros : " + sum_zero );
*/

        /*
        * 16 - Write a program that prompts the user to input an integer and then outputs thenumber with the digits reversed.
example, if the input is 12345, the output should be 54321.
* */

        /*System.out.println("Input a numbers: " );
        String name = input.nextLine();

        char[] characters = name.toCharArray();
        String reversed = "";

        for (int i = characters.length - 1; i >= 0; i--) {

            reversed += characters[i];
        }

        System.out.println("Reversed: " + reversed);*/


        /* 17 */

/*
        int largest =0;
        int smallest = 0;
        int num;

        do {
            System.out.print("Enter the number: ");
            num = input.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }



        } while (num != -1);

        System.out.println("the largest number: " + largest);
        System.out.println("the smallest number: " + smallest);
        */
 /*
 * 18 - Determine and print the number of times the character ‘a’ appears in the input entered by the user.*/


        System.out.println("Input a word: " );
        String name = input.nextLine();

        char[] characters = name.toCharArray();
        int sum_Number_a = 0;

        for (int i = characters.length - 1; i >= 0; i--) {
            if (characters[i]== 'a') {
                sum_Number_a=sum_Number_a + 1;
            }

        }

        System.out.println("Number of a's: " + sum_Number_a);
    }





}