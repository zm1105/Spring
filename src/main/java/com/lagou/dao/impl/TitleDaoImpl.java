package com.lagou.dao.impl;

import com.lagou.dao.TitleDao;
import com.lagou.domain.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TitleDaoImpl implements TitleDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveTitle(Title title) {
        String sql = "insert into t_article (id,title,content) values (null,?,?)";
        int i = jdbcTemplate.update(sql, title.getTitle(), title.getContent());
        return i;
    }
}
