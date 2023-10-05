import java.util.Scanner;
public class Wcounter
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence or a paragraph:");
String inputText = scanner.nextLine();
int wordCount = countWords(inputText);
System.out.println("Word count: " + wordCount);
scanner.close();
}
public static int countWords(String text)
{
if (text == null || text.isEmpty()) 
{
return 0;
}
String[] words = text.split("\\s+");
return words.length;
}
}




