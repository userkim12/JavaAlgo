#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int m = 0, num[3] = {}, arr[10] = {};
	for (int i = 0; i < 3; i++) cin >> num[i];
	m = num[0] * num[1] * num[2];

	while (m > 0) {
		arr[m % 10]++;
		m /= 10;
	}
	for (int e : arr) cout << e << '\n';
}