package com.suchaos.repository;

import com.suchaos.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * UserRepository
 *
 * @author suchao
 * @date 2018/11/23
 */
public interface UserRepository {
    int save1(User user, JdbcTemplate primaryJdbcTemplate);

    int save2(User user, JdbcTemplate secondaryJdbcTemplate);

    int update(User user, JdbcTemplate jdbcTemplate);

    int delete(long id, JdbcTemplate jdbcTemplate);

    List<User> findALL(JdbcTemplate jdbcTemplate);

    User findById(long id, JdbcTemplate jdbcTemplate);
}
