
import java.util.*;

public class FirstNonRepeatingCharacter {

    private HashSet<Character> repeatedCharSet =null;
    private ArrayList<Character> nonRepeatedCharList =null;

    public  char findFirstNonRepeatingChar(String input) throws Exception {
        if ( input == null || input.trim().equals("") ) {
            throw new Exception("Input Can't be Null of Empty");
        }
        char result = '\0';
        nonRepeatedCharList = new ArrayList<Character>();
        for(int index = 0; index < input.length(); index++) {

            char currentValue = input.charAt(index);
            currentValue = Character.toLowerCase(currentValue);

            boolean isNonRepeatedCharacter = !isRepeatedCharacter(currentValue);
            boolean isContainedInNonRepeatedMap = isNonRepeatableMapContainsCharacter(currentValue);

            if( isContainedInNonRepeatedMap ){
                refactorRepeatedCharSetAndNonRepeatedCharMap(currentValue);
            } else if(isNonRepeatedCharacter) {
                nonRepeatedCharList.add(currentValue);
            }
        }
        result = nonRepeatedCharList.get(0);
        return result;
    }


    public boolean isRepeatedCharacter (char input) {
        return null != repeatedCharSet && repeatedCharSet.contains(input) ;
    }

    public  void refactorRepeatedCharSetAndNonRepeatedCharMap(char input) {
        nonRepeatedCharList.remove( nonRepeatedCharList.indexOf(input) );
        if(repeatedCharSet == null ){
            repeatedCharSet = new HashSet<>();
        }
        repeatedCharSet.add(input);
    }

    public boolean isNonRepeatableMapContainsCharacter(char input){
        return !nonRepeatedCharList.isEmpty() && nonRepeatedCharList.contains(input);
    }



}
