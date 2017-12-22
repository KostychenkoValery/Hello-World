public class tC_to_tF {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double a = 5, b = 9;
        int  x = 32;
        double fahrenheit;
        fahrenheit = b/a * celsium + x;
        return fahrenheit;
    }
}
//TC=(TF-32)*5/9