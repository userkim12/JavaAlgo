#include <bits/stdc++.h>
using namespace std;
string board[101];
int dist[101][101];
#define X first
#define Y second
int n, m;
int dx[4] = { 0,1,0,-1 };
int dy[4] = { -1,0,1,0 };
int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		cin >> board[i];
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			dist[i][j] = -1;
		}
	}
	queue<pair<int, int>> Q;
	dist[0][0] = 0;
	Q.push({ 0,0 });
	while (!Q.empty()) {
		pair<int, int> current = Q.front();
		Q.pop();
		for (int dir = 0; dir < 4; dir++) {
			int nx = current.X + dx[dir];
			int ny = current.Y + dy[dir];
			if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
			if (board[nx][ny] == '0' || dist[nx][ny] >= 0) continue;
			dist[nx][ny] = dist[current.X][current.Y]+1;
			Q.push({ nx,ny });
		}
	}
	cout << dist[n - 1][m - 1] + 1;
}