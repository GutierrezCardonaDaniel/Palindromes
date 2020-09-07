package CodingTakeHome;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String outputString="";
        List<String> palindromes = RWFile.readInputFile("src\\main\\java\\CodingTakeHome\\Files\\InputFile.txt");

        for (String palindrome: palindromes) {
           //System.out.println(Palindromes.classifyPalindrome(palindrome));
           outputString+=Palindromes.classifyPalindrome(palindrome)+"\n";
        }
        RWFile.WriteOutputFile("src\\main\\java\\CodingTakeHome\\Files\\OutputFile.txt",outputString);
    }
}
