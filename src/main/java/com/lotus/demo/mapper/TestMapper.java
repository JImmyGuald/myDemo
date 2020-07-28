package com.lotus.demo.mapper;

import com.lotus.demo.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author djw
 * @since 2020-07-24
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
