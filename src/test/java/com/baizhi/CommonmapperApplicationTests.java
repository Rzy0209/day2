package com.baizhi;

import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class CommonmapperApplicationTests {

    @Resource
    EmsMapper emsMapper;
    @Test
    public void contextLoads() {
        List<Ems> list = emsMapper.selectAll();
        for (Ems ems : list) {
            System.out.println(ems);
        }
    }

}

