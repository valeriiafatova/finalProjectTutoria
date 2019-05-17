package com.epam.db;


import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class DBCPDataSourceTest {

    @Test
    public void givenDBCPDataSourceClass_whenCalledgetConnection_thenCorrect() throws SQLException {
        assertTrue(DBCPDataSource.getConnection().isValid(1));
    }

}