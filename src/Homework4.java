import java.util.Locale;

public class Homework4 {
    /**
     * Assign result as true if length of sentence_3 is greater than 10
     * else assign false
     * Hint: use ternary operator
     */

    public static void main(String[] args) {
        //String sentence_3 = "hello dear, how are you?";
        //boolean result;
        //int sentence3Length = sentence_3.length();
        //result = sentence3Length > 10 ? true : false;
        //System.out.println("result-->" + result);

        //Replace all 'r' with 'f' (Ignore cases)
        //String sentence_4 = "We ARe Good ProgRammeR";
        //String sentence4Replace = sentence_4.replace('R', 'r');
        //String sentence4ReplaceR = sentence4Replace.replace('r', 'f');
        //System.out.println("We ARe Good ProgRammeR after r replaced with f:" + sentence4ReplaceR);

//1.Display length of your fullname
//2.Does your name start with 'k' (ignore cases)
//3. Does your name contain 'a' (ignore cases)
        String fullName = "Francisco Gutierrez";
        int fullNameLength = fullName.length();
        String fullNameToLowerCase = fullName.toLowerCase( );
        boolean isFullNameToLowerCaseStartsWith_k = fullNameToLowerCase.startsWith("k");
        boolean isFullNameContains =fullNameToLowerCase.contains("a");
        System.out.println(fullNameLength + ( " Does "+ fullName + " starts with k? " + isFullNameToLowerCaseStartsWith_k) + (" Does "+ fullName + " contains a? " + isFullNameContains));
    }
}