package com.mycompany.teste.disco.docker;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Database {
    // ATRIBUTO

    private JdbcTemplate connection;
    private JdbcTemplate backup;

    // CONSTRUTOR
    public Database() {

        BasicDataSource dataSource = new BasicDataSource();
        BasicDataSource backupDataSource = new BasicDataSource();
        //CONEXÃO PARA MYSQL
        backupDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");;
        backupDataSource.setUrl("jdbc:mysql://localhost:3306/miraclesolutions");
        backupDataSource.setUsername("root");
        backupDataSource.setPassword("urubu100");
        this.backup = new JdbcTemplate(backupDataSource);
        
        // CONEXÃO PARA AZURE
        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource​.setUrl("jdbc:sqlserver://miraclesolutions.database.windows.net:1433;database=miraclesolutions;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        dataSource​.setUsername("admin-projeto-miraclesolutions");
        dataSource​.setPassword("#Gfgrupo8");
        this.connection = new JdbcTemplate(dataSource);
        
    }

    // GETTER
    public JdbcTemplate getConnection() {
        return connection;
    }
    
    public JdbcTemplate getBackup() {
        return backup;
    }
}
