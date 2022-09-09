#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	list<char> L;
	string init;
	cin >> init;
	for (char e : init) L.push_back(e);
	int command = 0;
	auto cursor = L.end();
	char ch;
	cin >> command;
	for (int i = 0; i < command; i++) {
		cin >> ch;
		if (ch == 'L') {
			if (cursor != L.begin()) cursor--;
		}
		else if (ch == 'D') {
			if (cursor != L.end()) cursor++;
		}
		else if (ch == 'B') {
			if (cursor != L.begin()) {
				cursor--;
				cursor = L.erase(cursor);
			}
		}
		else {
			char add;
			cin >> add;
			L.insert(cursor, add);
		}
	}
    for (char e : L) cout << e;
}
