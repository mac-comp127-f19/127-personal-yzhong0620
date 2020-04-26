package sortingArrays;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

        int i = 0, ai = 0, bi = 0;

        for (i = 0; i < newLength && ai < a.length && bi < b.length; i++) {
            if (a[ai].compareTo(b[bi]) < 0) {
                merged[i] = a[ai];
                ai++;
            }
            else {
                merged[i] = b[bi];
                bi++;
            }
        }

        if (ai < a.length) {
            int c = i;
            for (int index = ai; index < a.length;index++){
                merged[c]=a[index];
                c++;
            }
        }

        if (bi < b.length) {
            int c = i;
            for (int index = bi; index < b.length;index++){
                merged[c]=b[index];
                c++;
            }
        }

        return merged;
    }

    public static String[] sort(String[] a) {
        if (a == null) {
            return null;
        }

        if (a.length == 1||a.length==0) {
            return a;
        }

        int mid = a.length / 2;

        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

}
