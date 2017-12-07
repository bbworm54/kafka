package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.WmUserFundRecordMapper;
import com.company.project.model.WmUserFundRecord;
import com.company.project.service.WmUserFundRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/06.
 */
@Service
@Transactional
public class WmUserFundRecordServiceImpl extends AbstractService<WmUserFundRecord> implements WmUserFundRecordService {
    @Resource
    private WmUserFundRecordMapper wmUserFundRecordMapper;


}
