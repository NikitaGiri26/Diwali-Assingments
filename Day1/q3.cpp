#include <iostream>
using namespace std;

long long factorial(int n) {
    long long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n < 0)
        cout << "Factorial not defined for negative numbers!";
    else
        cout << n << "! = " << factorial(n);

    return 0;
}
