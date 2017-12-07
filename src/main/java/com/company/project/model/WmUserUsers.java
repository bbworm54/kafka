package com.company.project.model;

import javax.persistence.*;

@Table(name = "wm_user_users")
public class WmUserUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册IP
     */
    @Column(name = "reg_ip")
    private String regIp;

    /**
     * 注册手机号
     */
    private String mobile;

    /**
     * 身份证验证次数（默认一个用户只能验证三次）
     */
    @Column(name = "card_verify_num")
    private Integer cardVerifyNum;

    /**
     * 已经登陆错误次数
     */
    @Column(name = "login_num")
    private Boolean loginNum;

    /**
     * 锁定时间
     */
    @Column(name = "lock_time")
    private Integer lockTime;

    /**
     * 登录密码加密盐
     */
    private String salt;

    /**
     * 是否允许登录 0默认允许，-1不允许
     */
    @Column(name = "is_login")
    private Integer isLogin;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Integer loginTime;

    /**
     * 最后登录IP
     */
    @Column(name = "last_ip")
    private String lastIp;

    /**
     * 用户状态，0默认，-1删除
     */
    private Boolean status;

    /**
     * 推荐人手机号
     */
    @Column(name = "referral_mobile")
    private String referralMobile;

    /**
     * 推荐人数
     */
    @Column(name = "referral_num")
    private Integer referralNum;

    /**
     * 推荐码
     */
    @Column(name = "referral_code")
    private String referralCode;

    /**
     * 用户VIP等级ID
     */
    @Column(name = "user_leve")
    private Long userLeve;

    /**
     * 等级变更时间
     */
    @Column(name = "leve_time")
    private Integer leveTime;

    /**
     * 用户类型   0、普通用户 1、老用户 2、股东用户 3、业务员用户 4、新鲜说用户 5、麦罗用户 6、涌金门  7、金贸街 10、线下推广人员
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 支付密码
     */
    @Column(name = "pay_password")
    private String payPassword;

    /**
     * 交易密码加密
     */
    @Column(name = "pay_salt")
    private String paySalt;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 用户活跃度
     */
    private Integer activity;

    /**
     * 融云token
     */
    private String token;

    /**
     * 用户备注说明
     */
    private String remark;

    private Integer created;

    /**
     * 微信ID
     */
    @Column(name = "wechat_id")
    private String wechatId;

    private Integer week;

    /**
     * 微信号码
     */
    @Column(name = "wechat_number")
    private String wechatNumber;

    /**
     * qq号码
     */
    @Column(name = "qq_number")
    private String qqNumber;

    /**
     * 紧急联系人
     */
    @Column(name = "urgent_mobile")
    private String urgentMobile;

    /**
     * 账户异常提醒 1提醒0不提醒
     */
    private Byte lemind;

    /**
     * 4.0强制修改密码 0 未修改 1已修改
     */
    private Byte pwd;

    private String mqtoken;

    /**
     * 用户来源
     */
    @Column(name = "user_source")
    private Integer userSource;

    /**
     * 电子账户手机号
     */
    @Column(name = "account_mobile")
    private String accountMobile;

    /**
     * 电子账号
     */
    private String accountid;

    /**
     * 电子账户类型 1、普通用户 2、债权(中转)用户 3、美利(借款)用户 4、红包账户 5、手续费账户 6、清算账户 7、散标公户 10、买单侠公户  11、微贷网公户  12、美利公户 13、急用钱公户
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * 电子账户用途 00000 普通用户  10000 红包账户 01000 手续费账户 00100 担保账户
     */
    private String acctuse;

    /**
     * 密码设置状态 1、已设置 0/其他 、未设置
     */
    @Column(name = "pdset_status")
    private Integer pdsetStatus;

    /**
     * 投标签约 1、已签约  0/其他、未签约
     */
    private Integer bidauth;

    /**
     * 债权签约 1、已签约 0/其他 、未签约
     */
    private Integer investauth;

    /**
     * 投标签约订单号
     */
    private String bidorderid;

    /**
     * 债权签约订单号
     */
    private String investorderid;

    private Integer account;

    /**
     * 是否是迁移用户  1、迁移用户 
     */
    private Integer tfstate;

    /**
     * 迁移处理 1、已写入批量开户文件表 2、已处理批量开户结果文件 3、已写入债权关系处理表 4、已处理债权关系 5、投资总额资产处理 6、已处理完投资总额 7、资产总额处理 
     */
    private Integer tfdeal;

    /**
     * 签约关系迁移：0、未处理余额  1、签约后处理  2、余额处理成功
     */
    private Integer signed;

    /**
     * 用户渠道类型 0、线上注册 1、线下推广
     */
    private Integer channels;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取注册IP
     *
     * @return reg_ip - 注册IP
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * 设置注册IP
     *
     * @param regIp 注册IP
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    /**
     * 获取注册手机号
     *
     * @return mobile - 注册手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置注册手机号
     *
     * @param mobile 注册手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取身份证验证次数（默认一个用户只能验证三次）
     *
     * @return card_verify_num - 身份证验证次数（默认一个用户只能验证三次）
     */
    public Integer getCardVerifyNum() {
        return cardVerifyNum;
    }

    /**
     * 设置身份证验证次数（默认一个用户只能验证三次）
     *
     * @param cardVerifyNum 身份证验证次数（默认一个用户只能验证三次）
     */
    public void setCardVerifyNum(Integer cardVerifyNum) {
        this.cardVerifyNum = cardVerifyNum;
    }

    /**
     * 获取已经登陆错误次数
     *
     * @return login_num - 已经登陆错误次数
     */
    public Boolean getLoginNum() {
        return loginNum;
    }

    /**
     * 设置已经登陆错误次数
     *
     * @param loginNum 已经登陆错误次数
     */
    public void setLoginNum(Boolean loginNum) {
        this.loginNum = loginNum;
    }

    /**
     * 获取锁定时间
     *
     * @return lock_time - 锁定时间
     */
    public Integer getLockTime() {
        return lockTime;
    }

    /**
     * 设置锁定时间
     *
     * @param lockTime 锁定时间
     */
    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * 获取登录密码加密盐
     *
     * @return salt - 登录密码加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置登录密码加密盐
     *
     * @param salt 登录密码加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取是否允许登录 0默认允许，-1不允许
     *
     * @return is_login - 是否允许登录 0默认允许，-1不允许
     */
    public Integer getIsLogin() {
        return isLogin;
    }

    /**
     * 设置是否允许登录 0默认允许，-1不允许
     *
     * @param isLogin 是否允许登录 0默认允许，-1不允许
     */
    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取最后登录IP
     *
     * @return last_ip - 最后登录IP
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastIp 最后登录IP
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * 获取用户状态，0默认，-1删除
     *
     * @return status - 用户状态，0默认，-1删除
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置用户状态，0默认，-1删除
     *
     * @param status 用户状态，0默认，-1删除
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取推荐人手机号
     *
     * @return referral_mobile - 推荐人手机号
     */
    public String getReferralMobile() {
        return referralMobile;
    }

    /**
     * 设置推荐人手机号
     *
     * @param referralMobile 推荐人手机号
     */
    public void setReferralMobile(String referralMobile) {
        this.referralMobile = referralMobile;
    }

    /**
     * 获取推荐人数
     *
     * @return referral_num - 推荐人数
     */
    public Integer getReferralNum() {
        return referralNum;
    }

    /**
     * 设置推荐人数
     *
     * @param referralNum 推荐人数
     */
    public void setReferralNum(Integer referralNum) {
        this.referralNum = referralNum;
    }

    /**
     * 获取推荐码
     *
     * @return referral_code - 推荐码
     */
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * 设置推荐码
     *
     * @param referralCode 推荐码
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * 获取用户VIP等级ID
     *
     * @return user_leve - 用户VIP等级ID
     */
    public Long getUserLeve() {
        return userLeve;
    }

    /**
     * 设置用户VIP等级ID
     *
     * @param userLeve 用户VIP等级ID
     */
    public void setUserLeve(Long userLeve) {
        this.userLeve = userLeve;
    }

    /**
     * 获取等级变更时间
     *
     * @return leve_time - 等级变更时间
     */
    public Integer getLeveTime() {
        return leveTime;
    }

    /**
     * 设置等级变更时间
     *
     * @param leveTime 等级变更时间
     */
    public void setLeveTime(Integer leveTime) {
        this.leveTime = leveTime;
    }

    /**
     * 获取用户类型   0、普通用户 1、老用户 2、股东用户 3、业务员用户 4、新鲜说用户 5、麦罗用户 6、涌金门  7、金贸街 10、线下推广人员
     *
     * @return user_type - 用户类型   0、普通用户 1、老用户 2、股东用户 3、业务员用户 4、新鲜说用户 5、麦罗用户 6、涌金门  7、金贸街 10、线下推广人员
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型   0、普通用户 1、老用户 2、股东用户 3、业务员用户 4、新鲜说用户 5、麦罗用户 6、涌金门  7、金贸街 10、线下推广人员
     *
     * @param userType 用户类型   0、普通用户 1、老用户 2、股东用户 3、业务员用户 4、新鲜说用户 5、麦罗用户 6、涌金门  7、金贸街 10、线下推广人员
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证号
     *
     * @return id_card - 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号
     *
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取支付密码
     *
     * @return pay_password - 支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 设置支付密码
     *
     * @param payPassword 支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    /**
     * 获取交易密码加密
     *
     * @return pay_salt - 交易密码加密
     */
    public String getPaySalt() {
        return paySalt;
    }

    /**
     * 设置交易密码加密
     *
     * @param paySalt 交易密码加密
     */
    public void setPaySalt(String paySalt) {
        this.paySalt = paySalt;
    }

    /**
     * 获取头像地址
     *
     * @return avatar - 头像地址
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像地址
     *
     * @param avatar 头像地址
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取用户活跃度
     *
     * @return activity - 用户活跃度
     */
    public Integer getActivity() {
        return activity;
    }

    /**
     * 设置用户活跃度
     *
     * @param activity 用户活跃度
     */
    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    /**
     * 获取融云token
     *
     * @return token - 融云token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置融云token
     *
     * @param token 融云token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取用户备注说明
     *
     * @return remark - 用户备注说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置用户备注说明
     *
     * @param remark 用户备注说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * 获取微信ID
     *
     * @return wechat_id - 微信ID
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * 设置微信ID
     *
     * @param wechatId 微信ID
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * @return week
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * @param week
     */
    public void setWeek(Integer week) {
        this.week = week;
    }

    /**
     * 获取微信号码
     *
     * @return wechat_number - 微信号码
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 设置微信号码
     *
     * @param wechatNumber 微信号码
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    /**
     * 获取qq号码
     *
     * @return qq_number - qq号码
     */
    public String getQqNumber() {
        return qqNumber;
    }

    /**
     * 设置qq号码
     *
     * @param qqNumber qq号码
     */
    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    /**
     * 获取紧急联系人
     *
     * @return urgent_mobile - 紧急联系人
     */
    public String getUrgentMobile() {
        return urgentMobile;
    }

    /**
     * 设置紧急联系人
     *
     * @param urgentMobile 紧急联系人
     */
    public void setUrgentMobile(String urgentMobile) {
        this.urgentMobile = urgentMobile;
    }

    /**
     * 获取账户异常提醒 1提醒0不提醒
     *
     * @return lemind - 账户异常提醒 1提醒0不提醒
     */
    public Byte getLemind() {
        return lemind;
    }

    /**
     * 设置账户异常提醒 1提醒0不提醒
     *
     * @param lemind 账户异常提醒 1提醒0不提醒
     */
    public void setLemind(Byte lemind) {
        this.lemind = lemind;
    }

    /**
     * 获取4.0强制修改密码 0 未修改 1已修改
     *
     * @return pwd - 4.0强制修改密码 0 未修改 1已修改
     */
    public Byte getPwd() {
        return pwd;
    }

    /**
     * 设置4.0强制修改密码 0 未修改 1已修改
     *
     * @param pwd 4.0强制修改密码 0 未修改 1已修改
     */
    public void setPwd(Byte pwd) {
        this.pwd = pwd;
    }

    /**
     * @return mqtoken
     */
    public String getMqtoken() {
        return mqtoken;
    }

    /**
     * @param mqtoken
     */
    public void setMqtoken(String mqtoken) {
        this.mqtoken = mqtoken;
    }

    /**
     * 获取用户来源
     *
     * @return user_source - 用户来源
     */
    public Integer getUserSource() {
        return userSource;
    }

    /**
     * 设置用户来源
     *
     * @param userSource 用户来源
     */
    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    /**
     * 获取电子账户手机号
     *
     * @return account_mobile - 电子账户手机号
     */
    public String getAccountMobile() {
        return accountMobile;
    }

    /**
     * 设置电子账户手机号
     *
     * @param accountMobile 电子账户手机号
     */
    public void setAccountMobile(String accountMobile) {
        this.accountMobile = accountMobile;
    }

    /**
     * 获取电子账号
     *
     * @return accountid - 电子账号
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * 设置电子账号
     *
     * @param accountid 电子账号
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    /**
     * 获取电子账户类型 1、普通用户 2、债权(中转)用户 3、美利(借款)用户 4、红包账户 5、手续费账户 6、清算账户 7、散标公户 10、买单侠公户  11、微贷网公户  12、美利公户 13、急用钱公户
     *
     * @return account_type - 电子账户类型 1、普通用户 2、债权(中转)用户 3、美利(借款)用户 4、红包账户 5、手续费账户 6、清算账户 7、散标公户 10、买单侠公户  11、微贷网公户  12、美利公户 13、急用钱公户
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置电子账户类型 1、普通用户 2、债权(中转)用户 3、美利(借款)用户 4、红包账户 5、手续费账户 6、清算账户 7、散标公户 10、买单侠公户  11、微贷网公户  12、美利公户 13、急用钱公户
     *
     * @param accountType 电子账户类型 1、普通用户 2、债权(中转)用户 3、美利(借款)用户 4、红包账户 5、手续费账户 6、清算账户 7、散标公户 10、买单侠公户  11、微贷网公户  12、美利公户 13、急用钱公户
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取电子账户用途 00000 普通用户  10000 红包账户 01000 手续费账户 00100 担保账户
     *
     * @return acctuse - 电子账户用途 00000 普通用户  10000 红包账户 01000 手续费账户 00100 担保账户
     */
    public String getAcctuse() {
        return acctuse;
    }

    /**
     * 设置电子账户用途 00000 普通用户  10000 红包账户 01000 手续费账户 00100 担保账户
     *
     * @param acctuse 电子账户用途 00000 普通用户  10000 红包账户 01000 手续费账户 00100 担保账户
     */
    public void setAcctuse(String acctuse) {
        this.acctuse = acctuse;
    }

    /**
     * 获取密码设置状态 1、已设置 0/其他 、未设置
     *
     * @return pdset_status - 密码设置状态 1、已设置 0/其他 、未设置
     */
    public Integer getPdsetStatus() {
        return pdsetStatus;
    }

    /**
     * 设置密码设置状态 1、已设置 0/其他 、未设置
     *
     * @param pdsetStatus 密码设置状态 1、已设置 0/其他 、未设置
     */
    public void setPdsetStatus(Integer pdsetStatus) {
        this.pdsetStatus = pdsetStatus;
    }

    /**
     * 获取投标签约 1、已签约  0/其他、未签约
     *
     * @return bidauth - 投标签约 1、已签约  0/其他、未签约
     */
    public Integer getBidauth() {
        return bidauth;
    }

    /**
     * 设置投标签约 1、已签约  0/其他、未签约
     *
     * @param bidauth 投标签约 1、已签约  0/其他、未签约
     */
    public void setBidauth(Integer bidauth) {
        this.bidauth = bidauth;
    }

    /**
     * 获取债权签约 1、已签约 0/其他 、未签约
     *
     * @return investauth - 债权签约 1、已签约 0/其他 、未签约
     */
    public Integer getInvestauth() {
        return investauth;
    }

    /**
     * 设置债权签约 1、已签约 0/其他 、未签约
     *
     * @param investauth 债权签约 1、已签约 0/其他 、未签约
     */
    public void setInvestauth(Integer investauth) {
        this.investauth = investauth;
    }

    /**
     * 获取投标签约订单号
     *
     * @return bidorderid - 投标签约订单号
     */
    public String getBidorderid() {
        return bidorderid;
    }

    /**
     * 设置投标签约订单号
     *
     * @param bidorderid 投标签约订单号
     */
    public void setBidorderid(String bidorderid) {
        this.bidorderid = bidorderid;
    }

    /**
     * 获取债权签约订单号
     *
     * @return investorderid - 债权签约订单号
     */
    public String getInvestorderid() {
        return investorderid;
    }

    /**
     * 设置债权签约订单号
     *
     * @param investorderid 债权签约订单号
     */
    public void setInvestorderid(String investorderid) {
        this.investorderid = investorderid;
    }

    /**
     * @return account
     */
    public Integer getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(Integer account) {
        this.account = account;
    }

    /**
     * 获取是否是迁移用户  1、迁移用户 
     *
     * @return tfstate - 是否是迁移用户  1、迁移用户 
     */
    public Integer getTfstate() {
        return tfstate;
    }

    /**
     * 设置是否是迁移用户  1、迁移用户 
     *
     * @param tfstate 是否是迁移用户  1、迁移用户 
     */
    public void setTfstate(Integer tfstate) {
        this.tfstate = tfstate;
    }

    /**
     * 获取迁移处理 1、已写入批量开户文件表 2、已处理批量开户结果文件 3、已写入债权关系处理表 4、已处理债权关系 5、投资总额资产处理 6、已处理完投资总额 7、资产总额处理 
     *
     * @return tfdeal - 迁移处理 1、已写入批量开户文件表 2、已处理批量开户结果文件 3、已写入债权关系处理表 4、已处理债权关系 5、投资总额资产处理 6、已处理完投资总额 7、资产总额处理 
     */
    public Integer getTfdeal() {
        return tfdeal;
    }

    /**
     * 设置迁移处理 1、已写入批量开户文件表 2、已处理批量开户结果文件 3、已写入债权关系处理表 4、已处理债权关系 5、投资总额资产处理 6、已处理完投资总额 7、资产总额处理 
     *
     * @param tfdeal 迁移处理 1、已写入批量开户文件表 2、已处理批量开户结果文件 3、已写入债权关系处理表 4、已处理债权关系 5、投资总额资产处理 6、已处理完投资总额 7、资产总额处理 
     */
    public void setTfdeal(Integer tfdeal) {
        this.tfdeal = tfdeal;
    }

    /**
     * 获取签约关系迁移：0、未处理余额  1、签约后处理  2、余额处理成功
     *
     * @return signed - 签约关系迁移：0、未处理余额  1、签约后处理  2、余额处理成功
     */
    public Integer getSigned() {
        return signed;
    }

    /**
     * 设置签约关系迁移：0、未处理余额  1、签约后处理  2、余额处理成功
     *
     * @param signed 签约关系迁移：0、未处理余额  1、签约后处理  2、余额处理成功
     */
    public void setSigned(Integer signed) {
        this.signed = signed;
    }

    /**
     * 获取用户渠道类型 0、线上注册 1、线下推广
     *
     * @return channels - 用户渠道类型 0、线上注册 1、线下推广
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * 设置用户渠道类型 0、线上注册 1、线下推广
     *
     * @param channels 用户渠道类型 0、线上注册 1、线下推广
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }
}