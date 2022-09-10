#include <stdio.h>
#include <string.h>
int main(void) {	
	int i;
	char words[100] = { 0 };
	scanf("%s", words);
	for (i = 0; i < strlen(words); ++i) {
		printf("%c", words[i]);
		if ((i+1)% 10 == 0) 
			printf("\n");
	}
	return 0;
}