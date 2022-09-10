#include <stdio.h>

int main(void) {
	int c = 0, n = 0;
	scanf("%d", &c);
	for (int i = 0; i < c; ++i) {
		scanf("%d", &n);
		int grade[1000];
		int sum = 0;
		double avg = 0.0;

		for (int j = 0; j < n; ++j) {
			scanf("%d", &grade[j]);
			sum += grade[j];
		}

		avg = (double)sum / n;
		int count = 0;

		for (int j = 0; j < n; ++j) {
			if (avg < grade[j]) {
				count++;
			}
		}
		printf("%.3lf%%\n", (double)count * 100 / n );
	}
	return 0;
}