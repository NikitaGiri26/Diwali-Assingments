#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter n: ";
    cin >> n;

    for(int i = 1; i <= n; i++) {
        sum += 2 * i; // Even numbers: 2, 4, 6, ...
    }

    cout << "Sum of first " << n << " even numbers = " << sum << endl;
    return 0;
}
