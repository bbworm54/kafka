package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.WmUserFundRecord;
import com.company.project.service.WmUserFundRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/12/06.
*/
@RestController
@RequestMapping("/wm/user/fund/record")
public class WmUserFundRecordController {
    @Resource
    private WmUserFundRecordService wmUserFundRecordService;

    @PostMapping("/add")
    public Result add(WmUserFundRecord wmUserFundRecord) {
        wmUserFundRecordService.save(wmUserFundRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        wmUserFundRecordService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(WmUserFundRecord wmUserFundRecord) {
        wmUserFundRecordService.update(wmUserFundRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        WmUserFundRecord wmUserFundRecord = wmUserFundRecordService.findById(id);
        return ResultGenerator.genSuccessResult(wmUserFundRecord);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WmUserFundRecord> list = wmUserFundRecordService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
