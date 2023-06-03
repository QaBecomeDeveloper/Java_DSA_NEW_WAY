package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class array_one {
    public static int search(int[] nums, int target) {
//min will have index of minimum element of nums
      int min = minSearch(nums);
//find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1])
        { return search(nums,min,nums.length-1,target);
        }
//find in sorted right else{
        return search(nums,0,min,target);
    }
    //binary search to find target in left to right boundary
    public static int search(int[] nums,int left,int right,int target){
    int l = left; int r = right;
    // System.out.println(left+" "+right);
    // while(l <= r){
    int mid = l + (r - l)/2;
    if(nums[mid] == target){
        return mid;
        }
        else if(nums[mid] > target){ r = mid-1;
        }
        else{
        l = mid+1;
        }
        return -1;
        }

//smallest element index

public static int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
        int mid = left + (right - left)/2;
        if(mid > 0 && nums[mid-1] > nums[mid]){
        return mid;
        }
        else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
        {
        left = mid+1;
        }
        else{
        right = mid-1;
        }
        }
        return left;
        }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; i++) {
            if (buy < prices[i]) {
            profit = Math.max(prices[i] - buy, profit);
        }
        else {
            buy = prices[i];
        }
        }
        return profit;
    }
    public static int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) { l++;
                lMax = Math.max(lMax, height[l]); res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]); res += rMax - height[r];
            }
        }
        return res;
    }
    public static List<List<Integer>> threeSum(int num[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
            for(int k=j+1; k<num.length; k++) {
                if(num[i] + num[j] + num[k] == 0) {
                    List<Integer> triplet = new ArrayList < Integer > ();
                    triplet.add(num[i]);
                    triplet.add(num[j]); triplet.add(num[k]); Collections.sort(triplet); result.add(triplet);
                }
            }
            }
    }
    result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16,};
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int[] num = {-1, 0, 1, 2, -1, -4};
        int prices[] = {7, 1, 5, 3, 6, 4};
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(minSearch(nums));
        System.out.println(maxProfit(prices));
        System.out.println(trap(height));
        System.out.println(threeSum(num));
    }
}

