#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int arr[5] = {}, total = 0;
	
	for (int i = 0; i < 5; i++) cin >> arr[i];
	for (int i = 0; i < 5; i++) total += arr[i];
	sort(arr, arr + 5);
	cout << total / 5 << '\n';
	cout << arr[2];
}