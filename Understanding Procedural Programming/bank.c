#include <stdio.h>

int balance;

void deposit(int amount) {
    balance += amount;
}

void withdraw(int amount) {
    if (balance >= amount) {
        balance -= amount;
    }
    else {
        printf("Insufficient funds\n");
    }
}

void checkBalance() {
    printf("Your balance is : %d\n", balance);
}

int main() {
    deposit(100);
    withdraw(50);
    withdraw(200);
    checkBalance();
    return 0;
}