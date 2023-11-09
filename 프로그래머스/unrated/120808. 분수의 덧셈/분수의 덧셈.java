class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int numer3=0;
        int denom3=0;
        int measure = 0;   // 최대공약수
        
        denom3 = denom1 * denom2;                   // 분모8
        numer3 = numer1 * denom2 + numer2 * denom1; // 분자10
        
        // 최대공약수 구하기
        if(numer3 >= denom3) {
            for(int i=1; i<=denom3; i++) {
                if(denom3 % i == 0 && numer3 % i == 0){
                    measure = i;
                }
            }
        } else {
            for(int i=1; i<=numer3; i++) {
                if(denom3 % i == 0 && numer3 % i == 0){
                    measure = i;
                }
            }
        }
        
        int numer4 = numer3 / measure;
        int denom4 = denom3 / measure;
        
        answer = new int[] {numer4, denom4};
        return answer;
    }
}