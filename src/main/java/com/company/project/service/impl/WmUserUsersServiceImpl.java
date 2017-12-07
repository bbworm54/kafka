package com.company.project.service.impl;

import com.company.project.dao.WmUserUsersMapper;
import com.company.project.model.WmUserUsers;
import com.company.project.service.WmUserUsersService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/06.
 */
@Service
@Transactional
public class WmUserUsersServiceImpl extends AbstractService<WmUserUsers> implements WmUserUsersService {
    @Resource
    private WmUserUsersMapper wmUserUsersMapper;

}
