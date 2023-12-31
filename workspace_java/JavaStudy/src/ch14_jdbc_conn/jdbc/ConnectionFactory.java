package ch14_jdbc_conn.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private String driver;
    private String url;
    private String id;
    private String pw;
    private int maxConn;
    private static ConnectionFactory instance = new ConnectionFactory();
    public static ConnectionFactory getInstance() {
        return instance;
    }
    private ConnectionFactory() {
        Properties prop = new Properties();
        // db계정정보 불러오기
        InputStream reader = getClass().getClassLoader()
                .getResourceAsStream("config/db.properties");
        try {
            prop.load(reader);
            // 파일에 작성된 정보 가져옴
            driver = prop.getProperty("driver"); // driver=내용
            url= prop.getProperty("url"); // driver=내용
            id= prop.getProperty("id");
            pw= prop.getProperty("password");
            maxConn = Integer.parseInt(prop.getProperty("maxConn"));
            // 드라이버 로딩
            Class.forName(driver);
            System.out.println(url);
            System.out.println(driver);
            System.out.println(pw);
            System.out.println(maxConn);
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, id, pw);
        return conn;
    }
    public int getMaxConn() {
    	return maxConn;
    }

    public static void main(String[] args) {
        ConnectionFactory test = ConnectionFactory.getInstance();
        try {
            Connection con = test.getConnection();
            System.out.println(con);
            System.out.println("접속됨");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}