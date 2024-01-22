class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int n = 0;
        int maxHealth = health;
            
        while(n != attacks.length) {
            if(health < maxHealth) {
                int k = attacks[n][0] - 1;
                if(n == 0) {
                    health += (k / bandage[0]) * bandage[2] + (k * bandage[1]);
                    if(health > maxHealth) {
                        health = maxHealth;
                    }
                } else {
                    k -= attacks[n-1][0];
                    if(k == 0) {
                        health -= attacks[n][1];
                        if(health <= 0 ) { // 체력이 0이하면 종료
                            return -1;
                        }
                        n++;
                        continue;
                    }
                    health += (k / bandage[0]) * bandage[2] + (k * bandage[1]);
                    if(health > maxHealth) {
                        health = maxHealth;
                    }
                }
            }
            
            health -= attacks[n][1];
            if(health <= 0 ) { // 체력이 0이하면 종료
                return -1;
            }
            n++;
            System.out.println(health);
        }
        
        return health;
    }
}
