package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.WmUserMoney;
import com.company.project.service.WmUserMoneyService;
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
@RequestMapping("/wm/user/money")
public class WmUserMoneyController {
    @Resource
    private WmUserMoneyService wmUserMoneyService;

    @PostMapping("/add")
    public Result add(WmUserMoney wmUserMoney) {
        wmUserMoneyService.save(wmUserMoney);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        wmUserMoneyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(WmUserMoney wmUserMoney) {
        wmUserMoneyService.update(wmUserMoney);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        WmUserMoney wmUserMoney = wmUserMoneyService.findById(id);
        return ResultGenerator.genSuccessResult(wmUserMoney);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WmUserMoney> list = wmUserMoneyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
