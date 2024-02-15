public class ArrayOps {
    public static void main(String[] args) {
        
        // findMissingInt tester
        //System.out.println(findMissingInt(new int[] {0} ));

        //secondMaxValue tester
        //System.out.println(secondMaxValue(new int[] {-202, 48, 13, 7, 8} ));

        //containsTheSameElements tester
        //System.out.println(containsTheSameElements(new int[] {1, 3, -4, 5, 2}, new int[] {3, -4, 1, 2, 5}));

        //isSorted tester
        //System.out.println(isSorted(new int[] {1, 3, 2}));

    }
    
    public static int findMissingInt (int [] array) {
        int missing = 0;
        boolean flag = false;

        for (int i = 0; i < (array.length + 1); i++) {
            flag = false;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                missing = i;
                return missing;
            }
        }
        
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            }
            else if (array[i] >= secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean flag = false;

        for (int i = 0; i < array1.length; i++) {
            flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    flag = true;
                }
            }
            if (!flag) return flag;
        }

        for (int i = 0; i < array2.length; i++) {
            flag = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    flag = true;
                }
            }
            if (!flag) return flag;
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean flag = true;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[0] < array[1]) {
                if (array[i+1] < array[i]) {
                    flag = false;
                }
            }
            else if (array[0] > array[1]) {
                if (array[i+1] > array[i]) {
                    flag = false;
                }
            }
        }

        return flag;
    }

}
