#include <stdio.h>

int main(void) {	
	int length, all = 0;
	char sum[100] = { 0 };
	scanf("%d", &length);
	scanf("%s", sum);

	for (int i = 0; i < length; ++i) {
		all += sum[i] - '0';
	}
	printf("%d", all);
	return 0;
}