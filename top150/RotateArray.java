/**
 
 Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 
*/

class RotateArray {
	
    public void rotate(int[] nums, int k) {

        rotateUsingReversArray(nums, k);
                
    }
	
	/**
		In this solution, we are using reverse array approach to solve this problem.
	*/
	int [] rotateUsingReversArray(int [] nums, int k){
		nums = revers(nums, 0, nums.length -1);
        nums = revers(nums, 0, k-1);
        nums = revers(nums, k, nums.length - 1);

        System.out.println(nums);
	}

    int [] revers(int [] nums, int i, int j){
        int temp = 0;
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++; j--;
        }
        return nums;
    }
	
}

