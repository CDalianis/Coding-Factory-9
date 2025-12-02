package gr.aueb.cf.cf9.ch6;

/**
 * otan kanoume copy references, tote to copy
 * onomazetai shallow kai exei side
 * effects..
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arrCopy = arr;

        arrCopy[0] = 1000;
        System.out.println(arr[0]);

    }
}
