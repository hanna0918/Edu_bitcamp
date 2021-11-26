
public class WaterMelon {
	//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
	//예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	
	public String solution(int n) {
        String answer = "";
        String waterMelon = "수박";
        int m = n%2;
        n = n/2;
        
        if(m==0){
            answer=waterMelon.repeat(n);
        }else{
            answer=waterMelon.repeat(n)+"수";
        }
        
        return answer;
    }
}
