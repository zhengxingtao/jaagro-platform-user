package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.constant.TruckType;
import com.jaagro.user.api.dto.request.CreateTeamContractDto;
import com.jaagro.user.api.dto.request.CreateTruckContractDto;
import com.jaagro.user.api.dto.request.CreateTruckDto;
import com.jaagro.user.api.service.TruckService;
import com.jaagro.user.biz.entity.TeamContract;
import com.jaagro.user.biz.entity.Truck;
import com.jaagro.user.biz.entity.TruckContract;
import com.jaagro.user.biz.mapper.TeamContractMapper;
import com.jaagro.user.biz.mapper.TruckContractMapper;
import com.jaagro.user.biz.mapper.TruckMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.ServiceResult;

import java.util.Date;
import java.util.Map;

/**
 * @author liqiangping
 */
@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckMapper truckMapper;
    @Autowired
    private TeamContractMapper teamContractMapper;
    @Autowired
    private TruckContractMapper truckContractMapper;

    /**
     * 创建车队
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> createTruck(CreateTruckDto dto) {
        //创建车对对象
        Truck truck=new Truck();
        BeanUtils.copyProperties(dto,truck);
        truck
                .setCreateTime(new Date())
                .setTruckType(TruckType.PSERSON)
                .setCreateUser(1L);
        truckMapper.insert(truck);
        //新增车队联系人对象
        if(dto.getTruckContracts() != null && dto.getTruckContracts().size() > 0){
            for(CreateTruckContractDto ctc: dto.getTruckContracts()) {
                // 创建车队联系人对象
                TruckContract truckContract = new TruckContract();
                BeanUtils.copyProperties(ctc,truckContract);
                truckContract.setTruckId(dto.getId());
                truckContractMapper.insert(truckContract);
            }
        }else {
            throw new RuntimeException("添加车队联系人失败");
        }
        //新增车队合同对象
        if(dto.getTeamContracts() != null && dto.getTeamContracts().size() > 0){
            for(CreateTeamContractDto cc: dto.getTeamContracts()) {
                //创建车队合同对象
                TeamContract teamContract = new TeamContract();
                BeanUtils.copyProperties(cc,teamContract);
                teamContract.setTruckId(dto.getId());
                teamContractMapper.insert(teamContract);
            }
        }else{
            throw new RuntimeException("添加车队合同失败");
        }
        return ServiceResult.toResult("车队创建成功");
    }
}
