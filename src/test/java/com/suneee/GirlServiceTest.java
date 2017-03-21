package com.suneee;

import com.suneee.domain.Girl;
import com.suneee.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/3/20.
 */
@RunWith(SpringRunner.class)//表示测试环境运行
@SpringBootTest//启动整个spring工程
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl = girlService.findOne(14);
        Assert.assertEquals(new Integer(13),girl.getAge());
    }
}
