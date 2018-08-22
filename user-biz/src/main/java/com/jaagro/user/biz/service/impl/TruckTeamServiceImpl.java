package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateTruckTeamDto;
import com.jaagro.user.api.service.TruckTeamService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author liqiangping
 */
@Service
public class TruckTeamServiceImpl implements TruckTeamService {
    @Override
    public Map<String, Object> createTruck(CreateTruckTeamDto dto) {
        return null;
    }

//    @Autowired
//    private TruckMapper truckMapper;
//    @Autowired
//    private TeamContractMapper teamContractMapper;
//    @Autowired
//    private TruckContractMapper truckContractMapper;
//    @Autowired
//    private TruckQualificationCertificMapper truckQualificationCertificMapper;
//    /**
//     * 创建车队
//     * @param dto
//     * @return
//     */
//    @Transactional(rollbackFor = Exception.class)
//    @Override
//    public Map<String, Object> createTruck(CreateTruckTeamDto dto) {
//        //创建车队对象
//        Truck truck=new Truck();
//        BeanUtils.copyProperties(dto,truck);
//        truck
//                .setCreateTime(new Date())
//                .setTruckType(TruckType.PSERSON)
//                .setCreateUser(1L);
//        truckMapper.insert(truck);
//        //新增车队联系人对象
//        if(dto.getTruckContracts() != null && dto.getTruckContracts().size() > 0){
//            for(CreateTeamContractsDto ctc: dto.getTruckContracts()) {
//                // 创建车队联系人对象
//                TruckContract truckContract = new TruckContract();
//                BeanUtils.copyProperties(ctc,truckContract);
//                truckContract.setTruckId(dto.getId());
//                truckContractMapper.insert(truckContract);
//            }
//        }
//        //新增车队合同对象
//        if(dto.getTeamContracts() != null && dto.getTeamContracts().size() > 0){
//            for(CreateTruckTeamContractDto cc: dto.getTeamContracts()) {
//                //创建车队合同对象
//                TeamContract teamContract = new TeamContract();
//                BeanUtils.copyProperties(cc,teamContract);
//                teamContract.setTruckId(dto.getId());
//                teamContractMapper.insert(teamContract);
//            }
//        }
//
//        //新增车队资质对象
//        if(dto.getTruckQualificationCertifics() != null && dto.getTruckQualificationCertifics().size() > 0){
//            for(CreateQualificationDto ctqc: dto.getTruckQualificationCertifics()){
//                //创建车队资质对象
//                TruckQualificationCertific truckQualificationCertific=new TruckQualificationCertific();
//                BeanUtils.copyProperties(ctqc,truckQualificationCertific);
//                truckQualificationCertific.setReferencesId(dto.getId());
//                truckQualificationCertificMapper.insert(truckQualificationCertific);
//            }
//        }
//        return ServiceResult.toResult("车队创建成功");
//    }
}
