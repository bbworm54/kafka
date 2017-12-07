package com.company.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "wm_user_money")
public class WmUserMoney {
    /**
     * 用户资金表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 资金总额
     */
    @Column(name = "total_fund")
    private BigDecimal totalFund;

    /**
     * 资金余额
     */
    @Column(name = "usable_fund")
    private BigDecimal usableFund;

    /**
     * 出账冻结金额
     */
    @Column(name = "freeze_fund")
    private BigDecimal freezeFund;

    /**
     * 电子账户余额(废弃)
     */
    @Column(name = "account_fund")
    private BigDecimal accountFund;

    /**
     * 入账冻结金额
     */
    @Column(name = "infreeze_fund")
    private BigDecimal infreezeFund;

    private Date updated;

    /**
     * 迁移处理 1、已写入批量发红包账户
     */
    private Integer tfdeal;

    /**
     * 获取用户资金表
     *
     * @return id - 用户资金表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户资金表
     *
     * @param id 用户资金表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取资金总额
     *
     * @return total_fund - 资金总额
     */
    public BigDecimal getTotalFund() {
        return totalFund;
    }

    /**
     * 设置资金总额
     *
     * @param totalFund 资金总额
     */
    public void setTotalFund(BigDecimal totalFund) {
        this.totalFund = totalFund;
    }

    /**
     * 获取资金余额
     *
     * @return usable_fund - 资金余额
     */
    public BigDecimal getUsableFund() {
        return usableFund;
    }

    /**
     * 设置资金余额
     *
     * @param usableFund 资金余额
     */
    public void setUsableFund(BigDecimal usableFund) {
        this.usableFund = usableFund;
    }

    /**
     * 获取出账冻结金额
     *
     * @return freeze_fund - 出账冻结金额
     */
    public BigDecimal getFreezeFund() {
        return freezeFund;
    }

    /**
     * 设置出账冻结金额
     *
     * @param freezeFund 出账冻结金额
     */
    public void setFreezeFund(BigDecimal freezeFund) {
        this.freezeFund = freezeFund;
    }

    /**
     * 获取电子账户余额(废弃)
     *
     * @return account_fund - 电子账户余额(废弃)
     */
    public BigDecimal getAccountFund() {
        return accountFund;
    }

    /**
     * 设置电子账户余额(废弃)
     *
     * @param accountFund 电子账户余额(废弃)
     */
    public void setAccountFund(BigDecimal accountFund) {
        this.accountFund = accountFund;
    }

    /**
     * 获取入账冻结金额
     *
     * @return infreeze_fund - 入账冻结金额
     */
    public BigDecimal getInfreezeFund() {
        return infreezeFund;
    }

    /**
     * 设置入账冻结金额
     *
     * @param infreezeFund 入账冻结金额
     */
    public void setInfreezeFund(BigDecimal infreezeFund) {
        this.infreezeFund = infreezeFund;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取迁移处理 1、已写入批量发红包账户
     *
     * @return tfdeal - 迁移处理 1、已写入批量发红包账户
     */
    public Integer getTfdeal() {
        return tfdeal;
    }

    /**
     * 设置迁移处理 1、已写入批量发红包账户
     *
     * @param tfdeal 迁移处理 1、已写入批量发红包账户
     */
    public void setTfdeal(Integer tfdeal) {
        this.tfdeal = tfdeal;
    }
}
