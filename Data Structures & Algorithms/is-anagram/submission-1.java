class Solution {
    public boolean isAnagram(String s, String t) {
        
        //If the lengths are different , they cant be anagrams
        if(s.length() != t.length()){
            return false;
        }
        

        //create an array to count character frequencies

        int[] charCounts = new int[26]; //assuming only lowercase english letters

        //Increment count for each char in 's' and decrement for each in 't'

        for(int i=0; i<s.length();i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //check if all counts are 0

        for(int count : charCounts){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
