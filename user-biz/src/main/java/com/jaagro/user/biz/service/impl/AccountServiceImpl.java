package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.account.BatchDeleteAccountDto;
import com.jaagro.user.api.dto.request.account.QueryAccountDto;
import com.jaagro.user.api.dto.response.account.AccountReturnDto;
import com.jaagro.user.api.service.AccountClientService;
import com.jaagro.user.api.service.AccountService;
import com.jaagro.utils.BaseResponse;
import com.jaagro.utils.ResponseStatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户查询, 操作
 * @author yj
 * @date 2018/10/26
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountClientService accountClientService;
    /**
     * 逻辑删除账户
     *
     * @param userId
     * @param userType
     * @param accountType
     */
    @Override
    public void deleteAccount(Integer userId, Integer userType, Integer accountType) {
//        QueryAccountDto queryAccountDto = new QueryAccountDto();
//        queryAccountDto
//                .setAccountType(accountType)
//                .setUserId(userId)
//                .setUserType(userType);
//        AccountReturnDto accountDto = accountClientService.getAccountDto(queryAccountDto);
//        if (accountDto != null && accountDto.getId()!= null){
//            BaseResponse baseResponse = accountClientService.deleteAccount(accountDto.getId());
//            if (ResponseStatusCode.OPERATION_SUCCESS.getCode() != baseResponse.getStatusCode()){
//                log.warn("deleteAccount fail,id={}",accountDto.getId());
//                throw new RuntimeException("删除账户失败");
//            }
//        }else{
//            log.warn("account not exist,{}",queryAccountDto);
//        }
    }

    /**
     * 逻辑批量删除账户
     *
     * @param userIdList
     * @param userType
     * @param accountType
     */
    @Override
    public void batchDeleteAccount(List<Integer> userIdList, Integer userType, Integer accountType) {
//        BatchDeleteAccountDto batchDeleteAccountDto = new BatchDeleteAccountDto();
//        batchDeleteAccountDto
//                .setAccountType(accountType)
//                .setUserIdList(userIdList)
//                .setUserType(userType);
//        BaseResponse baseResponse = accountClientService.batchDelete(batchDeleteAccountDto);
//        if(ResponseStatusCode.OPERATION_SUCCESS.getCode() != baseResponse.getStatusCode()){
//            log.warn("batchDeleteAccount fail batchDeleteAccountDto={},baseResponse={}",batchDeleteAccountDto,baseResponse);
//            throw new RuntimeException("批量逻辑删除账户失败");
//        }
    }
}
