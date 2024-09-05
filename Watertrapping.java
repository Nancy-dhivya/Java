public class Watertrapping {

    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};
        int result = findWater(arr);
        System.out.println("Total water trapped: " + result);
    }

    public static int findWater(int[] arr) {
        int totalWater = 0;
        int n = arr.length;

        for (int left = 0; left < n - 1; ) {
           
            int firstPeak = left;
            for (int i = left + 1; i < n; i++) {
                if (arr[i] >= arr[firstPeak]) {
                    firstPeak = i;
                }
                if (arr[i] > arr[firstPeak]) {
                    break;
                }
            }

            
            if (firstPeak == n - 1) {
                break;
            }

            
            int secondPeak = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[secondPeak] && i != firstPeak) {
                    secondPeak = i;
                }
            }

            
            int trappedWater = 0;
            int minPeakHeight = Math.min(arr[firstPeak], arr[secondPeak]);
            for (int i = Math.min(firstPeak, secondPeak) + 1; i < Math.max(firstPeak, secondPeak); i++) {
                trappedWater += minPeakHeight - arr[i];
            }
            totalWater += trappedWater;

            
            left = Math.max(firstPeak, secondPeak);
        }

        return totalWater;
    }
}
