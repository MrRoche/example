package edu.demo.utils;

import org.evergreen.db.helper.SQLExecutor;

public class SQLExecutorFactory {

    private static ThreadLocal<SQLExecutor> local = new ThreadLocal<>();

    public static SQLExecutor getSQLExecutor(){
        return new SQLExecutor(DBUtil.getConnection());
    }

    public static SQLExecutor getCurrentSQLExecutor(){
        if(local.get() == null){
            local.set(new SQLExecutor(DBUtil.getConnection()));
        }
        return local.get();
    }
}
