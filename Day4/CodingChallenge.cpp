#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the size of array (excluding the missing number): ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " elements (numbers from 0 to " << n << "): ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Formula for sum of first n natural numbers
    int expectedSum = n * (n + 1) / 2;

    int actualSum = 0;
    for (int i = 0; i < n; i++) {
        actualSum += arr[i];
    }

    int missing = expectedSum - actualSum;
    cout << "Missing number = " << missing << endl;

    return 0;
}
