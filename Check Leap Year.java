// Leap Year Calculation:

//     A year is a leap year if it is divisible by 4.
//     However, if the year is also divisible by 100, it is not a leap year, unless...
//     The year is also divisible by 400. In this case, it is a leap year.
//     Example: The year 2000 is a leap year because it is divisible by 400. However, 1900 is not a leap year because, although divisible by 100, it is not divisible by 400.
class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println("2000 is leap year: " + isLeapYear(2000)); // Should return true
        System.out.println("1989 is leap year: " + isLeapYear(1989)); // Should return false
        System.out.println("2100 is leap year: " + isLeapYear(2100)); // Should return false
    }

    // Implement the "isLeapYear" method
    public static Boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        return false;
    }
}

