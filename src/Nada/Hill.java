import java.util.Scanner;
public class Hill {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] heights = new long[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextLong();
        }

        long maxPeak = 0;

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;

            while (l > 0 && heights[l - 1] <= heights[l]) {
                l--;
            }

            while (r < n - 1 && heights[r + 1] <= heights[r]) {
                r++;
            }

            long peakHeight = Math.min(heights[i] - heights[l], heights[i] - heights[r]);
            maxPeak = Math.max(maxPeak, peakHeight);
        }

        System.out.println(maxPeak);
    }
}
