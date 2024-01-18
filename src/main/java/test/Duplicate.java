package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Duplicate {
	
	
	public static void main(String[] args) {
		
		Duplicate one = new Duplicate();
		int[] l1 = {1,1,1,3,3,4,3,2,4,2};
		
		System.out.println(one.containsDuplicate(l1));
		
	}
	
	
	
	public boolean containsDuplicate(int[] nums) {
							
		HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
				
		
    }
}
