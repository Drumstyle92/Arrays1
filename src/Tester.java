import java.util.Arrays;

/**
 * @author Drumstyle92
 * class containing the core of the program.
 */
public class Tester {
    /**
     *
     * @param args main parameter of the method.
     * The main method where we find arrays and prints on them.
     */
    public static void main(String[] args) {
        String[] carBrands = new String[]{"BMW","FIAT","ALFA","MASERATI","AUDI"};
        System.out.println("------------------------------------------------------");
        System.out.println("The length of the carBrands array is " + carBrands.length);
        System.out.println("------------------------------------------------------");
        System.out.println("index 3 of the carBrands array is " + carBrands[2]);
        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        System.out.println("------------------------------------------------------");
        System.out.println("The total contents of the primeNumbers array is " + Arrays.toString(primeNumbers));

    }
}
