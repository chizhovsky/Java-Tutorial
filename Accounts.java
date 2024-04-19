public class Accounts {
    public static final class Account {
        private float money;
        private String name;
        public float getMoney() {
            return money;
        }
        public void setMoney(float money) {
            this.money = money;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        String[] names = {"Ivan Petrov", "Sidor Petrov", "Petr Ivanov", "Sidor Ivanov", "Petr Sidorov"};
        float[] money = {100f, 200f, 300f, 400f, 500f};
        for (int i = 0; i < 5; i++) {
            accounts[i] = new Account();
            accounts[i].setName(names[i]);
            accounts[i].setMoney(money[i]);
        }
        for (int i = 0; i < accounts.length; i++) {
            float currentMoney = accounts[i].getMoney();
            currentMoney = currentMoney * 0.1f + currentMoney;
            accounts[i].setMoney(currentMoney);
        }
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Name: " + accounts[i].getName() + ". Money: " + accounts[i].getMoney());
        }
    }
}
