#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	stack<int> S;
	int command;
	cin >> command;
	while (command--) {
		int a;
		cin >> a;
		if (a == 0) {
			if (!S.empty()) S.pop();
		}
		else {
			S.push(a);
		}
	}
	int ans = 0;
	while (!S.empty()) {
		ans += S.top();
		S.pop();
	}
	cout << ans;
	
}