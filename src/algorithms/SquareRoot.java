package algorithms;
/*
*Given a non-negative integer x, return the square root of x rounded down to the 
* nearest integer . 
*The returned integer should be non-negative as well. 
*You must not use any built-in exponent funtion or operator.
 */
public class SquareRoot {
    public int mySqrtMethod1(int x){
        if(x < 2) return x;
        int possibleMaxNumber = x/2;
        for(int i=1; i<=possibleMaxNumber; i++){
            if(i*i == x) return i;
            if(i*i > x) return i-1; 
        }
        return -1;
    }
    public int mySqrtMethod2Better(int x){
        if ( x < 2) return x; 
        int left = 1;
        int right = x / 2;

        while (left <= right){
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;
            if(sq == x) return mid;
            if(sq < x ) left +=1;
            else right = mid -1;
        }
        return right;
    }
}
