import java.util.Scanner;
import java.io.*;

public class WordCount
{
    public static void main(String[] args) throws FileNotFoundException
    {


          //declaration
            int lines = 0; //line count
            int words = 0; //word count
            int chars = 0; //char count
            int counter = 0; //counter for the split string array
            String wordAndCharCounter; //used in finding the number of words and characters
            String[] numOfWords; //creating a string array for computing the number of words

            
            Scanner fileInput = new Scanner(new File("myEssay.txt")); //creating a new scanner and new file called "myEssay.txt"

            while (fileInput.hasNextLine()) { //counting the lines
                lines++;
                wordAndCharCounter = fileInput.nextLine(); //setting the line to a string  to be split
                numOfWords = wordAndCharCounter.split(" "); //splitting the line into an array of strings, the length will be the words
               words += numOfWords.length; //setting the number of words to the int words
               
               for (counter = 0; counter < numOfWords.length; counter++) { //for loop for computing the amount of characters 
                   chars += numOfWords[counter].length(); //setting the int chars to the length of each word 
               }
                
            }
            System.out.println("The file had " + lines + " lines, " + words + " words, and " + chars + " characters."); 
            fileInput.close();
        }


        
    }

