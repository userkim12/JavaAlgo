#include <stdio.h>

int main(void) {
	int num = 0, i;
	int ans = 0;
	scanf("%d", &num);
	for (i = num; i >= 1; --i) {
		ans += i;
	}
	printf("%d", ans);
	return 0;
}