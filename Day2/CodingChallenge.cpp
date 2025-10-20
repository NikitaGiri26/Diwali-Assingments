#include <iostream>
using namespace std;

int main() {
    int n, reversed = 0;
    cout << "Enter an integer: ";
    cin >> n;

    int num = n;  

    while (num != 0) {
        int digit = num % 10;           
        reversed = reversed * 10 + digit;
        num /= 10;                    
    }

    cout << "Reversed number: " << reversed << endl;
    return 0;
}
