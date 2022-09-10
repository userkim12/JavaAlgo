#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int a;
	string s1, s2;
	bool isPossible;
	cin >> a;
	for (int i = 0; i < a; i++) {
		int arr[26] = {};
		cin >> s1 >> s2;

		for (char c : s1) arr[c - 'a']++;
		for (char c : s2) arr[c - 'a']--;
		isPossible = true;

		for (int i : arr) {
			if (i != 0) isPossible = false;
		}

		if (isPossible) cout << "Possible\n";
		else cout << "Impossible\n";
	}
}