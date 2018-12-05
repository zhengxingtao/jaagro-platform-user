package com.jaagro.user.biz.config;

import com.jaagro.user.biz.entity.IdGenerator;
import com.jaagro.user.biz.mapper.IdGeneratorMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 全局id生成器，主要用于目前系统中三种类型的user
 *
 * @author tony
 * @version 1.0.0
 * @date 2018/12/3
 */
@Component
public class IdGeneratorFactory {

    @Autowired
    private IdGeneratorMapperExt idGeneratorMapper;

    public synchronized Integer getNextId() {
        idGeneratorMapper.getNextId();
        IdGenerator data = idGeneratorMapper.selectByPrimaryKey(1);
        return data.getValue();
    }
}
