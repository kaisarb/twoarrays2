public class TwoArrays {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3;
        a3 = new int[a1.length + a2.length];
        if ((a1.length > 0) & (a2.length == 0)) {
         //   System.out.println("ggg0");
            return a1;
        }
        else if ((a2.length > 0) & (a1.length == 0)) {
         //   System.out.println("ggg1");
            return a2;
        }
        if ((a1.length == 0) & (a2.length == 0)) {
         //   System.out.println("ggg2");
            return a1;
        }   // if ((a1.length == 0) & (a2.length == 0)) {
        else if ((a2.length > 0) & (a1.length > 0)) {
            int ii = 0;
            int jj = 0;
            for (int kk = 0; kk < a1.length + a2.length; kk++) {
                if ((ii < a1.length) & (jj < a2.length)) {
                    if (a1[ii] <= a2[jj]) {
                        a3[kk] = a1[ii];
                        ii++;
                    } else if (a1[ii] > a2[jj]) {
                        a3[kk] = a2[jj];
                        jj++;
                    }
                }
                else if ((ii < a1.length) & (jj == a2.length)) {
                    //System.out.println("ggg3");
                    a3[kk] = a1[ii];
                    ii++;
                }
                else if ((jj < a2.length) & (ii == a1.length)) {
                   // System.out.println("ggg4");
                    a3[kk] = a2[jj];
                    jj++;
                }
            }
        }
        return a3;
    }     // public static int[] mergeArrays(int[] a1, int[] a2) {

    public static void main(String[] args) {
        int[] finArray;
        finArray = mergeArrays(new int[] {1,6,9,17,56,57,89,189 },
                new int[] {2,3,15,56,78});
       // System.out.println(finArray.length);
        for (int j : finArray) {
            System.out.print(j + " ");
        }
    }  // public static void main(String[] args) {
} // public class TwoArrays {
