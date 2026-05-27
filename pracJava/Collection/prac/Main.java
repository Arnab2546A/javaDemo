
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k");
        int k = 2;
        int checkFreq = 99999;
        int freq = 1;
        int val = 0;
        int i = 0;

        Arrays.sort(arr);

        while (k > 0) {
            int maxFreq = -99999;

            for (i = 0; i < n - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    freq++;
                } else {
                    if (freq > maxFreq && checkFreq > freq) {
                        maxFreq = freq;
                        val = arr[i];
                    }
                    freq = 1;
                }
            }

            if (i == n - 1 && arr[n - 1] != arr[n - 2]) {
                freq = 1;
                if (freq > maxFreq && checkFreq > freq) {
                    maxFreq = freq;
                    val = arr[i];
                }
            } else if (freq > maxFreq && checkFreq > freq) {
                maxFreq = freq;
                val = arr[i];
            }

            checkFreq = maxFreq;
            k--;
        }

        System.out.print("The " + k + "th frequency element is " + val + " and its frequency is " + freq);
        sc.close();
    }
}
