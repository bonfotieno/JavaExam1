package Exam;
import java.util.*;

public class Solution {
    public int findMissingNumber(int[] numArray){
        int sumOfAll = (100*(100+1))/2;
        int sumOfNumArray = 0;
        for(int i=0; i<=100-2; i++) {
            sumOfNumArray = sumOfNumArray+numArray[i];
        }
        int missingNo = sumOfAll-sumOfNumArray;
        return missingNo;
    }

    public int findDuplicateNumber(int[] numArray){
        int n = numArray.length;

        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (numArray[k] == numArray[i])
                    return numArray[i];
            }
        }
        return -1;   // -1 means No duplicate found
    }

    public void listTraversal(List<Integer> list){
        Iterator<Integer> listIterator = list.iterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }

    public Integer[] convertToArray(List<Integer> list){
        return list.toArray(new Integer[0]);
    }

    public List<Integer> shuffleElements(List<Integer> list){
        Collections.shuffle(list);
        return list;
    }

    public Integer findMax(List<Integer> list){
        return Collections.max(list);
    }

    public Integer findMin(List<Integer> list){
        return Collections.min(list);
    }

    public int[] sortArray(int[] numArray){
        Arrays.sort(numArray);
        return numArray;
    }

    public HashMap<String, Integer> countOfAlphabetsDigitsAndWhiteSpaces(String str){
        int vowels = 0, consonant = 0, whiteSpace = 0, digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
            else if (ch >= '0' && ch <= '9')
                digit++;
            else if (ch == ' ')
                whiteSpace++;
        }

        int finalVowels = vowels;
        int finalConsonant = consonant;
        int finalDigit = digit;
        int finalWhiteSpace = whiteSpace;
        return new HashMap<>(){{
            put("Vowels: ", finalVowels);
            put("Consonant: ", finalConsonant);
            put("Digit: ", finalDigit);
            put("White Spaces: ", finalWhiteSpace);
        }};
    }

    public int alphabetCount(String str){
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
                count++;
        }
        return count;
    }

}
