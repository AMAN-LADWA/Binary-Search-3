/*
Desc: We use two pointer approach, while low and high are set to the first and last element, and update it by checking if the distances
from these points to the target.
Time Complexity : O(n)
Space Complexity : O(1)
*/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr == null || arr.length==0) return result;
        int low = 0; int high = arr.length - 1;
        while(high - low + 1 > k){
            int distL = Math.abs(x-arr[low]);
            int distR = Math.abs(x-arr[high]);
            if(distL > distR){
                low++;
            }else{
                high--;
            }
        }
        for(int i=low;i<=high;i++){
            result.add(arr[i]);
        }
        return result;
    }
}
