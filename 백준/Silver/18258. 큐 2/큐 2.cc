#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	queue<int> Q;
	int command;
	cin >> command;

	for (int i = 0; i < command; i++) {
		string s;
		cin >> s;
		if (s == "push") {
			int a;
			cin >> a;
			Q.push(a);
		}
		else if (s == "front") {
			if (Q.empty()) cout << -1 << '\n';
			else cout << Q.front() << '\n';
		}
		else if (s == "back") {
			if (Q.empty()) cout << -1 << '\n';
			else cout << Q.back() << '\n';
		}
		else if (s == "empty") {
			if (Q.empty()) cout << 1 << '\n';
			else cout << 0 << '\n';
		}
		else if (s == "size") {
			cout << Q.size() << '\n';
		}
		else {
			if (Q.empty()) cout << -1 << '\n';
			else {
				cout << Q.front() << '\n';
				Q.pop();
			}
		}
	}
	
}