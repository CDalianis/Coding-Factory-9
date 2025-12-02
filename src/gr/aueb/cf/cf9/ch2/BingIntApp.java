package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

/*
big integer class demo, ta xrisimopoioume gia poli megalous arithmous giati alliws tha exoume overflow
 */

public class BingIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("423534564536");
        BigInteger bigNum2 = new BigInteger("53545645765756");
        BigInteger bigResult ;

        bigResult = bigNum1.add(bigNum2);
        System.out.printf("The result is: %,d%n", bigResult);

    }
}
