import java.util.Scanner;
class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length;
       int []result = new int[2 * n];
       for(int i=0;i<n;i++)
       {
        result[i]=nums[i];
        result[i+n]=nums[i];
       }
       return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Array Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
        Solution sn=new Solution();
        int[] ans=sn.getConcatenation(nums);
       for(int i=0;i<ans.length;i++)
       {
        System.out.println(ans[i]);
       }
    }
}