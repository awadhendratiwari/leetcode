/**

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 
*/

class MajorityElement {
    public int removeDuplicates(int[] nums) {

        iint majorityElement = 0;
        int majorityValue = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.compute(nums[i], (key, value) -> value == null ? 1 : value + 1 );
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue() > majorityValue){
                majorityElement = entry.getKey();
                majorityValue = entry.getValue();
            }
        }

        return majorityElement;
        
    }
}