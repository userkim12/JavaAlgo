#include <stdio.h>

int main(void) {	
	int  n, i, max = 0;
	int grade[1000];
	double result = 0, avg = 0.0;
	scanf("%d", &n);
	for (i = 0; i < n; ++i) {
		scanf("%d", &grade[i]);
	}
	max = grade[0];
	for (i = 0; i < n; ++i) {
		if (max <= grade[i])
			max = grade[i];
	}

	for (i = 0; i < n; ++i) {
		result += (double)grade[i] / (double)max * 100;
	}

	avg = result / (double)n;
	printf("%.2lf", avg);
	return 0;
}