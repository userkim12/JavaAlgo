#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int a;
	cin >> a;

	for (int i = 1; i < a; i++) {
		for (int j = a - i; j > 0; j--) cout << ' ';
		for (int j = 0; j < 2 * i - 1; j++) cout << '*';
		cout << '\n';
	}

	for (int i = a; i > 0; i--) {
		for (int j = 0; j < a - i; j++) cout << ' ';
		for (int j = 0; j < 2 * i - 1; j++) cout << '*';
		cout << '\n';
	}
}