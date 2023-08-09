import java.util.LinkedList;

class Main {
    public static LinkedList<Integer> divisors(int num) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        //10
        for (int i = 1; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {  //10%1 == 0, 10%2 == 0,10%3 != 0,10%5 == 0
                result.add(i); //[1,10,2,5 ]
                if (num/i != i) { //10/1 != 1, 10/2 != 2,10/5 != 5
                    result.add(num/i); //10/1 -> 10
                }
            }
        }
        return result;
    }

    public static LinkedList<Integer> findDivisors(int n) {
        LinkedList<Integer> result = new LinkedList<Integer>();
	        for (int i=1;i<=n;i++)
	            if (n % i == 0) {
                    result.add(i);
                }
	        return result;   
	    }

public static void main(String[] args) {
    System.out.println(divisors(10));
    System.out.println(divisors(1));
    System.out.println(divisors(2));
    System.out.println(divisors(7));
    System.out.println(divisors(124));
    
    System.out.println(findDivisors(10));
    System.out.println(findDivisors(1));
    System.out.println(findDivisors(2));
    System.out.println(findDivisors(7));
    System.out.println(findDivisors(124));
    }
}