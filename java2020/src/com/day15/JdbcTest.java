package com.day15;

import java.math.BigDecimal;
import java.sql.*;

/**
 * @auth admin
 * @date 2021/1/21
 * @Description
 */
public class JdbcTest {
    public static void main(String[] args) throws Exception {
//        select();
//        add();
        update();
    }

    public static void delete() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?useSSL=false", "root", "root");
        String sql = "delete from emp where id=1";
        PreparedStatement prep = conn.prepareStatement(sql);
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        if (prep != null) {
            prep.close();
        }
        if (conn != null) {
            conn.close();
        }
    }


    public static void update() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?useSSL=false", "root", "root");
        String sql = "update emp set e_name='xxxxx' ,sal='3.15' where id=1";
        PreparedStatement prep = conn.prepareStatement(sql);
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        if (prep != null) {
            prep.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public static void add() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2?useSSL=false", "root", "root");
        String sql = "insert into emp(e_name,job,sal) values('amdin','干饭人','3.14'),('amdin2','干饭人','3.14')";
        PreparedStatement prep = conn.prepareStatement(sql);
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        if (prep != null) {
            prep.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public static void select() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            //第一步：加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //第二步：获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "root");

            String sql = "select * from emp";

            //第三步：获取PreparedStatement
            preparedStatement = connection.prepareStatement(sql);

            //第四步：获取结果集
            rs = preparedStatement.executeQuery();

            //遍历
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("e_name");
                Date date = rs.getDate("hiredate");
                BigDecimal sal = rs.getBigDecimal("sal");
                System.out.println(date);
                System.out.println(sal);
                System.out.println("id:" + id + ",name:" + name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
