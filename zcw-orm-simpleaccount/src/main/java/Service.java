import com.j256.ormlite.dao.Dao;


import java.sql.SQLException;
import java.util.List;

public class Service {
    private Account account;
    private Dao<Account, Integer> accountDao;
    Console console;

    public Service(Dao<Account, Integer> accountDao, Account account) {
        this.accountDao = accountDao;
        this.account = account;
        console = new Console();

    }

    public int create() {
        try {
            accountDao.create(account);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int read(){
        String name = readName();
        String  id = ""+console.readInteger("Enter your id to get the account details");
        try {
            List<Account> accountList =
                    accountDao.queryBuilder().where()
                            .eq(account.getName(), name)
                            .and()
                            .eq(""+account.getId(), id)
                            .query();
            return accountList.size();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(){
        int choice = console.readInteger("Enter 1 to change the name \n2 to change the password");
        if(choice == 1){
           updateName();
           return 1;
        }
        else {
            updatePassword();
        }
        return 0;
    }

    public int delete(){
        try {
            accountDao.delete(account);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void updateName(){
        String name = readName();
        account.setName(name);
        try {
            accountDao.update(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePassword(){
        String password = readPassword();
        account.setPassword(password);
        try {
            accountDao.update(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String readName(){
       String name =  console.readString("Enter your name : ");
       return name;
    }

    public String readPassword(){
        String password = console.readString("Enter your password : ");
        return password;
    }

}
