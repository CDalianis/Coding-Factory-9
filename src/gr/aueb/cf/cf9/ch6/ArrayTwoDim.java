package gr.aueb.cf.cf9.ch6;

/**
 * orizei ena disdiastato pinaka kai kanei populate
 * ton pinaka me stoixeia
 * 2s arrays orizontai ws [grammi] [stili]
 */
public class ArrayTwoDim {
    public static void main(String[] args) {

        int [] [] grid = new int [2] [3];
        int [] [] grid2 = {
                {1,2,3},
                {4,5,6}
        };

        grid [0] [0] = 1;
        grid [0] [1] = 1;
        grid [0] [2] = 1;
        grid [1] [0] = 1;
        grid [1] [1] = 1;
        grid [1] [2] = 1;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j< grid[i].length; j++ ){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }



    }
}
