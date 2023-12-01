// Palindrome Checker
class Main {
    public static void main(String[] args) {
        // Test cases to verify the implementation
        System.out.println(isPalindrome("racecar")); // Should return true
        System.out.println(isPalindrome("A man, a plan, a canal ? Panama")); // Should return true
        System.out.println(isPalindrome("codedamn")); // Should return false
    }
    
    // Implement the "isPalindrome" method here
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while( i<j ){
            if(!Character.isAlphabetic(str.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(str.charAt(j))){
                j--;
                continue;
            }
            if(Character.toUpperCase(str.charAt(i))!=Character.toUpperCase(str.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
