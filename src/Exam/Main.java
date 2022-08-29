package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arrayOf100 = { //missing number for my case is 36
            1,2,3,4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
            26,27, 28,29,30,31,32,33,34,35,37,38,39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,
            72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,
            95,96,97,98,99,100
        };

        int[] arrayOfDubs = {4, 5, 8, 6, 7, 8, 9};
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(2);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(10);

        String str1="My name is Bonface and p@ssword = @Bonnie#####BBM";

        System.out.print("Missing number is: ");
        System.out.println(solution.findMissingNumber(arrayOf100));

        System.out.println("Duplicate is: "+solution.findDuplicateNumber(arrayOfDubs));
        System.out.println("Converted list: "+ Arrays.toString(solution.convertToArray(myList)));
        System.out.println("Shuffled list: "+solution.shuffleElements(myList));
        System.out.println("Maximum: "+solution.findMax(myList));
        System.out.println("Minimum: "+solution.findMin(myList));
        System.out.println("Sorted Array: "+ Arrays.toString(solution.sortArray(arrayOfDubs)));
        System.out.println("the number of alphabets in the given string is:"+solution.alphabetCount(str1));
        System.out.println("The number of vowels, consonants, digits and white space characters:" +
                solution.countOfAlphabetsDigitsAndWhiteSpaces(str1));

        System.out.println("Traversal:");
        solution.listTraversal(myList);
    }
}
