 // Reverse a string
class Main {
    public static void main(String[] args) {
        // Example usage of the reverseString method
        String example1 = reverseString("codedamn");
        String example2 = reverseString("123");

        // Output the results
        System.out.println(example1); // Expected output: nmadedoc
        System.out.println(example2); // Expected output: 321
    }


    // Create "reverseString" method to reverse a string
    public static String reverseString(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
}
