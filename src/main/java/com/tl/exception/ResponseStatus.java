package com.tl.exception;

public enum ResponseStatus {

    /**
     *
     *  根据条件获取不记录 ，提示为 xxx获取失败，例如：用户获取失败，主播获取失败 等等
     *  不要提示为 xxx不存在
     *
     */
    success(100001,"success"),

    /**
     * token相关异常以101xxx开头
     */
    tokenValid(101001,"token已失效"),
    tokenEmpty(101011,"token传递为空"),

    /**
     * 自定义异常枚举以2xxxxx开头
     */
    commError(200002,"系统内部异常"),
    giftCacheError(200003,"礼物缓存异常"),
    userNotExitError(200005,"用户获取失败"),
    anchorNotExitError(200006,"主播获取失败"),
    noStreamProviderError(200007,"推流服务暂不可用"),
    systemParameterError(200008,"系统配置项目缺失"),
    anchorLiveInfoNotExitError(200009,"直播间获取失败"),
    phoneIsExist(200010,"手机号已存在"),
    methodIsNotExist(200011,"找不到对应的业务方法"),
    netEaseInterfaceError(200012,"网易接口异常"),
    bannerIsNotExist(200013,"banner信息获取失败"),
    anchorAuthorBlocking(200014,"您的主播权限已被冻结"),
    labelIsEmpty(200015,"标签为空"),
    labelIsForbidden(200016,"标签被禁用"),
    ApiInvalid(200017,"API已失效"),
    identityCardIsExist(200018,"身份证号已存在"),
    validCodeError(200019,"手机验证码验证失败"),
    authRepetition(200020,"该主播已经认证，无需重复认证"),
    auditNotExist(200021,"审核信息不存在或已经审核通过"),
    notStartToBroadcast(200022,"因管理员设置限制，您暂无法开播"),
    kickedOut(200023,"您已经被踢出"),
    heraldFrequently(200024,"您最近有预告通过审核，请稍候再试"),
    liveManagerCountExceed(200025,"房管人数已达上限"),
    syncUserInfo2LiveModule(200026,"用户信息拉取失败，请重新登录拉取最新信息！"),
    guardIsEmpty(200027,"守护获取失败"),
    guardIsVerify(200028,"守护资源正在更新,请稍后重试"),
    isOpenWeekGuardError(200029,"您已开通过周体验"),
    isOpenGuardRuleError(200030,"操作失败，您当前守护类型不兼容此守护类型");





    public int code;
    public String msg;

    ResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

