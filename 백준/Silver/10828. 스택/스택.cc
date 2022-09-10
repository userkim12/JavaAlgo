#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	stack<int> A;
	int command;
	cin >> command;
	for (int i = 0; i < command; i++) {
		string s;
		cin >> s;
		if (s == "push") {
			int a;
			cin >> a;
			A.push(a);
		}
		else if (s == "top") {
			if (A.empty()) cout << -1 << '\n';
			else cout << A.top() << '\n';
		}
		else if (s == "size") cout << A.size() << '\n';
		else if (s == "pop") {
			if (A.empty()) cout << -1 << '\n';
			else {
				cout << A.top() << '\n';
				A.pop();
			}
		}
		else {
			if (A.empty()) cout << 1 << '\n';
			else cout << 0 << '\n';
		}
	}
	

	
}