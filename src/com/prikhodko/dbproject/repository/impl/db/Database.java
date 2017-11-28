package com.prikhodko.dbproject.repository.impl.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class Database {
    public static DataSource getMySQLDataSource() {
        MysqlDataSource mysqlDS = new MysqlDataSource();
        mysqlDS.setURL("jdbc:mysql://localhost:3306/my_test_schema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        mysqlDS.setUser("root");
        mysqlDS.setPassword("euro2012");
        return mysqlDS;
    }
}
