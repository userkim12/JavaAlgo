#include <stdio.h>

int main(void) {	
	int N, X, i, a[10000] = { 0, };
	scanf("%d %d", &N, &X);
	for (i = 0; i < N; ++i) {
		scanf("%d", &a[i]);
	}
	for (i = 0; i < N; ++i) {
		if (a[i] < X) {
			printf("%d ", a[i]);
		}
	}
	return 0;
}