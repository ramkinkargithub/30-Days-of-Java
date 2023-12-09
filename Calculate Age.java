// You can make use of java.time package 
import java.util.*;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        // Example usage
        // The values of the output assume the date 29 November 2023. The values will change based on today's date
        System.out.println(java.util.Arrays.toString(calculateAge("10-06-2023"))); // Expected Format : [19, 5, 0] 
        System.out.println(java.util.Arrays.toString(calculateAge("12-11-1993"))); // Expected Format: [17, 0, 30]
    }

    // complete writing the method
    public static int[] calculateAge(String dob) {

        int day=0,month=0,year=0;
        for(int i=0;i<dob.length();i++){
            //code to calculate day, month ,year
        }
        
        LocalDate currentDate = LocalDate.now();
        
        int days = currentDate.getDayOfMonth();
        int months = currentDate.getMonthValue();
        int years = currentDate.getYear();

        days=day-prevDay;
        months=month-prevMonth;
        years=year-prevYear;
        // expected output format
        return new int[]{days, months, years};
    }
}
