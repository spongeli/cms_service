package com.spongeli.service.pojo.model;

import java.io.Serializable;
import java.util.Date;

public class CmsRecruit implements Serializable {
    private Integer id;

    private String positionName;

    private String sexRequire;

    private String ageRequire;

    private String salary;

    private String languageRequire;

    private Integer number;

    private String workAdderss;

    private Date validity;

    private String education;

    private String status;

    private String remark;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getSexRequire() {
        return sexRequire;
    }

    public void setSexRequire(String sexRequire) {
        this.sexRequire = sexRequire == null ? null : sexRequire.trim();
    }

    public String getAgeRequire() {
        return ageRequire;
    }

    public void setAgeRequire(String ageRequire) {
        this.ageRequire = ageRequire == null ? null : ageRequire.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getLanguageRequire() {
        return languageRequire;
    }

    public void setLanguageRequire(String languageRequire) {
        this.languageRequire = languageRequire == null ? null : languageRequire.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getWorkAdderss() {
        return workAdderss;
    }

    public void setWorkAdderss(String workAdderss) {
        this.workAdderss = workAdderss == null ? null : workAdderss.trim();
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", positionName=").append(positionName);
        sb.append(", sexRequire=").append(sexRequire);
        sb.append(", ageRequire=").append(ageRequire);
        sb.append(", salary=").append(salary);
        sb.append(", languageRequire=").append(languageRequire);
        sb.append(", number=").append(number);
        sb.append(", workAdderss=").append(workAdderss);
        sb.append(", validity=").append(validity);
        sb.append(", education=").append(education);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}