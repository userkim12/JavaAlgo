#include <stdio.h>

int main(void) {	
	int a[3],i,j, second = 0;
	scanf("%d %d %d", &a[0], &a[1], &a[2]);
	for (i = 0; i < 3; ++i) {
		for (j = 0; j < 2; ++j) {
			if (a[j] >= a[j + 1]) {
				second = a[j + 1];
				a[j + 1] = a[j];
				a[j] = second;
			}
		}
	 }
	printf("%d", a[1]);
	return 0;
}