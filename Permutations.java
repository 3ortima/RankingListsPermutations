class Permutations {
//    these are different counters for different loyalties. It counts all the different ranking lists of a specific
//    hospital in which the third doctor's proposal would be accepted.
    static int counterL1 = 0;
    static int counterL2 = 0;
    static int counterL3 = 0;
    static int counterL4 = 0;
    static int counterL5 = 0;
    static int counterL6 = 0;
    static int counterL7 = 0;
    static int counterL8 = 0;

    // The following 3 methods creates all the permutations for the ranking lists.
    public static void printAllRecursive(int n, char[] elements, char delimiter) {

        if (n == 1) {
            printArray(elements, delimiter);
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }
    }

    private static void swap(char[] elements, int a, int b) {
        char tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

    private static void printArray(char[] elements, char delimiter) {
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < elements.length; i++) { // i, j and k are the ranks of a, b, and c.
            if (elements[i] == 'a') {
                break;
            }
        }
        for (j = 0; j < elements.length; j++) {
            if (elements[j] == 'b') {
                break;
            }
        }
        for (k = 0; k < elements.length; k++) {
            if (elements[k] == 'c') {
                break;
            }
        }

//      Counting the cases in which the 3rd proposal of a doctor will get accepted.
//      When the previous 2 proposals were accepted also.

        if ((i < j - 1) && (j < k - 1))
            counterL1++;
        if ((i < j - 2) && (j < k - 2))
            counterL2++;
        if ((i < j - 3) && (j < k - 3))
            counterL3++;
        if ((i < j - 4) && (j < k - 4))
            counterL4++;
        if ((i < j - 5) && (j < k - 5))
            counterL5++;
        if ((i < j - 6) && (j < k - 6))
            counterL6++;

//      Counting the cases in which the 3rd proposal of a doctor will get accepted.
//      When the second proposal was denied.

//        if ((i < j - 1) && (((k < j) && (k >= j - 1))|| (k > j + 1)))
//            counterL1++;
//        if ((i < j - 2) && (((k < j) && (k >= j - 2))|| (k > j + 2)))
//            counterL2++;
//        if ((i < j - 3) && (((k < j) && (k >= j - 3))|| (k > j + 3)))
//            counterL3++;
//        if ((i < j - 4) && (((k < j) && (k >= j - 4))|| (k > j + 4)))
//            counterL4++;
//        if ((i < j - 5) && (((k < j) && (k >= j - 5))|| (k > j + 5)))
//            counterL5++;
//        if ((i < j - 6) && (((k < j) && (k >= j - 6))|| (k > j + 6)))
//            counterL6++;
//        if ((i < j - 7) && (((k < j) && (k >= j - 7))|| (k > j + 7)))
//            counterL7++;
//        if ((i < j - 8) && (((k < j) && (k >= j - 8))|| (k > j + 8)))
//            counterL8++;
    }



    public static void main(String[] args) {
        char[] members = {'a', 'b', 'c', 'd', 'e'}; // all the different n doctors
        printAllRecursive(5, members, ','); // the first argument should be the number 'n'
        System.out.println(counterL1 * 2); // We allow 2 different orders for the 2 previous doctors.
        System.out.println(counterL2 * 2);
        System.out.println(counterL3 * 2);
        System.out.println(counterL4 * 2);
        System.out.println(counterL5 * 2);
        System.out.println(counterL6 * 2);
        System.out.println(counterL7 * 2);
        System.out.println(counterL8 * 2);
    }
}


