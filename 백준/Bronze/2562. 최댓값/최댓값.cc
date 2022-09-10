#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int arr[9] = {}, max = -999, max_index=0;
	for (int i = 0; i < 9; i++) {
		cin >> arr[i];
		if (arr[i] > max) {
			max = arr[i];
			max_index = i;
		}
	}	
	cout << max << '\n' << max_index+1;
}