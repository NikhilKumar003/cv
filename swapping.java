import java.util.Arrays;
public class swapping {
    public static void swapNumber(int []a, int []b) {
        int temp;
    // Check if arrays have the same length
    if (a.length != b.length) {
        System.out.println("Arrays must have the same length for swapping.");
        return;
    }

    System.out.println("Initially the values of 'a' and 'b' are " + Arrays.toString(a) + " and " + Arrays.toString(b) + ", respectively.");

    for (int i = 0; i < a.length; i++) {
        temp = a[i];
        a[i] = b[i];
        b[i] = temp;
    }

    System.out.println("After swapping, the values of 'a' are " + Arrays.toString(a) + " and the values of 'b' are " + Arrays.toString(b) + ".");
}
}
