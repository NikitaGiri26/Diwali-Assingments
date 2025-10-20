#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter n: ";
    cin >> n;

    for(int i = 1; i <= n; i++) {
        sum += (2 * i - 1); // Odd numbers: 1, 3, 5, ...
    }

    cout << "Sum of first " << n << " odd numbers = " << sum << endl;
    return 0;
}
