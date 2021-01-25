package com.day15;

import com.day15.utils.JdbcUtil;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

/**
 * @auth admin
 * @date 2021/1/21
 * @Description
 */
public class EmpDao {
    public static void main(String[] args) throws Exception {
//        ArrayList<Emp> list = select("a");
//        list.stream().forEach(n -> {
//            System.out.println(n);
//        });
//        list.stream().forEach(System.out::println);

        Emp emp = new Emp(13, "马云", "乡村教师", new BigDecimal(1000.14));
//        add(emp);
//        update(emp);
        delete(13);
    }

    public static void delete(Integer id) throws Exception {
        Connection conn = JdbcUtil.getConn();
        String sql = "delete from emp where id=?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, id);
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        JdbcUtil.close(prep, conn);
    }


    public static void update(Emp emp) throws Exception {
        Connection conn = JdbcUtil.getConn();
        String sql = "update emp set e_name=? ,sal=? where id=?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setString(1, emp.geteName());
        prep.setBigDecimal(2, emp.getSal());
        prep.setInt(3, emp.getId());
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        JdbcUtil.close(prep, conn);
    }

    public static void add(Emp emp) throws Exception {
        Connection conn = JdbcUtil.getConn();
        String sql = "insert into emp(e_name,job,sal) values(?,?,?)";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setString(1, emp.geteName());
        prep.setString(2, emp.getJob());
        prep.setBigDecimal(3, emp.getSal());
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        JdbcUtil.close(prep, conn);
    }

    public static ArrayList<Emp> select(String name) {
        ArrayList<Emp> list = new ArrayList<>();
        Connection conn = JdbcUtil.getConn();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            //?通配符
            String sql = "select * from emp where e_name like ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("e_name");
                Date date = rs.getDate("hiredate");
                BigDecimal sal = rs.getBigDecimal("sal");

                Emp emp = new Emp();
                emp.setId(id);
                emp.seteName(ename);
                emp.setSal(sal);

                list.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, preparedStatement, conn);
        }
        return list;
    }
}
