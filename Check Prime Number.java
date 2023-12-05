    import java.lang.Math;
    class Main {
    public static void main(String[] args) {
        // Example test cases
        System.out.println("Is 0 prime? " + isPrimeNumber(0)); // Expected: false
        System.out.println("Is 3 prime? " + isPrimeNumber(3)); // Expected: true
        System.out.println("Is 2 prime? " + isPrimeNumber(2)); // Expected: true
        System.out.println("Is 99 prime? " + isPrimeNumber(99)); // Expected: false
        System.out.println("Is -5 prime? " + isPrimeNumber(-5)); // Expected: false
    }

    // Create the "isPrimeNumber" method here. Accepts Integer value as parameter and should return a boolean value
    public static boolean isPrimeNumber(int num){
        if(num<2)
            return false;
        for(int i=2;i<Math.sqrt(num);i++){
        if(num%i==0)
            return false;
        }
        return true;
    }
}
