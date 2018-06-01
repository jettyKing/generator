package com.mybatis.generator.entitys;

import java.util.Date;

public class User {
    /**
     * 主键
     */
    private String id;

    /**
     * 微信端唯一ID
     */
    private String openId;

    /**
     * 微信昵称
     */
    private String nickName;

    /**
     * 真实用户名
     */
    private String realName;

    /**
     * 用户身份证号
     */
    private String idCard;

    /**
     * 用户年龄
     */
    private Long age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 微信头像
     */
    private String headImg;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 推荐人
     */
    private String recommend;

    /**
     * 邀请码
     */
    private String invitationCode;

    /**
     * 被邀请码
     */
    private String invitedCode;

    /**
     * 用户注册渠道（）
     */
    private String registerChannel;

    /**
     * 用户类型（0：普通；1：有车）
     */
    private String userType;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记(0:正常；1删除)
     */
    private String delFlag;

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 微信端唯一ID
     * @return open_id 微信端唯一ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信端唯一ID
     * @param openId 微信端唯一ID
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 微信昵称
     * @return nick_name 微信昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 微信昵称
     * @param nickName 微信昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 真实用户名
     * @return real_name 真实用户名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实用户名
     * @param realName 真实用户名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 用户身份证号
     * @return id_card 用户身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 用户身份证号
     * @param idCard 用户身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 用户年龄
     * @return age 用户年龄
     */
    public Long getAge() {
        return age;
    }

    /**
     * 用户年龄
     * @param age 用户年龄
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     * 性别
     * @return sex 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 微信头像
     * @return head_img 微信头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 微信头像
     * @param headImg 微信头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 推荐人
     * @return recommend 推荐人
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * 推荐人
     * @param recommend 推荐人
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    /**
     * 邀请码
     * @return invitation_code 邀请码
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * 邀请码
     * @param invitationCode 邀请码
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    /**
     * 被邀请码
     * @return invited_code 被邀请码
     */
    public String getInvitedCode() {
        return invitedCode;
    }

    /**
     * 被邀请码
     * @param invitedCode 被邀请码
     */
    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode == null ? null : invitedCode.trim();
    }

    /**
     * 用户注册渠道（）
     * @return register_channel 用户注册渠道（）
     */
    public String getRegisterChannel() {
        return registerChannel;
    }

    /**
     * 用户注册渠道（）
     * @param registerChannel 用户注册渠道（）
     */
    public void setRegisterChannel(String registerChannel) {
        this.registerChannel = registerChannel == null ? null : registerChannel.trim();
    }

    /**
     * 用户类型（0：普通；1：有车）
     * @return user_type 用户类型（0：普通；1：有车）
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型（0：普通；1：有车）
     * @param userType 用户类型（0：普通；1：有车）
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 用户状态
     * @return user_status 用户状态
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 用户状态
     * @param userStatus 用户状态
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * 创建者
     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     * @return update_by 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注信息
     * @return remarks 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注信息
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 删除标记(0:正常；1删除)
     * @return del_flag 删除标记(0:正常；1删除)
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记(0:正常；1删除)
     * @param delFlag 删除标记(0:正常；1删除)
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}