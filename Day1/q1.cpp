#include <iostream>
using namespace std;

bool isPrime(int n) {
    if (n <= 1) 
        return false; // 0 and 1 are not prime
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false; // divisible by i, not prime
    }
    return true; // no divisors found, so it's prime
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (isPrime(n))
        cout << "True (Prime)";
    else
        cout << "False (Not Prime)";

    return 0;
}
