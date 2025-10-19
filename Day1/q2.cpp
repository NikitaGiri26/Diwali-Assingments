#include <iostream>
#include <vector>
using namespace std;

vector<int> generatePrimes(int n) {
    vector<int> primes;
    if (n < 2)
        return primes; // no primes less than 2

    for (int i = 2; i <= n; i++) {
        bool isPrime = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            primes.push_back(i);
    }

    return primes;
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    vector<int> primes = generatePrimes(n);

    cout << "Prime numbers up to " << n << " are: ";
    for (int p : primes)
        cout << p << " ";

    return 0;
}
