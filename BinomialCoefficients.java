import java.util.ArrayList;

public class BinomialCoefficients
{
    public static long factorial(int n)
    {
        if(n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static long binomialCoefficient(int n, int k)
    {
        long nFactorial = factorial(n);
        long kFactorial = factorial(k);
        long nMinusKFactorial = factorial(n - k);
        return nFactorial/(kFactorial * nMinusKFactorial);
    }

    public static ArrayList<Long> binomialCoefficients(int n)
    {
        ArrayList<Long> binomialCoefficients = new ArrayList<>(n);
        for(int i = 0; i <= n; i++) binomialCoefficients.add(binomialCoefficient(n, i));
        return binomialCoefficients;
    }

    public static void printBinomialCoefficients(int n)
    {
        System.out.println("Binomial coefficients of n = " + n + " and 0 ≤ k ≤ n: " + binomialCoefficients(n));
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("Binomial Coefficients: ");
        System.out.println("The binomial coefficient C(n, k) counts the number of ways to form an unordered collection of k items chosen from a collection of n distinct items.");
        System.out.println("Binomial coefficients are crucial in the application of the binomial theorem, which shows us how to expand any whole-number power of a binomial.");
        System.out.println("The binomial theorem has several important applications in combinatorics, algebra, calculus, and probability, along with many other disciplines of math.");
        System.out.println("Here is the binomial coefficient algorithm in action, calculating the binomial coefficient of various values of n and k from 0 to 20: ");
        System.out.println();

       for(int i = 0; i <= 20; i++) printBinomialCoefficients(i);
    }
}
