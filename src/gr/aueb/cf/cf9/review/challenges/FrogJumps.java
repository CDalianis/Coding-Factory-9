package gr.aueb.cf.cf9.review.challenges;

/**
 * εστω ενας βατραχος που απο ενα σημειο χ, πηγαινει σε
 * ενα σημειο ψ, οπου αποσταση jump, ειναι jump
 *
 * εστω οτι
 *
 * χ=10
 * y= 55
 * jump= 25
 */
public class FrogJumps {
    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump){
        int jumpCount = 0;

        while (start < end) {
            start += jump;
            jumpCount++;

        }
        return jumpCount;
    }

    /**
     * υλοποιηση με την μεθοδο math.ceil
     *
     * @param start
     * @param end
     * @param jump
     * @return
     */
    public static int frogJumps2 (int start, int end, int jump) {
       return (int) Math.ceil((end-start)/(double) jump);

    }
}
