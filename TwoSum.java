import java.util.HashMap; 
/*

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less 
than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

 */
public class TwoSum {

	public static void main(String[] args){
		int[] numbers = {10,5,7,4,-1}; 
		int[] a = twoSum(numbers, 9); 
		System.out.println("First Index : " + a[0]);
		System.out.println("Second Inedx: " + a[1]); 
	}
	
	public static int[] twoSum(int[]numbers, int target){
            int[] answer = new int[2];
            HashMap<Integer, Integer> hm = new HashMap(numbers.length);
            int otherNumber = 0;
            answer[0] = -2;
            answer[1] = -2;
        
            for(int i=0; i<numbers.length; i++){
                
                hm.put((Integer) numbers[i], (Integer) i);
                
                if(hm.get(target-numbers[i]) != null && numbers[i] != target-numbers[i]){
                    otherNumber = target-numbers[i];
                    answer[1] = i+1;
                    break;
                }
            }
            
            for(int i=0; i<numbers.length; i++){
                if(numbers[i]==otherNumber){
                    answer[0] = i+1;
                    break;
                }
            }
            
            
            if(target == 0 && (answer[0] <0 || answer[1] <0)){
                int count = 0;
                for(int i =0; i<numbers.length; i++){
                    if(numbers[i]==0 && count<2){
                        answer[count]=i+1;
                        count++;
                    }
                }
                
            }
            
            if( answer[0] <0 || answer[1] <0 ){
                int count = 0;
                for(int i =0; i<numbers.length; i++){
                    if(numbers[i]== target/2 && count<2){
                        answer[count] = i+1; 
                        count++; 
                    }
                }
                
            }
            
            
            return answer;
        
	}
}
