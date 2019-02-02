import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class AccountApp {

    // we are using a MySQl database
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/orm_lab?useUnicode=true";
    private final static String YOURUSERNAME = "root";
    private final static String YOURPASSWORD = null;
    private Dao<Account, Integer> accountDao;

    public static void main(String[] args) throws Exception {
        // turn our static method into an instance of Main
        new AccountApp().doMain(args);
    }

    private void doMain(String[] args) throws Exception {
        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(DATABASE_URL, YOURUSERNAME, YOURPASSWORD);
            // setup our  DAOs
            setupDao(connectionSource);
            // read, write and delete some data
            processData();

           // System.out.println("\n\nIt seems to have worked\n\n");
        } finally {
            // destroy the data source which should close underlying connections
            if (connectionSource != null) {
                connectionSource.close();
            }
        }
    }

    /**
     * Read and write some example data.
     */
    private void processData() throws Exception {
        Console console = new Console();
        String name = console.readString("Enter your name : ");
        String password = console.readString("Enter your password : ");
        Account account = new Account(name, password);
        account.setPassword(password);
        Service driver = new Service(accountDao, account);

       boolean check = true;
       while (check){
            int option = console.readInteger("Enter your choice\n1.create\n2.read\n3.update\n4.delete\n5.exit");
            switch (option){
                case 1: driver.create();
                        break;
                case 2: driver.read();
                        break;
                case 3: driver.update();
                        break;
                case 4: driver.delete();
                        break;
                case 5: check = false;
                        break;
                default: console.printString("Invalid input");
            }
       }

    }


    /**
     * Setup our  DAOs
     */
    private void setupDao(ConnectionSource connectionSource) throws Exception {

        accountDao = DaoManager.createDao(connectionSource, Account.class);

    }
}
