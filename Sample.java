// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//c# code
public class Solution {
    public IList<int> FindDisappearedNumbers(int[] nums) {
        List<int> list = new List<int>();
        HashSet<int> hash = new HashSet<int>();

        for(int i =0; i< nums.Length; i++)
        {
            if(!hash.Contains(nums[i]))
            {
                hash.Add(nums[i]);
            }
        }
        for(int i=1;i<=nums.Length;i++)
        {
            if(!hash.Contains(i))
            {
                list.Add(i);
            }
        }
        return list;
    }
}
