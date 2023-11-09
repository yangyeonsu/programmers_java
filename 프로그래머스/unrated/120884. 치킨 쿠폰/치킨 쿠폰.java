class Solution {
    public int solution(int chicken) {
        int answer = -1;
        
        // 10개를 소비하면 1개를 받아. 100개를 소비하면 10개를 받아. 99개를 소비하면 9개가 남고 9개를 받아.
        // 1081개를 소비하면 108마리를 받고 1쿠폰이 남고 108개의 쿠폰을 받아 총 109개의 쿠폰이 남아
        // 109개의 쿠폰으로 10마리를 받고 10쿠폰을 받고 9쿠폰이 남아서 19쿠폰이 남아
        // 19쿠폰으로 1마리를 받고 1쿠폰을 받고 9쿠폰이 남아서 1마리를 시켜.
        int coupon = 0;     
        
        while(chicken/10 != 0){                  // chicken = 1081 109
            coupon += chicken / 10;              // coupon  = 108  118
            chicken = chicken%10 + chicken/10;   // chicken = 109  19
            
        }
        
        
        return coupon;
    }
}