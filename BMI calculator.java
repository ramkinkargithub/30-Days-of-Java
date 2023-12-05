class Main {
    public static void main(String[] args) {
        // Test cases can be added here to validate the method's functionality.

        // Test case 1
        Object[] result1 = calculateBMI(170, 65); // height in cm, weight in kg
        System.out.println("BMI: " + result1[0] + ", Category: " + result1[1]);

        // Test case 2
        Object[] result2 = calculateBMI(180, 77); // height in cm, weight in kg
        System.out.println("BMI: " + result2[0] + ", Category: " + result2[1]);

        // Test case 3
        Object[] result3 = calculateBMI(190, 92); // height in cm, weight in kg
        System.out.println("BMI: " + result3[0] + ", Category: " + result3[1]);
    }

    // Create the calculateBMI Method here
    public static Object[] calculateBMI(double height, double weight){

        double BMI = (weight*100*100)/(height*height);
        Object[] ans = new Object[2];
        double BMI2 = (double) Math.round(BMI * 100.0)/100.0;
        ans[0]=BMI2;
        if(BMI2 < 18.5)
            ans[1]= "Underweight";
        else if (BMI2>=18.5 && BMI2<=24.9 )
            ans[1]="Healthy";
        else if (BMI2 >=25.0 && BMI2<=29.9 )
            ans[1]="Overweight";
        else
        ans[1]= "Obesity";
       return ans;
    }
}
