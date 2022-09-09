#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int young = 0, minsick = 0, input = 0 , arr[20] = {};
	cin >> input;
	for (int i = 0; i < input; i++) cin >> arr[i];

	for (int i = 0; i < input; i++) {
		young += (arr[i] / 30 + 1) * 10;
	}
	for (int i = 0; i < input; i++) {
		minsick += (arr[i] / 60 + 1) * 15;
	}
	if (minsick == young) cout << "Y " << "M " << young;
	else if (minsick < young) cout << "M " << minsick;
	else cout << "Y " << young;
	return 0;
}