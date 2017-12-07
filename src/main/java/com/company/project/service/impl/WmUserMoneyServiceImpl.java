package com.company.project.service.impl;

import com.company.project.dao.WmUserMoneyMapper;
import com.company.project.model.WmUserMoney;
import com.company.project.service.WmUserMoneyService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/06.
 */
@Service
@Transactional
public class WmUserMoneyServiceImpl extends AbstractService<WmUserMoney> implements WmUserMoneyService {
    @Resource
    private WmUserMoneyMapper wmUserMoneyMapper;

}
