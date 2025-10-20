#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n, original, sum = 0, digit, count = 0;
    cout << "Enter a number: ";
    cin >> n;

    original = n;

    // Count digits
    int temp = n;
    while(temp > 0) {
        temp /= 10;
        count++;
    }

    temp = n;
    // Sum of each digit^count
    while(temp > 0) {
        digit = temp % 10;
        sum += pow(digit, count);
        temp /= 10;
    }

    if(sum == original)
        cout << "Armstrong Number" << endl;
    else
        cout << "Not an Armstrong Number" << endl;

    return 0;
}
