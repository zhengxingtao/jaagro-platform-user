package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.service.TruckService;
import com.jaagro.user.biz.mapper.TruckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.ServiceResult;

import java.util.Map;

/**
 * @author liqiangping
 */
@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckMapper truckMapper;

    @Override
    public Map<String, Object> getById(Integer id) {
        return null;
    }


//    /**
//     * 查询单个车辆信息
//     * @param id
//     * @return
//     */
//    @Override
//    public Map<String, Object> getById(Integer id) {
//        return ServiceResult.toResult(truckMapper.getById(id));
//    }
}
