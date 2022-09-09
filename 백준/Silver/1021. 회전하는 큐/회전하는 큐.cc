#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	deque<int> DQ;
	int n, m, ans=0;
	cin >> n >> m;
	for (int i = 1; i <= n; i++) DQ.push_back(i);
	while (m--) {
		int a;
		cin >> a;
		int idx = find(DQ.begin(), DQ.end(), a)-DQ.begin();
		while (DQ.front() != a) {
			if (idx < DQ.size() - idx) {
				DQ.push_back(DQ.front());
				DQ.pop_front();
			}
			else {
				DQ.push_front(DQ.back());
				DQ.pop_back();
			}
			ans++;
		}
		DQ.pop_front();
	}
	cout << ans;
}