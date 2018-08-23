package com.jaagro.user.api.service;

import java.util.Map;

/**
 * @author liqiangping
 */
public interface TruckService {
    /**
     * 获取单条记录
     * @param id
     * @return
     */
    Map<String, Object> getById(Integer id);
}
