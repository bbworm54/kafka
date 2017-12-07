package com.company.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "wm_user_fund_record")
public class WmUserFundRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 来源去向
     */
    private String fundflow;

    /**
     * 金额
     */
    private BigDecimal fund;

    /**
     * 日志id
     */
    @Column(name = "log_id")
    private Long logId;

    /**
     * 类型 0-出账 （红色） 1-入账（蓝色）2 冻结 3 解冻
     */
    private Integer type;

    /**
     *  资金类别 0-充值 1-体现 2－到期本金 3-收益 4-活动收入（现金红包）5-扣费 6-投资 7自主投资 8 转账 9 商城 10散标流标解冻(手续费账户-1提现-2转让，红包账户-5新手收益-6活期收益-7定存红包-8现金红包-9定存到期 -10 随心存到期 -11随心存月收益  -12定转手续费返还  -13 余额迁移 -14 定存宝月收益 -15活期宝还息 -16新手宝还息 -17推荐投资提成)
     */
    @Column(name = "fund_type")
    private Byte fundType;

    /**
     * 余额
     */
    private BigDecimal balance;

    @Column(name = "record_time")
    private Integer recordTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取来源去向
     *
     * @return fundflow - 来源去向
     */
    public String getFundflow() {
        return fundflow;
    }

    /**
     * 设置来源去向
     *
     * @param fundflow 来源去向
     */
    public void setFundflow(String fundflow) {
        this.fundflow = fundflow;
    }

    /**
     * 获取金额
     *
     * @return fund - 金额
     */
    public BigDecimal getFund() {
        return fund;
    }

    /**
     * 设置金额
     *
     * @param fund 金额
     */
    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    /**
     * 获取日志id
     *
     * @return log_id - 日志id
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 设置日志id
     *
     * @param logId 日志id
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 获取类型 0-出账 （红色） 1-入账（蓝色）2 冻结 3 解冻
     *
     * @return type - 类型 0-出账 （红色） 1-入账（蓝色）2 冻结 3 解冻
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 0-出账 （红色） 1-入账（蓝色）2 冻结 3 解冻
     *
     * @param type 类型 0-出账 （红色） 1-入账（蓝色）2 冻结 3 解冻
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取 资金类别 0-充值 1-体现 2－到期本金 3-收益 4-活动收入（现金红包）5-扣费 6-投资 7自主投资 8 转账 9 商城 10散标流标解冻(手续费账户-1提现-2转让，红包账户-5新手收益-6活期收益-7定存红包-8现金红包-9定存到期 -10 随心存到期 -11随心存月收益  -12定转手续费返还  -13 余额迁移 -14 定存宝月收益 -15活期宝还息 -16新手宝还息 -17推荐投资提成)
     *
     * @return fund_type -  资金类别 0-充值 1-体现 2－到期本金 3-收益 4-活动收入（现金红包）5-扣费 6-投资 7自主投资 8 转账 9 商城 10散标流标解冻(手续费账户-1提现-2转让，红包账户-5新手收益-6活期收益-7定存红包-8现金红包-9定存到期 -10 随心存到期 -11随心存月收益  -12定转手续费返还  -13 余额迁移 -14 定存宝月收益 -15活期宝还息 -16新手宝还息 -17推荐投资提成)
     */
    public Byte getFundType() {
        return fundType;
    }

    /**
     * 设置 资金类别 0-充值 1-体现 2－到期本金 3-收益 4-活动收入（现金红包）5-扣费 6-投资 7自主投资 8 转账 9 商城 10散标流标解冻(手续费账户-1提现-2转让，红包账户-5新手收益-6活期收益-7定存红包-8现金红包-9定存到期 -10 随心存到期 -11随心存月收益  -12定转手续费返还  -13 余额迁移 -14 定存宝月收益 -15活期宝还息 -16新手宝还息 -17推荐投资提成)
     *
     * @param fundType  资金类别 0-充值 1-体现 2－到期本金 3-收益 4-活动收入（现金红包）5-扣费 6-投资 7自主投资 8 转账 9 商城 10散标流标解冻(手续费账户-1提现-2转让，红包账户-5新手收益-6活期收益-7定存红包-8现金红包-9定存到期 -10 随心存到期 -11随心存月收益  -12定转手续费返还  -13 余额迁移 -14 定存宝月收益 -15活期宝还息 -16新手宝还息 -17推荐投资提成)
     */
    public void setFundType(Byte fundType) {
        this.fundType = fundType;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return record_time
     */
    public Integer getRecordTime() {
        return recordTime;
    }

    /**
     * @param recordTime
     */
    public void setRecordTime(Integer recordTime) {
        this.recordTime = recordTime;
    }
}