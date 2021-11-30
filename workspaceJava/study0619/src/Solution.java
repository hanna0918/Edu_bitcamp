
public class Solution {

    public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        
        for(int i=1; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(arr.length);
        answer=sum/arr.length;
        
        return answer;
    }
    public static void main(String[] args) {
    	new Solution();
    }
}
