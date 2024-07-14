import java.util.*;

public class stringsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }

        Arrays.sort(a,Collections.reverseOrder());

        // Printing the sorted strings
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
