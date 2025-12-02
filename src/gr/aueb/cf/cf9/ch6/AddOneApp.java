package gr.aueb.cf.cf9.ch6;

/**
 * estw oti anaparistoume megalous akeraiaous se morfi pinaka kai theloume na prosthesoume ti monda
 */
public class AddOneApp {
    public static void main(String[] args) {

    }

    /**
     * prosthetei ti monada se ena pinaka pou anaparista ena akeraio
     * @param arr
     * @return
     */


    public static int[] addOne (int [] arr) {
        if (arr == null ) return null;
        int [] arrOut = new int [arr.length+1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length-1; i >= 0  ; i--) {
            sum = arr[i] + carry;
            arrOut[i+1] = sum %10;
            carry = sum/10;

        }

        if (carry ==1) {
            arrOut[0] = 1;
        }
        return arrOut;

    }


}
