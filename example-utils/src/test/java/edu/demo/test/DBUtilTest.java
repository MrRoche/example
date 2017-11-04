package edu.demo.test;

import edu.demo.utils.DBUtil;
import org.junit.Test;

public class DBUtilTest {

    @Test
    public void testGetConnection(){
        System.out.println(DBUtil.getConnection());
    }
}
