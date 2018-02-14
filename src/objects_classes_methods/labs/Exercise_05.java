package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

/**
 * Models a bank account balance on a monthly basis and keeps track of the month with the highest expenses.
 */
class BankAccount {
    String month;
    static double balance;
    static double highestExpenses;
    static String monthHighestExpenses;
    double expenses;

    public BankAccount(String m) {
        month = m;
        balance = 0.0;
        highestExpenses = 0.0;
        monthHighestExpenses = "";
        expenses = 0.0;
    }

    public void getPaid(double amount) {
        balance += amount;
    }

    public void changeExpenses(double e) {
        if (e > highestExpenses) {
            highestExpenses = e;
            monthHighestExpenses = month;
            balance -= e;
        }
        expenses = e;
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount[] months = new BankAccount[3];
        String[] monthNames = {"January", "February", "March"};

        for (int i = 0; i < months.length; i++) {
            months[i] = new BankAccount(monthNames[i]);
            months[i].getPaid(10000. * (i + 1.0));
            months[i].changeExpenses(1400. * (i / 2.0));
            System.out.println(months[i].month);
            System.out.println("Balance:\t\t\t\t\t\t" + months[i].balance);
            System.out.println("Expenses:\t\t\t\t\t\t" + months[i].expenses);
            System.out.println("Month with highest expenses:\t" + months[i].monthHighestExpenses + "\n");
        }
    }
}
