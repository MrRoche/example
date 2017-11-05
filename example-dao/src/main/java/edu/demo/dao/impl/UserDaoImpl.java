package edu.demo.dao.impl;

import edu.demo.utils.SQLExecutorFactory;
import edu.demo.dao.UserDao;
import edu.demo.model.Users;
import org.evergreen.beans.annotation.Component;
import org.evergreen.db.helper.SQLExecutor;
import org.evergreen.db.helper.handler.BeanHandler;
import org.evergreen.db.helper.handler.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Override
    public Users findUserById(String uid) {
        String sql = "SELECT * FROM USER_INFO WHERE U_ID = ?";
        try {
            SQLExecutor se = SQLExecutorFactory.getSQLExecutor();
            BeanHandler<Users> handler = new BeanHandler<>(Users.class);
            return se.executeQuery(sql, handler, uid);
        } catch (SQLException e) {
            throw new RuntimeException("Exception in findUserById", e);
        }
    }

    @Override
    public List<Users> findUsers() {
        String sql = "SELECT * FROM USER_INFO";
        try {
            SQLExecutor se = SQLExecutorFactory.getSQLExecutor();
            BeanListHandler<Users> handler = new BeanListHandler<>(Users.class);
            return se.executeQuery(sql, handler);
        } catch (SQLException e) {
            throw new RuntimeException("Exception in findUsers", e);
        }
    }

    @Override
    public int saveUser(Users user) {
        String sql = "INSERT INTO USER_INFO(U_ID, U_NAME, U_TEL) VALUES(?,?,?)";
        try {
            SQLExecutor sqlExecutor = SQLExecutorFactory.getSQLExecutor();
            return sqlExecutor.executeUpdate(sql, user.getUid(), user.getUserName(), user.getUserName());
        } catch (SQLException e) {
            throw new RuntimeException("Exception in saveUser", e);
        }
    }
}
