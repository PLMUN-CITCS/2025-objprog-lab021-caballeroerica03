import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as the sentence
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        // Split the sentence by one or more spaces and count the resulting words
        String[] words = sentence.trim().split("\\s+");
        
        // If the sentence is empty, the resulting array will be empty, so return 0
        if (sentence.trim().isEmpty()) {
            return 0;
        }
        
        return words.length;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get the sentence from the user
        String sentence = getSentenceInput();
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the result to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
Ipinadala mo
prob#5
B Elle
B Elle Reyes-Bulacan
may pasok tayo bukas ?
Ipinadala mo
walley
Eunice
Eunice G Lanz
7am my ftf ba tau
Ipinadala mo
wala pasok Muntinlupa day
Eunice
Ay gnun 😁
Eunice
Eunice G Lanz
Slmt mille
Biy 3:57 AM
B Elle
B Elle Reyes-Bulacan
ayy oo nga pala
Lun 1:18 AM
Ipinadala mo
using System;

public class FactorialCalculator
{
    
    public static int GetNonNegativeInteger()
    {
        int number;

        
        Console.Write("Enter a non-negative integer: ");
        while (!int.TryParse(Console.ReadLine(), out number) || number < 0)
        {
    
            Console.WriteLine("Please enter a valid non-negative integer.");
            Console.Write("Enter a non-negative integer: ");
        }

        return number;
    }

    
    public static long CalculateFactorial(int n)
    {
        if (n == 0)
        {
            return 1; 
        }

        long factorial = 1;
        
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }

        return factorial;
    }

    public static void Main()
    {
        
        int number = GetNonNegativeInteger();

        
        long factorial = CalculateFactorial(number);

        
        Console.WriteLine($"The factorial of {number} is: {factorial}");
    }
}
