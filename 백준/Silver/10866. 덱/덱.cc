#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	deque<int> DQ;
	int command;
	cin >> command;
	for (int i = 0; i < command; i++) {
		string s;
		cin >> s;
		if (s == "push_back") {
			int a;
			cin >> a;
			DQ.push_back(a);
		}
		else if (s == "push_front") {
			int a;
			cin >> a;
			DQ.push_front(a);
		}
		else if (s == "front") {
			if (DQ.empty()) cout << -1 << '\n';
			else cout << DQ.front() << '\n';
		}
		else if (s == "back") {
			if (DQ.empty()) cout << -1 << '\n';
			else cout << DQ.back() << '\n';
		}
		else if (s == "pop_front") {
			if (DQ.empty()) cout << -1 << '\n';
			else {
				cout << DQ.front() << '\n';
				DQ.pop_front();
			}
		}
		else if (s == "pop_back") {
			if (DQ.empty()) cout << -1 << '\n';
			else {
				cout << DQ.back() << '\n';
				DQ.pop_back();
			}
		}
		else if (s == "size") {
			cout << DQ.size() << '\n';
		}
		else {
			if (DQ.empty()) cout << 1 << '\n';
			else cout << 0 << '\n';
		}
	}
}