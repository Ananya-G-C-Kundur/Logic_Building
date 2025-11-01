public class SimpleConditions{

    // Problem 1 : Take a number and print whether it's positive, negative , zero
    public static void positiveNegativeZero (int number)
    {
        if (number < 0)
        {
            System.out.println(number + " " + "=" + " " +"Number is Negative");
        }
        else if (number > 0)
        {
            System.out.println(number + " " + "=" + " " +"Number is Positive");
        }
        else
        {
            System.out.println(number + " " + "=" + " " +"Number is zero");
        }
    }

    // Problem 2 : check if the given number is even or odd
    public static void evenOdd(int number)
    {
        if (number % 2 == 0)
        {
            System.out.println(number + " " + "is even");
        }
        else
        {
            System.out.println(number + " " + "is odd");
        }
    }

    // Problem 3 : Check if the number is divisible by 5
    public static void divisibleBy5(int number)
    {
        if (number % 5 == 0)
        {
            System.out.println(number + " " + "number is divisible by 5");
        }
        else
        {
            System.out.println(number + " " + "number is not divisible by 5");
        }
    }

    // Problem 4 : check if the number is divisible by 5 and 3
    public static void divisibleBy3and5(int number)
    {
        if ((number % 3 == 0) && (number % 5 == 0))
        {
            System.out.println(number + " " + "number is divisible by 3 and 5");
        }
        else
        {
            System.out.println(number + " " + "number is not divisible by 3 and 5");
        }
    }

    // Problem 5 : check if the given year is a leap year
    public static void isLeap(int year)
    {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
        {
            System.out.println(year + " " + "is a leap year");
        }
        else
        {
            System.out.println(year + " " + "not a leap year");
        }
    }

    // Problem 6 : Take two numbers and print the larger one
    public static void largerIn2(int num1 , int num2)
    {
        if (num1 > num2)
        {
            System.out.println(num1 + " " + "is greater (num1)");
        }
        else
        {
            System.out.println(num2 + " " + "is greater (num2)");
        }
    }

    // Problem 7 : Take 3 number and print the larger
    public static void largestOf3(int num1 , int num2 , int num3)
    {
        if ((num1 > num2) && (num1 > num3))
        {
            System.out.println(num1 + " " + "is greater (num1)");
        }
        else if ((num2 > num1) && (num2 > num3))
        {
            System.out.println(num2 + " " + "is greater (num2)");   
        }
        else
        {
            System.out.println(num3 + " " + "is greater (num3)");
        }
    }

    // Problem 8 : Take a temperature value and print "cold" "warm" "hot" using range condition
    public static void isTemperature(double temp)
    {
        if ((temp > 0) && (temp < 30))
        {
            System.out.println("cold");
        }
        else if ((temp > 30) && (temp < 60))
        {
            System.out.println("warm");
        }
        else
        {
            System.out.println("hot");
        }
    }

    // Problem 9 : Is the given character is vowel or consonant
    public static void vowelOrConsonant(char ch)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
        || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }

    // Problem 10 : is the given character is digit , uppercase , lowercase , Special character
   public static void isCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
   }
    public static void main(String[] args) {
        
        // Problem 1
        positiveNegativeZero(-1); //Number is Negative
        positiveNegativeZero(1); // Number is Positive
        positiveNegativeZero(0); // Number is Zero

        // Problem 2
        evenOdd(2); // even
        evenOdd(1); // odd

        // Problem 3
        divisibleBy5(2);  // not divisible by 5
        divisibleBy5(5);  // divisible by 5

        // Problem 4
        divisibleBy3and5(15); // divisible by 3 and 5
        divisibleBy3and5(5);  // not divisible by 3 and 5

        // Problem 5
        isLeap(2025); // Not a leap year
        isLeap(2004); // Leap year

        // Problem 6
        largerIn2(3, 1); // num1 is greater
        largerIn2(1, 2); // num2 is greater

        // Problem 7
        largestOf3(5, 3, 2); // num1 is greatest
        largestOf3(2, 7, 3); // num2 is greatest
        largestOf3(1, 2, 9); // num3 is greatest

        // Problem 8
        isTemperature(3.0); // cold
        isTemperature(40.0); // warm
        isTemperature(90.0); // hot

        // Problem 9
        vowelOrConsonant('a'); // vowel
        vowelOrConsonant('b'); // consonantes

        // Problem 10
        isCharacter('A'); // uppercase
        isCharacter('a'); // lowercase
        isCharacter('1'); // digit
        isCharacter('@'); // special character
    }
}