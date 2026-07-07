package algorithms;
// Concatenate Non-Zero Digits of a Number and Multiply by the Sum of its Digits
// You are given an integer n.
// Form a new integer x by concatenating all the non-zero digits of n in their original order. 
// If there are no non-zero digits, x = 0.
// Let sum be the sum of digits in x.
// Return an integer representing the value of x * sum.

public class SumAndMultiply {
    public long sumAndMultiply(int n) {
        if (n <= 0) {
            return 0;
        }
        long finalResult;
        String numberToString = ""+ n;
        String numberInOrderOfnWithoutZero = "";
        for (int i = 0; i < numberToString.length(); i++) {
            if(numberToString.charAt(i) == '0') continue;
            numberInOrderOfnWithoutZero +=numberToString.charAt(i);
        }
        int sum = 0;
        for (int i = 0; i < numberInOrderOfnWithoutZero.length(); i++) {
            sum += Integer.parseInt(""+numberInOrderOfnWithoutZero.charAt(i));
        }
        finalResult = Long.parseLong(numberInOrderOfnWithoutZero) * sum;
        return finalResult;
    }

}
