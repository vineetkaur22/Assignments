public class MedianSort {

	public static double findMedianSortedArrays(int nums1[], int nums2[]) {
		int m = nums1.length;
		int n = nums2.length;
		double nums [] =new  double [m+n];
		int i=0 , j=0, k=0;
		while (i<m || j<n) {	
			if(i == m) {
				nums[k] = nums2[j];
				j++; k++;
				continue;
			}
			if(j == n) {
				nums[k ] = nums1[i];
				i++; k++;
				continue;
			}
			
			if(nums1[i]<nums2[j]) {
				nums[k] = nums1[i];
				i++;
			}
			else {
				nums[k]=nums2[j];
				j++;
			}
			k++;
		}
		return ( nums[((n+m)-1) / 2] + nums[(n+m) / 2] ) / 2;

	}
}



