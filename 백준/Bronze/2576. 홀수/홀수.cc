#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int min=999999, sum = 0 , arr[7] = {};
	for (int i = 0; i < 7; i++) {
		cin >> arr[i];
	}
	for (int i : arr) {
		if (i % 2 != 0) {
			sum += i;
			if (min > i) min = i;
		}
	}
	if (sum == 0) cout << -1;
	else cout << sum << '\n' << min;
}