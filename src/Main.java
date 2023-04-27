import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<account> accounts=saveLoad.load();

        for (account account: accounts) {
            System.out.println(account.accountName);
        }

                /*new ArrayList();
        account account1=new account("Bob",10,"B");
        account account2=new account("Joe",500,"250");
        accounts.add(account1);
        accounts.add(account2);




        */


        saveLoad.save(accounts);
    }
}