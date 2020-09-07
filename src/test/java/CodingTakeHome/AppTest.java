package CodingTakeHome;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class AppTest 
{
    SoftAssertions softly = new SoftAssertions();
    @Test
    public void shouldAnswerWithTrue()
    {
        softly.assertThat(Palindromes.classifyPalindrome("Stats"))
                .as("Validating palindrome classification" )
                .isEqualTo("Stats (Single Word Palindrome)");
        softly.assertAll();

        System.out.println(Palindromes.classifyPalindrome("Stats"));
        System.out.println(Palindromes.classifyPalindrome("Taco cat"));
        System.out.println(Palindromes.classifyPalindrome("Step on no pets!!"));
        System.out.println(Palindromes.classifyPalindrome("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era."));
        System.out.println(Palindromes.classifyPalindrome("King, are you glad you are king?"));
    }
}
