package com.lotus.demo;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lotus.demo.service.ITestService;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private ITestService testService;

    @Test
    void contextLoads() {
    }

    @Test
    void add(){
        com.lotus.demo.entity.Test test = new com.lotus.demo.entity.Test();
        test.setId(1);
        test.setName("a");
        testService.save(test);
    }

    @Test
    void delete(){
        QueryWrapper<com.lotus.demo.entity.Test> wrapper = new QueryWrapper();
        wrapper.eq("id",1);
        testService.remove(wrapper);
    }

    @Test
    void query(){
        Page<com.lotus.demo.entity.Test> page = new Page<>(1, 8);
        QueryWrapper<com.lotus.demo.entity.Test> wrapper = new QueryWrapper();
        //wrapper.eq("id",1);
        wrapper.orderByAsc("id","name");
        IPage<com.lotus.demo.entity.Test> res =  testService.page(page,wrapper);
        System.out.println(JSON.toJSONString(res));
    }

    @Test
    void update(){
        UpdateWrapper<com.lotus.demo.entity.Test> updateWrapper = new UpdateWrapper();
        updateWrapper.set("name","hh").eq("id",1);
        testService.update(updateWrapper);
    }

}
