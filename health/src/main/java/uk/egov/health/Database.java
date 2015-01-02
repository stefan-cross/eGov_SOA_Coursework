//package uk.egov.health;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
//import org.springframework.jdbc.support.JdbcAccessor;
//
//import javax.sql.DataSource;
//
///**
// * Created with IntelliJ IDEA.
// * User: stefancross
// * Date: 02/01/2015
// * Time: 16:51
// */
//public class Database {
//
//    private JdbcTemplate jdbcTemplate;
//
//    public Database() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
//        dataSource.setUrl("jdbc:hsqldb:hsql://localhost:egov");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//    }
//
//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//
//    public int getCount() {
//        return this.jdbcTemplate.queryForObject("select count(*) from health", Integer.class);
//    }
//}
