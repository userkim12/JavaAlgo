#include <bits/stdc++.h>
using namespace std;

int ans, students, max_people, grade, girl[7], boy[7];
bool isman;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cin >> students >> max_people;
	for (int i = 0; i < students; i++) {
		cin >> isman >> grade;
		if (isman) boy[grade]++;
		else girl[grade]++;
	}
	for (int i = 0; i < 7; i++) {
		ans += girl[i] / max_people;
		if (girl[i] % max_people) ans++;

		ans += boy[i] / max_people;
		if (boy[i] % max_people) ans++;
	}
	cout << ans;
}