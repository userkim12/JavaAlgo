#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	stack<int> S;
	string ans;
	int command, cnt=1;
	cin >> command;
	for (int i = 0; i < command; i++) {
		int a;
		cin >> a;
		for (cnt; cnt <= a; cnt++) {
			S.push(cnt);
			ans += "+\n";
		}
		if (S.top() == a) {
			S.pop();
			ans += "-\n";
		}
		else {
			cout << "NO";
			return 0;
		}
	}
	cout << ans;
}