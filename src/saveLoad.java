import java.util.ArrayList;

public class saveLoad {


    public static void save(ArrayList<account> toBeSaved) {
        String accountName = new String();
        String money = new String();
        String password = new String();


        for (account item : toBeSaved) {
            accountName += item.accountName + "\n";
            money += item.money + "\n";
            password += item.password + "\n";
        }

        file.writeFile(accountName, "Account Name");
        file.writeFile(money, "Money");
        file.writeFile(password, "Password");
    }

    public static ArrayList load() {
        ArrayList<account> output = new ArrayList();
        String[] accountName = file.readFile("Account Name").split("\n");
        String[] money = file.readFile("Money").split("\n");
        String[] password = file.readFile("Password").split("\n");

        for (int i = 0; i < (accountName.length + money.length + password.length) / 3; i++) {
            account temp = new account(accountName[i], toolBox.makeDouble(money[i]), password[i]);
            output.add(temp);
        }
        return output;


    }
}
