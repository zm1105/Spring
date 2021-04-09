package com.lagou.service.impl;

import com.lagou.dao.TitleDao;
import com.lagou.domain.Title;
import com.lagou.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    TitleDao titleDao;

    // 保存文章
    @Override
    public int saveTitle(Title title) {
        int i = titleDao.saveTitle(title);
        //System.out.println(1/0);
        return i;
    }
}
