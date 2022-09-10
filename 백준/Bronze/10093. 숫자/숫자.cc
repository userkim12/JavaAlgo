#include <bits/stdc++.h>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	long long a, b;
	cin >> a >> b;
    if (a > b) {
        swap(a, b);
    }
    if(a != b){
        cout << b - a - 1 << '\n';
	    for (a; a < b-1; a++) cout << a+1 << ' ';   
    }
    else cout << 0;
	return 0;
}