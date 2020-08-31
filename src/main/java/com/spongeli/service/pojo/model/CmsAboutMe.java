package com.spongeli.service.pojo.model;

import java.io.Serializable;
import java.util.Date;

public class CmsAboutMe implements Serializable {
    private Integer id;

    private String mainIntro;

    private String secondIntro;

    private String company;

    private String email;

    private String phone;

    private String fax;

    private String address;

    private String wechatOfficial;

    private String logo;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    private String detailIntro;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainIntro() {
        return mainIntro;
    }

    public void setMainIntro(String mainIntro) {
        this.mainIntro = mainIntro == null ? null : mainIntro.trim();
    }

    public String getSecondIntro() {
        return secondIntro;
    }

    public void setSecondIntro(String secondIntro) {
        this.secondIntro = secondIntro == null ? null : secondIntro.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWechatOfficial() {
        return wechatOfficial;
    }

    public void setWechatOfficial(String wechatOfficial) {
        this.wechatOfficial = wechatOfficial == null ? null : wechatOfficial.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDetailIntro() {
        return detailIntro;
    }

    public void setDetailIntro(String detailIntro) {
        this.detailIntro = detailIntro == null ? null : detailIntro.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mainIntro=").append(mainIntro);
        sb.append(", secondIntro=").append(secondIntro);
        sb.append(", company=").append(company);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", address=").append(address);
        sb.append(", wechatOfficial=").append(wechatOfficial);
        sb.append(", logo=").append(logo);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", detailIntro=").append(detailIntro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}