#include <stdbool.h>

bool isHappy(int n) {
    int ans = 0;

    if (n == 1)
        return true;

    if (n == 4)
        return false;

    while (n != 0) {
        int num = n % 10;
        n = n / 10;
        ans += num * num;
    }

    return isHappy(ans);
}