package com.dao;

;
import com.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
/*目标对象（真实对象）*/
@Component
public class UserDaoImpl implements UserDao {
    private Connection conn = null;
    private PreparedStatement ps= null;
    private ResultSet rs = null;
    private int row = 0;
/*
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "insert into user(name,pass) values(?,?)";
        row =jdbcTemplate.update(sql,user.getName(),user.getPass());
        if (0!=row){
            System.out.println("success...");
            return true;
        }

        return false;
    }

    @Override
    public boolean updateUser(User user) {
        String sql = "update user set pass = ? where id = ?";
        row = jdbcTemplate.update(sql,user.getPass(),user.getId());
        if (row!=0){
            return  true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        String sql= "delete from user where id = ?";
        row = jdbcTemplate.update(sql,user.getId());
        if (row!=0){
            return true;
        }
        return false;
    }

    @Override
    public User listUser(User user) {
        String sql = "select * from user where name= ? and pass = ?";
        User user1 = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
               User user2 = new User();/*应该用注入方式*/
               user2.setId(resultSet.getInt("id"));
               user2.setName(resultSet.getString("name"));
               user2.setPass(resultSet.getString("pass"));
                return user2;
            }
        },user.getName(),user.getPass());
        if (null!=user1){
          return user1;
        }
        return null;
    }

    @Override
    public  List<Map<String,Object>> listAll() {
        String sql = "select * from user";
        List<Map<String,Object>> users = jdbcTemplate.queryForList(sql);
        return null;
    }

    @Override
    public List<User> listUsers() {
        String sql = "select * from user";

       return jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                   User user1 = new User();
                   user1.setId(resultSet.getInt("id"));
                   user1.setName(resultSet.getString("name"));
                   user1.setPass(resultSet.getString("pass"));
                   return user1;
            }
        });
    }
}
