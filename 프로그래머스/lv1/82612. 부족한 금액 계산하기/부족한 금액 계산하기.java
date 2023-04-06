class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i=1;i<=count;i++) sum += i * price;
        long needs = sum - money;

        return needs <= 0 ? 0 : needs;
    }
}