package AccentureQuestions;

public class NearestNeighbourInIntegerList {
    public static void main(String[] args) {
        int[] nums = {10, 4, 12, 7, 15};
        int target = 8;
        System.out.println("Nearest Neighbor: " + findNearestNeighbor(nums, target));
        // Output: 7 (since |7 - 8| = 1)
    }
    public static int findNearestNeighbor(int[] arr, int target){
        if(arr.length==0|| arr==null){
            throw new IllegalArgumentException("Array can't be empty");
        }

        int nearest=arr[0];
        int minDifference=Math.abs(arr[0]-target);

        for(int i=1;i<arr.length;i++){
            int currentDiff=Math.abs(arr[i]-target);
            if(currentDiff<minDifference){
                minDifference=currentDiff;
                nearest=arr[i];
            }
            else if(minDifference==currentDiff && arr[i]<nearest){
                nearest=arr[i];
            }
        }
        return nearest;
    }
}
