package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.WmUserUsers;
import com.company.project.service.WmUserUsersService;
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
@RequestMapping("/wm/user/users")
public class WmUserUsersController {
    @Resource
    private WmUserUsersService wmUserUsersService;

    @PostMapping("/add")
    public Result add(WmUserUsers wmUserUsers) {
        wmUserUsersService.save(wmUserUsers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        wmUserUsersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(WmUserUsers wmUserUsers) {
        wmUserUsersService.update(wmUserUsers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        WmUserUsers wmUserUsers = wmUserUsersService.findById(id);
        return ResultGenerator.genSuccessResult(wmUserUsers);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<WmUserUsers> list = wmUserUsersService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
