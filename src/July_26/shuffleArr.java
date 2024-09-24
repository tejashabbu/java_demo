package July_26;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Random;

public class shuffleArr
{
	public static void main(String[] args) 
    { 
        int[] nums = { 1, 2, 3 }; 
        ArrayList<int[]> res = permute(nums);  
        for (int[] x : res) { 
            for (int y : x) { 
                System.out.print(y + " "); 
            } 
            System.out.println(); 
        } 
    } 
	
	static void swap(int nums[], int l, int i) 
    { 
        int temp = nums[l]; 
        nums[l] = nums[i]; 
        nums[i] = temp; 
    } 
	
    static void permutations(ArrayList<int[]> res, 
                             int[] nums, int l, int h) 
    { 
        if (l == h) { 
            res.add(Arrays.copyOf(nums, nums.length)); 
            return; 
        } 
        for (int i = l; i <= h; i++)
        {
            swap(nums, l, i); 
            permutations(res, nums, l + 1, h); 
            swap(nums, l, i); 
        } 
    } 
    
    static ArrayList<int[]> permute(int[] nums) 
    { 
        ArrayList<int[]> res = new ArrayList<int[]>(); 
        int x = nums.length - 1; 
        permutations(res, nums, 0, x); 
        return res; 
    } 
}
