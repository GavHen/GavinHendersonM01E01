package Module1;

public class Conversion {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("----------------|-------------------");
        for (int i = 1; i <= 10; i++) { /** display the feet to meter conversion*/
            double feet = i;
            double meters = footToMeter(feet);
            double metersRounded = Math.round(meters * 1000.0) / 1000.0;
            System.out.printf("%.1f\t%.3f\t|\t", feet, metersRounded);
            
            /** displays the meter to feet conversion */
            double metersInput = i * 5 + 15;
            double feetConverted = meterToFoot(metersInput);
            double feetConvertedRounded = Math.round(feetConverted * 1000.0) / 1000.0;
            System.out.printf("%.1f\t%.3f%n", metersInput, feetConvertedRounded);
        }
    }
}
