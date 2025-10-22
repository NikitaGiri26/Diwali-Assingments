#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter a number: ";
    cin >> n;

    while(n > 0) {
        int digit = n % 10;  // extract last digit
        sum += digit;        // add it to sum
        n /= 10;             // remove last digit
    }

    cout << "Sum of digits = " << sum << endl;
    return 0;
}
