package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.CreateTruckTeamContractDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.user.biz.entity.Driver;
import com.jaagro.user.biz.entity.TruckTeamContract;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.user.biz.mapper.TruckTeamContractMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.ServiceResult;

import java.util.Map;

/**
 * @author liqiangping
 */
@Service
public class DriverServiceImpl implements DriverService {


    @Autowired
    private DriverMapper driverMapper;

    @Autowired
    private TruckTeamContractMapper teamContractMapper;
    /**
     * 新增司机合同
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> createDriver(CreateDriverDto dto) {
        //创建司机对象
        Driver driver=new Driver();
        BeanUtils.copyProperties(dto,driver);
        driver
                .setCreateUserId(1);
        driverMapper.insert(driver);
        //新增司机合同对象
        if(dto.getTeamContracts() != null && dto.getTeamContracts().size() > 0){
            for(CreateTruckTeamContractDto ctc: dto.getTeamContracts()) {
                TruckTeamContract teamContract = new TruckTeamContract();
                BeanUtils.copyProperties(ctc, teamContract);
                teamContract.setTruckTeamId(dto.getId());
                teamContractMapper.insert(teamContract);
            }
        }else{
            throw new RuntimeException("添加司机合同失败");
        }
        return ServiceResult.toResult("添加司机合同成功");
    }
}
