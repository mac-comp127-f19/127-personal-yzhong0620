package listPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     *
     * HINT: Use a for-each loop, and create a variable outside the loop to keep
     *       track of which item number you’re on. (Think: why does the variable
     *       have to be declared and initialized _outside_ the loop? What
     *       happens if you move it inside?)
     */

    public static List<String> numberEachItem(List<String> items) {
        List<String> newL = new ArrayList<>();
        for(String word:items) {
            word = items.indexOf(word)+1 + ". " + word;
            newL.add(word);
        }
        return newL;
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     *
     * HINT: You can declare a String variable outside the loop, much like you
     *       declared an into outside the loop in the previous example.
     *       Initialize it to an empty string, repeatedly add to it inside the
     *       loop, then return it when you're done.
     */
    public static String formatWithCommas(List<String> items) {
        String list = "";
        int sum = 0;
        for (String word:items){
            sum = sum + 1;
            if (sum!=items.size()){
                list = list + word + ", ";
            }
            else{
                list = list + word;
            }
        }
        return list;
    }

    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two and three"
     *
     *  HINT: There is no way to do this without using several conditionals.
     *        Use the test to help you. After you have it working, see if you
     *        can simplify your solution at all.
     */
    public static String formatGrammatically(List<String> items) {
        String sent = "";
        for (String word:items){
            if (items.size()==1) {
                sent = word;
            }
            else if (items.size()==2) {
                sent = items.get(0) + " and " + items.get(1);
            }
            else {
                if (items.indexOf(word)<items.size()-2){
                    sent = sent + word + ", ";
                }
                else if (items.indexOf(word)==items.size()-2){
                    sent = sent + word + " and ";
                }
                else {
                    sent = sent + word;
                }
            }
        }
        return sent;
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two, and three"   // Oxford comma after "two"
     *
     *  HINT: It is tricky to get all the cases right! Again, use the test to
     *        help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
        String comma = "";
        for (String word:items){
            if (items.size()<=1){
                comma = comma + word;
            }
            else if (items.size()==2){
                comma = items.get(0) + " and " + items.get(1);
            }
            else {
                if (items.indexOf(word)!=items.size()-1){
                    comma = comma + word + ", ";
                }
                else {
                    comma = comma + "and " + word;
                }
            }
        }
        return comma;
    }

    /*
     * Special challenge, if you are looking for something extra:
     *
     * Create the following method that can either use the Oxford comma or not,
     * depending on its second parameter:
     *
     *     public static String formatGrammatically(List<String> items, boolean oxfordComma) {
     *         ???
     *     }
     *
     * Don't implement it by using the two methods above. Instead, do it the
     * other way around. Change the methods above so they both use your new one,
     * like this:
     *
     *     public static String formatGrammatically(List<String> items) {
     *         formatGrammatically(items, false);
     *     }
     *
     *     public static String formatGrammaticallyWithOxfordComma(List<String> items) {
     *         formatGrammatically(items, true);
     *     }
     *
     * ...and see if all the tests still pass!
     */
}
