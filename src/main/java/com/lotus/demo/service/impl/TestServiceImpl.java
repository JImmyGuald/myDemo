package com.lotus.demo.service.impl;

import com.lotus.demo.entity.Test;
import com.lotus.demo.mapper.TestMapper;
import com.lotus.demo.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author djw
 * @since 2020-07-24
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
