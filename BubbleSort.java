

import java.lang.reflect.Array;
public class BubbleSort {
    public static void main(String[] args) {
        int[] f = {5, 1, 8, 3, 9, 2};
        int i;
        for (i = 0; i < f.length; i++)
        {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        int j;
        int swap;
        for(j = f.length-1; j >= 1; j--){
            for(i = 0; i <= j -1; i++){
                if (f[i] > f[i+1]){
                    swap = f[i+1];
                    f[i+1] = f[i];
                    f[i] = swap;

                }
            }
        }
        for(i = 0; i < f.length; i++){
            System.out.println(f[i] + " ");

        }

    }



}













