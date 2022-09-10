#include <bits/stdc++.h>
using namespace std;


int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int a, b, c, d;
	char s[3] = {};
	for (int i = 0; i < 3; i++) {
		cin >> a >> b >> c >> d;
		if (a + b + c + d == 0) s[i] = 'D';
		else if (a + b + c + d == 4) s[i] = 'E';
		else if (a + b + c + d == 3) s[i] = 'A';
		else if (a + b + c + d == 2) s[i] = 'B';
		else s[i] = 'C';
	}

	for (int i = 0; i < 3; i++) cout << s[i] << '\n';

}