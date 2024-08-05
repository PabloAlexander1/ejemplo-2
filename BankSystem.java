import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito exitoso. Nuevo saldo: " + balance);
        } else {
            System.out.println("Cantidad inválida para el depósito.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiro exitoso. Nuevo saldo: " + balance);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, accountHolder, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Cuenta creada exitosamente.");
        } else {
            System.out.println("El número de cuenta ya existe.");
        }
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    public void displayAccountBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Saldo de la cuenta " + account.getAccountNumber() + ": " + account.getBalance());
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema Bancario:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el número de cuenta: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Ingrese el saldo inicial: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, accountHolder, initialBalance);
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositToAccount(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdrawFromAccount(accountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Ingrese el número de cuenta: ");
                    accountNumber = scanner.nextLine();
                    bank.displayAccountBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema bancario.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
