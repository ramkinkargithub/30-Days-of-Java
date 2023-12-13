class Main {
    public static void main(String[] args) {
        // Example usage
        double miles = 10;
        double kilometers = 16.0934;

        double convertedToKilometers = convertToKilometers(miles);
        double convertedToMiles = convertToMiles(kilometers);

        System.out.println(miles + " miles is " + convertedToKilometers + " kilometers.");
        System.out.println(kilometers + " kilometers is " + convertedToMiles + " miles.");
    }

    public static double convertToKilometers(double miles) {
        double inKm= miles*1.60934;
        return inKm;
    }

    public static double convertToMiles(double kilometers) {
        double inMiles= kilometers*0.621371; 
        return inMiles;
    }
}
