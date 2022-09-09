#include <bits/stdc++.h>
using namespace std;
#define X first
#define Y second
bool vis[501][501];
int board[501][501];
int dx[4] = { 1,0,-1,0 };
int dy[4] = { 0,1,0,-1 };
int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int n, m, mx = 0, count=0;
	
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cin >> board[i][j];
		}
	}
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (vis[i][j] || board[i][j]==0) continue;
			count++;
			queue<pair<int, int>> Q;
			Q.push({ i,j });
			vis[i][j] = 1;
			int area=0;
			while (!Q.empty()) {
				area++;
				pair<int, int> current = Q.front();
				Q.pop();
				for (int dir = 0; dir < 4; dir++) {
					int nx = current.X + dx[dir];
					int ny = current.Y + dy[dir];
					if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
					if (vis[nx][ny] || board[nx][ny] != 1) continue;
					vis[nx][ny] = 1;
					Q.push({ nx,ny });
				}
			}
			mx = max(mx, area);
		}
	}
	cout << count << '\n' << mx;
}