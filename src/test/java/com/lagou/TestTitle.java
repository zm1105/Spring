package com.lagou;

import com.lagou.domain.Title;
import com.lagou.service.TitleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTitle {

    @Autowired
    TitleService titleService;

    @Test
    public void testSaveTitle() {
        Title title = new Title();
        title.setTitle("入门到放弃");
        title.setContent("锤电脑");

        titleService.saveTitle(title);
    }
}
