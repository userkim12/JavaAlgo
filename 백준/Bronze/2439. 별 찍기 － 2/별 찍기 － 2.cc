#include <stdio.h>

int main() {
	int i, j, l;
	int line;
	scanf("%d", &line);

	for (i = 1; i <= line; i++) 
	{
		for (j = 0; j < line-i; ++j) 
			printf(" ");

		for (l = 0; l < i; l++)
			printf("*");
		
		printf("\n");
	}
	return 0;
}