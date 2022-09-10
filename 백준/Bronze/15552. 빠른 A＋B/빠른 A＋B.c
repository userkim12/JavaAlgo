#include <stdio.h>
#include <string.h>
int main(void) {	
	int w, a, b;
	scanf("%d", &w);
	for (int i = 0; i < w; i++) {
		scanf("%d %d", &a, &b);
		printf("%d\n", a+b);
	}

	return 0;
}