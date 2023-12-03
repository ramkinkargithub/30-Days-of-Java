// Binary to Decimal Converter
class Main {
    public static void main(String[] args) {
        // Example function calls
        System.out.println(binaryToDecimal("1010")); // Should output 10
        System.out.println(binaryToDecimal("111")); // Should output 7
        System.out.println(binaryToDecimal("100")); // Should output 4
        System.out.println(binaryToDecimal("1010101")); // Should output 85
        System.out.println(binaryToDecimal("10a1")); // Uncomment to test invalid input
    }

   // Implement the "binaryToDecimal" method here
   public static int binaryToDecimal(String num){
    int ans=0,k=0;
    for(int i=num.length()-1;i>=0;i--){
        if(num.charAt(i)=='1')
        ans+=((int)Math.pow(2, k));
        else if(num.charAt(i)!='0'){
            throw new IllegalArgumentException("invalid input "+ num.charAt(i));
        }
        k++;
    }
    return ans;
   }
}
