package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.response.GetCustomerUserDto;
import com.jaagro.user.api.service.CustomerUserService;
import com.jaagro.user.biz.entity.CustomerUser;
import com.jaagro.user.biz.mapper.CustomerUserMapperExt;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tony
 */
@Service
public class CustomerUserServiceImpl implements CustomerUserService {

    @Autowired
    private CustomerUserMapperExt customerUserMapperExt;

    /**
     * 根据id获取customerUser
     *
     * @param id
     * @return
     */
    @Override
    public GetCustomerUserDto getCustomerUserById(Integer id) {
        CustomerUser customerUser = customerUserMapperExt.selectByPrimaryKey(id);
        if (customerUser == null) {
            throw new NullPointerException("当前用户id: " + id + "不存在");
        }
        GetCustomerUserDto getCustomerUserDto = new GetCustomerUserDto();
        BeanUtils.copyProperties(customerUser, getCustomerUserDto);
        return getCustomerUserDto;
    }

    /**
     * 根据手机号查询
     *
     * @param phoneNumber
     * @return
     */
    @Override
    public GetCustomerUserDto getByPhoneNumber(String phoneNumber) {
        CustomerUser customerUser = customerUserMapperExt.selectByPhoneNumber(phoneNumber);
        return convertToDto(customerUser);
    }

    /**
     * 根据关联客户id查询
     *
     * @param relevanceId
     * @return
     */
    @Override
    public GetCustomerUserDto getCustomerUserByRelevanceId(Integer relevanceId) {
        CustomerUser customerUser = customerUserMapperExt.selectByRelevanceId(relevanceId);
        return convertToDto(customerUser);
    }

    private GetCustomerUserDto convertToDto(CustomerUser customerUser){
        if (customerUser != null){
            GetCustomerUserDto customerUserReturnDto = new GetCustomerUserDto();
            BeanUtils.copyProperties(customerUser,customerUserReturnDto);
            return customerUserReturnDto;
        }
        return null;
    }

}
