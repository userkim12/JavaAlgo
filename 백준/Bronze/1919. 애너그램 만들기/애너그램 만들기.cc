#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	string s1, s2;
	int ans = 0,arr[26] = {};
	cin >> s1 >> s2;

	for (char c : s1) arr[c - 'a']++;
	for (char c : s2) arr[c - 'a']--;

	for (int i = 0; i < 26; i++) {
		if (arr[i] != 0) ans += abs(arr[i]);
	}
	cout << ans;
}