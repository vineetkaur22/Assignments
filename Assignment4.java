public class Assignment4 {
		
		/* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
		 * s = "leetcode" return 0. 
		 * s = "loveleetcode" return 2.
		 */
	   
		public int firstUniqChar(String s) {
			// Return -2 value signifies that null is passed
			if (s == null) {
				return -2;
			}
		    	char[] chars = s.toCharArray();
		    	for (int c=0; c<s.length(); c++) {
		    		for(int d=0; d<s.length(); d++){
			    		if( chars[c] != chars[d] || c==d ) {
			    			if(d == s.length() -1) {
			    				return c;
			    			}
			    			continue;
			    		}
			    		else {
			    			break;
			    		}
		    		}
		    		
		    	}
			return -1;
	    }
	    
	    /*
	     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
	     * Input: 38 Output: 2
	     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	     */
		
	    public int addDigits(int n) {
		    	int sum = 0;
		    	while ( n >0) {
		    		sum = sum + n%10;
		    		n=n/10;
		    		}
	
		    	if (sum <10) {
		    	return sum;
		    		}
		    	else {
		    		return addDigits(sum);
		    	}
	    }
	    
	    /*
	     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
	     */
	    public void moveZeroes(int[] nums) {
	    		if (nums == null) {
	    			return;
	    		}
		    	int currentIndex =0;
			for (int i=0 ; i<nums.length ; i++) {
				if(nums[i] !=0) {
					nums[currentIndex]=nums[i];
					currentIndex ++;
				}
			}
			while(currentIndex < nums.length) {					
				nums[currentIndex]=0;
				currentIndex++;
			}
			System.out.println("Output is :" );
			for (int i = 0 ; i < nums.length; i++) {
				System.out.print(nums[i] + ",");		
			}
			System.out.println();
	     }
		
	    /*
	     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
	     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
	     */
		public String longestPalindrome(String str) {
			if (str == null) {
				return null;
			}
			
			int l = str.length();
			String longest =" ";
			if (l==1) {
				return str;
			}
			for (int i=0; i<l ; i++) {
				char c = str.charAt(i);
				int e =0 ;
				int s=0;
				s=e=i;
				while (s-1 >=0 && c==str.charAt(s-1)) {
					s=s-1;		
				}
				while (e+1 < str.length() && c==str.charAt(e+1)) {
					e=e+1;		
				}
				for (int k=0 ; (s-k >= 0) && (e+k <= l-1) ; k++) {
					if (str.charAt(s-k)==str.charAt(e+k)) {
						String sub = str.substring( s-k , e+k +1);
						if (sub.length() > longest.length()) {
							longest = sub;
						}
					}
					else {
						break;
					}
				}
			}
			return longest;
	    }
		
	    /*
	     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
	     * Given input matrix = [ [1,2,3],
	  			      [4,5,6],
	  			      [7,8,9] ],
	     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
	  								 [8,5,2],
	  								  [9,6,3] ],
	     */
	  								  
		public int[][] rotate(int[][] matrix) {
			if (matrix == null) {
		        return null ;
		    }
		    int n = matrix.length ;
		    int l = n-1;
		    for (int x=0; x < n/2 ; x++) {	    	
		    		for(int k=0 ; k < n -2*x -1; k++) {
		    			int temp = matrix [x ][x+k];
		    			matrix [x ][x+k] = matrix [ l -x-k ][x];
		    			matrix [ l-x-k ][x] = matrix [l-x ][ l-x-k];
		    			matrix [ l-x ][ l-x-k] = matrix [ x+k ][ l-x];
		    			matrix [ x+k ][ l-x] = temp;
		    		}
		    	
		    }	   
		    return matrix;
	    	 }
	    	 	
}
	    
	


