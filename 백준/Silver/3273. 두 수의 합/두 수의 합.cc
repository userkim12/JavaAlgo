#include <bits/stdc++.h>
using namespace std;
int num, x, ans, arr[100001],nums[2000001];
int main(void) { 
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	cin >> num;
	for (int i = 0; i < num; i++) {
		cin >> arr[i];
	}
	cin >> x;

	for (int i = 0; i < num; i++) {
		if (x - arr[i] > 0 && nums[x - arr[i]]) ans++;
		nums[arr[i]] = 1;
	}
	cout << ans;
}