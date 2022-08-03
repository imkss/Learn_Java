package loops;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int a[] = {-1, 4, -2, 4, -1, 3, 5, -6};
//		int max = Integer.MIN_VALUE;
		int n = a.length;
		
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i = 0; i < n; i++) {
			
			curSum += a[i];
			
			if(curSum >  maxSum) {
				maxSum = curSum;
			} 
			if(curSum < 0) {
				curSum = 0;
			}
			
		}
		System.out.println(maxSum);
		
		
//		int sum[] = new int [n];
//		sum[0] = a[0];
//		for(int i = 1; i < n; i++) {
//			sum[i] = sum[i-1] + a[i];
//		}
//		for(int i = 0; i < n; i++) {
//			for(int j = i; j < n; j++) {
//				int curSum = sum[j] - sum[i] + a[i];
//				if(curSum > max) {
//					max = curSum;
//				}
//			}
//		}
//		
////		for(int i = 0; i < n; i++) {
////			for(int j = i; j < n; j++) {
////				int curSum = 0;
////				for(int k = i; k <= j; k++) {
////					curSum += a[k];
////				}
////				if(curSum > max) {
////					max = curSum;
////				}
////			}
////		}
//		System.out.println(max);
	}
}
