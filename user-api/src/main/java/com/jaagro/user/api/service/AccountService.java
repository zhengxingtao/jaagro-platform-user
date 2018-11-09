package com.jaagro.user.api.service;

import java.util.List;

/**
 * 账户查询,操作
 * @author yj
 * @date 2018/10/26
 */
public interface AccountService {
    /**
     * 逻辑删除账户
     * @param userId
     * @param userType
     * @param accountType
     */
    void deleteAccount(Integer userId,Integer userType,Integer accountType);
    /**
     * 逻辑批量删除账户
     * @param userIdList
     * @param userType
     * @param accountType
     */
    void batchDeleteAccount(List<Integer> userIdList, Integer userType, Integer accountType);
}
