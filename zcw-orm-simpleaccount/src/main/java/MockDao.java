import com.j256.ormlite.dao.*;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.*;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.ObjectFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class MockDao implements Dao<Account, Integer> {
    Account account = new Account();


    public Account queryForId(Integer integer) throws SQLException {
        return null;
    }

    public Account queryForFirst(PreparedQuery<Account> preparedQuery) throws SQLException {
        return null;
    }

    public List<Account> queryForAll() throws SQLException {
        List<Account> accounts = new ArrayList<Account>();
        account.setName("xyz");
        account.setPassword("raw");
        return accounts;
    }

    public List<Account> queryForEq(String s, Object o) throws SQLException {
        return null;
    }

    public List<Account> queryForMatching(Account account) throws SQLException {
        return null;
    }

    public List<Account> queryForMatchingArgs(Account account) throws SQLException {
        return null;
    }

    public List<Account> queryForFieldValues(Map<String, Object> map) throws SQLException {
        return null;
    }

    public List<Account> queryForFieldValuesArgs(Map<String, Object> map) throws SQLException {
        return null;
    }

    public Account queryForSameId(Account account) throws SQLException {
        return null;
    }

    public QueryBuilder<Account, Integer> queryBuilder() {
        return null;
    }

    public UpdateBuilder<Account, Integer> updateBuilder() {
        return null;
    }

    public DeleteBuilder<Account, Integer> deleteBuilder() {
        return null;
    }

    public List<Account> query(PreparedQuery<Account> preparedQuery) throws SQLException {
        return null;
    }

    public int create(Account account) throws SQLException {
        return 1;
    }

    public Account createIfNotExists(Account account) throws SQLException {
        return null;
    }

    public CreateOrUpdateStatus createOrUpdate(Account account) throws SQLException {
        return null;
    }

    public int update(Account account) throws SQLException {
        return 1;
    }

    public int updateId(Account account, Integer integer) throws SQLException {
        return 0;
    }

    public int update(PreparedUpdate<Account> preparedUpdate) throws SQLException {
        return 0;
    }

    public int refresh(Account account) throws SQLException {
        return 0;
    }

    public int delete(Account account) throws SQLException {
        return 1;
    }

    public int deleteById(Integer integer) throws SQLException {
        return 0;
    }

    public int delete(Collection<Account> collection) throws SQLException {
        return 0;
    }

    public int deleteIds(Collection<Integer> collection) throws SQLException {
        return 0;
    }

    public int delete(PreparedDelete<Account> preparedDelete) throws SQLException {
        return 1;
    }

    public CloseableIterator<Account> iterator() {
        return null;
    }

    public CloseableIterator<Account> iterator(int i) {
        return null;
    }

    public CloseableIterator<Account> iterator(PreparedQuery<Account> preparedQuery) throws SQLException {
        return null;
    }

    public CloseableIterator<Account> iterator(PreparedQuery<Account> preparedQuery, int i) throws SQLException {
        return null;
    }

    public CloseableWrappedIterable<Account> getWrappedIterable() {
        return null;
    }

    public CloseableWrappedIterable<Account> getWrappedIterable(PreparedQuery<Account> preparedQuery) {
        return null;
    }

    public void closeLastIterator() throws SQLException {

    }

    public GenericRawResults<String[]> queryRaw(String s, String... strings) throws SQLException {
        return null;
    }

    public <UO> GenericRawResults<UO> queryRaw(String s, RawRowMapper<UO> rawRowMapper, String... strings) throws SQLException {
        return null;
    }

    public <UO> GenericRawResults<UO> queryRaw(String s, DataType[] dataTypes, RawRowObjectMapper<UO> rawRowObjectMapper, String... strings) throws SQLException {
        return null;
    }

    public GenericRawResults<Object[]> queryRaw(String s, DataType[] dataTypes, String... strings) throws SQLException {
        return null;
    }

    public long queryRawValue(String s, String... strings) throws SQLException {
        return 0;
    }

    public int executeRaw(String s, String... strings) throws SQLException {
        return 0;
    }

    public int executeRawNoArgs(String s) throws SQLException {
        return 0;
    }

    public int updateRaw(String s, String... strings) throws SQLException {
        return 0;
    }

    public <CT> CT callBatchTasks(Callable<CT> callable) throws Exception {
        return null;
    }

    public String objectToString(Account account) {
        return null;
    }

    public boolean objectsEqual(Account account, Account t1) throws SQLException {
        return false;
    }

    public Integer extractId(Account account) throws SQLException {
        return null;
    }

    public Class<Account> getDataClass() {
        return null;
    }

    public FieldType findForeignFieldType(Class<?> aClass) {
        return null;
    }

    public boolean isUpdatable() {
        return false;
    }

    public boolean isTableExists() throws SQLException {
        return false;
    }

    public long countOf() throws SQLException {
        return 0;
    }

    public long countOf(PreparedQuery<Account> preparedQuery) throws SQLException {
        return 0;
    }

    public void assignEmptyForeignCollection(Account account, String s) throws SQLException {

    }

    public <FT> ForeignCollection<FT> getEmptyForeignCollection(String s) throws SQLException {
        return null;
    }

    public void setObjectCache(boolean b) throws SQLException {

    }

    public void setObjectCache(ObjectCache objectCache) throws SQLException {

    }

    public ObjectCache getObjectCache() {
        return null;
    }

    public void clearObjectCache() {

    }

    public Account mapSelectStarRow(DatabaseResults databaseResults) throws SQLException {
        return null;
    }

    public GenericRowMapper<Account> getSelectStarRowMapper() throws SQLException {
        return null;
    }

    public RawRowMapper<Account> getRawRowMapper() {
        return null;
    }

    public boolean idExists(Integer integer) throws SQLException {
        return false;
    }

    public DatabaseConnection startThreadConnection() throws SQLException {
        return null;
    }

    public void endThreadConnection(DatabaseConnection databaseConnection) throws SQLException {

    }

    public void setAutoCommit(boolean b) throws SQLException {

    }

    public void setAutoCommit(DatabaseConnection databaseConnection, boolean b) throws SQLException {

    }

    public boolean isAutoCommit() throws SQLException {
        return false;
    }

    public boolean isAutoCommit(DatabaseConnection databaseConnection) throws SQLException {
        return false;
    }

    public void commit(DatabaseConnection databaseConnection) throws SQLException {

    }

    public void rollBack(DatabaseConnection databaseConnection) throws SQLException {

    }

    public ConnectionSource getConnectionSource() {
        return null;
    }

    public void setObjectFactory(ObjectFactory<Account> objectFactory) {

    }

    public CloseableIterator<Account> closeableIterator() {
        return null;
    }
}
