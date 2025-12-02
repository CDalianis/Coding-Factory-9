package gr.aueb.cf.cf9.review.challenges;

/**
 * εστω πινακας με n στοιχεια απο 1 ως n+1
 * για παραδειγμα {1,2,3,5}
 * βρειτε το στοιχειο που λειπει.
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    /**
     * η συλλογιστικη εδω ειναι πως αν δεν ελειπε το στοιχειο θα εδινε ενα expected
     * sum που μπορουμε να το υπολογισουμε. αν αφαιρεσουμε απο αυτο το expected
     * το actual sum τοτε θα βρουμε το στοιχειο που λειπει.
     * @param arr
     * @return
     */
    public static int  findMissingElement(int [] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n + 1))/2;

        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }


}
