package account;

public class account {
    public int id;
    public double balance;
    public double cap;
    public String name;

    public boolean pop(double value) {
        if (this.balance >= value && value <= this.cap) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public double deposit(double value) {
        return this.balance += value;
    }

    public boolean transfer(account destiny, double value) {
        if (this.cap >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }
}
