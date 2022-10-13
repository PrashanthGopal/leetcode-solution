class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        
        char[] characters = s.toCharArray();
        int i =0;
        int j =s.length() -1;
        while(i<j){
            while(i<j && !vowels.contains(characters[i])){
                i++;
            }
            while(i<j && !vowels.contains(characters[j])){
                j--;
            }
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return new String(characters);
    }
}