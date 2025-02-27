#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int f0 = 0;
    int f1 = 1;
    int fn = 0;
    
    for(int i = 2; i <= n; i++){
        fn = (f0 + f1) % 1234567;
        f0 = f1;
        f1 = fn;
    }
    
    return fn;
    
}
