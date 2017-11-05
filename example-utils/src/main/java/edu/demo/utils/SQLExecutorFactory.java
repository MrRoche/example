package edu.demo.utils;

import org.evergreen.db.helper.SQLExecutor;

import java.sql.SQLException;

public class SQLExecutorFactory {

    private static ThreadLocal<SQLExecutor> local = new ThreadLocal<>();

    public static SQLExecutor getSQLExecutor() throws SQLException {
        return new SQLExecutor(DBUtil.getConnection());
    }

    public static SQLExecutor getCurrentSQLExecutor() throws SQLException {
        if(local.get() == null){
            local.set(new SQLExecutor(DBUtil.getConnection()));
        }
        return local.get();
    }
}
