#include <stdio.h>

int main() {
	int i, j, l;
	int line;
	scanf("%d", &line);

	for (i = 0; i < line; i++) 
	{
		for (j = 0; j < line-i; ++j) 
			printf("*");
		
		printf("\n");
	}
	return 0;
}