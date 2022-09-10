#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	queue<int> Q;
	int command, a;
	cin >> command;

	for (int i = 1; i <= command; i++) Q.push(i);
	while (Q.size() != 1) {
		Q.pop();
		a = Q.front();
		Q.pop();
		Q.push(a);
	}
	cout << Q.front();
	
}