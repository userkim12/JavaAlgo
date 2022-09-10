#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	string s;
	int a;
	cin >> a;
	for (int i = 0; i < a; i++) {
		list<char> L;
		cin >> s;
		auto cursor = L.begin();

		for (char e : s) {
			if (e == '<') {
				if (cursor != L.begin())
					cursor--;
			}
			else if (e == '>') {
				if (cursor != L.end()) cursor++;
			}
			else if (e == '-') {
				if (cursor != L.begin()) {
					cursor--;
					cursor = L.erase(cursor);
				}
			}
			else
				L.insert(cursor, e);
		}
		for (char e : L) cout << e;
        cout << '\n';
	}
}