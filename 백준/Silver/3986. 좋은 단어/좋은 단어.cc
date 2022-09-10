#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int a, ans=0;
	cin >> a;
	for (int i = 0; i < a; i++) {
		stack<char> S;
		string s;
		cin >> s;
		for (char e : s) {
			if (!S.empty() && e == S.top())  S.pop();
			else S.push(e);
		}
		if (S.empty()) ans++;
	}
	cout << ans;
}