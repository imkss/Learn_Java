package loops;

public class largest_Sum {

	public static void main(String[] args) {

		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};		
        int n = nums.length;
        
        
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < n; i++) {
        	curSum += nums[i];
        	if(curSum > maxSum) {
        		maxSum = curSum;
        	}
        	if(curSum < 0) {
        		curSum = 0;
        	}
        }
        System.out.println(maxSum);
        
//        int max = Integer.MIN_VALUE;
//        
//        int sum [] = new int [n];
//        sum [0] = nums[0];
//        for(int i = 1; i < n; i++) {
//        	sum[i] = sum[i-1] + nums[i];
//        }
//        
//     
//        for(int i = 0; i < n; i++){
//            for(int j = i; j < n; j++){
//            	int curSum = sum[j] - sum[i] + nums[i];
////                int curSum = 0;
////                for(int k = i; k <= j; k++){
////                    curSum += nums[k];
////                }
//                if(curSum > max) {
//                    max = curSum;
//                }
//            }
//         }
//       System.out.println(max);
		
		
	}

}
