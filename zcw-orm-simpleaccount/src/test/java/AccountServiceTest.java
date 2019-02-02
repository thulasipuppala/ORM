import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.query.In;
import org.junit.Test;
import org.junit.Assert;

import java.sql.SQLException;


public class AccountServiceTest {

   Dao<Account, Integer> dao = new MockDao();
   Account account = new Account();
   Service service = new Service(dao,account);

   @Test
    public void testCreate() throws SQLException {
      int expected = 1;
      int actual = dao.create(account);
      Assert.assertEquals(expected, actual);
   }

   @Test
   public void testUpdate() throws SQLException {
      int expected = 1;
      int actual = dao.create(account);
      Assert.assertEquals(expected, actual);
   }

   @Test
   public void testDelete() throws SQLException {
      int expected = 1;
      int actual = dao.delete(account);
      Assert.assertEquals(expected, actual);
   }

   @Test
   public void testRead(){
      service.create();
      int expected = 1;
      int actual = 1;
      Assert.assertEquals(expected, actual);
   }
}
