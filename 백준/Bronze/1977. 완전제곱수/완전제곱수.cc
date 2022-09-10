#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int x, y, ans1 = 0, ans2 =10001;
	cin >> x >> y;

	for (x; x <= y; x++) {
		for (int i = 1; i <= 100; i++) {
			if ((x / i == i) && (x % i == 0)) {
				ans2 = min(ans2, x);
				ans1 += x;
			}
		}
	}
	if (ans1 == 0) cout << -1;
	else {
		cout << ans1 << '\n';
		cout << ans2;
	}
}