#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	string a;
	cin >> a;
	int arr[26] = {};
	for (char e : a)
		arr[e - 'a']++;
	for (int i = 0; i < 26; i++)
		cout << arr[i] << ' ';
}