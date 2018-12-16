package com.baizhi.controller;

import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/ems")
@Log4j
public class EmsController {
    @Resource
    EmsMapper emsMapper;

    @ResponseBody
    @RequestMapping("one")
    public Ems queryOne(){
        log.info("11111");
        log.debug("22222222");
        log.warn("3333");
        log.error("4444");
        return emsMapper.selectByPrimaryKey(1);
    }

    
    @ResponseBody
    @RequestMapping("queryAll")
    public List<Ems> queryAll(){
       return  emsMapper.selectAll();
    }

}
