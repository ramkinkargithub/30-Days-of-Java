// Two strings are anagrams if they contain the same characters in any order, ignoring case, spaces, and punctuation.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(isAnagram("test", "test")); // true
        System.out.println(isAnagram("Listen", "Silent")); // true
        System.out.println(isAnagram("hello", "world")); // false
        System.out.println(isAnagram("Astronomer", "Moon starer")); // true
    }

    public static boolean isAnagram(String str1, String str2) {
        // build the method here
        str1 =str1.toLowerCase();
        str2=str2.toLowerCase();
        // System.out.println(str1);
        // System.out.println(str2);
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            // System.out.println(str1.charAt(i));

            // creating map for character elements in str1
            if(Character.isAlphabetic(str1.charAt(i))){
                if(m.get(str1.charAt(i))!=null)
                    m.put(str1.charAt(i),m.get(str1.charAt(i))+1);
                else
                    m.put(str1.charAt(i),1);
                // System.out.println(str1.charAt(i)+" "+m.get(str1.charAt(i)));
            }
        }
        
            // checking for same characters to be present in str2 ...and only those same characters not less and not more
            for(int j=0;j<str2.length();j++){
            if(Character.isAlphabetic(str2.charAt(j))){
                if(m.get(str2.charAt(j))==null)
                    return false;
                else
                    m.put(str2.charAt(j),m.get(str2.charAt(j))-1);
            }    
        }
        return true;
    }
}
