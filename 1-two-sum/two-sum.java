import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int cm = target - nums[i];
            if(map.containsKey(cm))
            {
                return new int[]{map.get(cm),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target element:");
        int target=sc.nextInt();

        Solution sn=new Solution();
        int []ans=sn.twoSum(nums,target);
        if(ans != null)
        {
            System.out.println("The returned answer elements are:" + ans[0] + "," + ans[1]);

        }
        else{
            System.out.println("There is no solutions for this question");
        }
        
    }
}
