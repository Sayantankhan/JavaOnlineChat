package com.OnlineChat.application.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.OnlineChat.application.bean.OnlineUser;

@Repository
public class OnlineUserRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public OnlineUser findById(String id) {
		return jdbcTemplate.queryForObject("select * from tbl_onlineuser where id=?", new Object[] {id},new BeanPropertyRowMapper<OnlineUser>(OnlineUser.class));
	}
}
