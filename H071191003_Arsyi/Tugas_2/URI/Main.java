
/**
 * By Arsyi Syarief Aziz 
 * Student ID: H071191003
 *       ◁►2020◀︎▷
 */

 // Question Link : https://www.urionlinejudge.com.br/judge/en/problems/view/1022

import java.util.Scanner;

class Main {
    static int n1; // numerator of the first fraction
    static int n2; // denominator of the first fraction
    static int d1; // numerator of the second fraction
    static int d2; // denominator of the second fraction
    static char operator; // operator of the operation

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Defines the number of itterations 
        input.nextLine(); // fixes an error

        for (int i = 0; i < n ; i++) {
            seperateData(input.nextLine());
            System.out.println(operate());
        }

        input.close();
    }

    public static void seperateData(String data) {
        /** 
         * The operation below splits the data into an array with the format:
         * sepData[0] = numerator 1 (n1)
         * sepData[1] = useless data ("/")
         * sepData[2] = denominator 1 (d1)
         * sepData[3] = operator 
         * sepData[4] = numerator 2 (n2)
         * sepData[5] = useless data ("/")
         * sepData[6] = denominator 2 (d2)
         */
        String sepData[] = data.split("\\s+"); 


        n1 = Integer.valueOf(sepData[0]);
        n2 = Integer.valueOf(sepData[4]);
        d1 = Integer.valueOf(sepData[2]);
        d2 = Integer.valueOf(sepData[6]);
        operator = sepData[3].charAt(0);
    }

    public static String operate() {
        // The operation that will be executed below follows 
        // the fomulas in the given question
        if (operator == '*') {
            return simplify((n1*n2), (d1*d2));
        } else if (operator == '/') {
            return simplify((n1*d2), (n2*d1));
        } else if (operator == '+') {
            return simplify((n1*d2) + (n2*d1), (d1*d2));
        } else {
            return simplify((n1*d2) - (n2*d1), (d1*d2));
        }
    }

    public static String simplify(int n, int d) {
         //this method returns the simplified version of a fraction
        int nRes = n;
        int dRes = d;
        nRes /= Math.abs(gcd(n, d));
        dRes /= Math.abs(gcd(n, d));
        
        return String.format("%d/%d = %d/%d", n, d, nRes, dRes);
    }
    
    public static int gcd(int a, int b) {
        //this method returns the greatest common divisor
        return b == 0 ? a : gcd(b, a % b);
    }
}