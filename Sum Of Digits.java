class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of digits (5): " + sumOfDigits(5));  // Expected Output: 5
        System.out.println("Sum of digits (34): " + sumOfDigits(34));  // Expected Output: 7
        System.out.println("Sum of digits (129): " + sumOfDigits(129)); // Expected Output: 3
        System.out.println("Sum of digits (54321): " + sumOfDigits(54321)); // Expected Output: 6
    }

    // Create the sumOfDigits method here
    public static int sumOfDigits(int num){
        int sum=0;
        if(num/10==0)
            return num;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sumOfDigits(sum);
    }
}
