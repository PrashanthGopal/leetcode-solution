/*
Generate all permutations of a string in Java – Recursive and Iterative

Write a Java program to generate all permutations of a string.

For example, the string ABC has 6 permutations, i.e., ABC, ACB, BAC, BCA, CBA, CAB.

*/

class Main
{
    // Utility function to swap two characters in a character array
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
 
        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
 
    public static void findPermutations(String str) {
 
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
 
    // generate all permutations of a string in Java
    public static void main(String[] args)
    {
        String str = "ABC";
        findPermutations(str);
    }
}
