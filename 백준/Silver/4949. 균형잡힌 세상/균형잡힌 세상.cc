#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	while (1) {
		string s;
		stack<int> S;
		string ans="yes";
		getline(cin, s);
		if (s == ".") return 0;
		for (char e : s) {
			if (e == '[' || e == '(') S.push(e);
			else if (e == ']') {
				if (!S.empty()) {
					if (S.top() == '[') S.pop();
					else ans = "no";
				}
				else ans = "no";
			}
			else if (e == ')') {
				if (!S.empty()) {
					if (S.top() == '(') S.pop();
					else ans = "no";
				}
				else ans = "no";
			}
		}
		if (!S.empty()) ans = "no";
		cout << ans << '\n';
	}
}