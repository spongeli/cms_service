package com.spongeli.service.pojo.model;

import java.io.Serializable;
import java.util.Date;

public class CmsScaningHistroy implements Serializable {
    private Integer id;

    private String ip;

    private String source;

    private String province;

    private String city;

    private Date scaningTime;

    private String scaningTitle;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getScaningTime() {
        return scaningTime;
    }

    public void setScaningTime(Date scaningTime) {
        this.scaningTime = scaningTime;
    }

    public String getScaningTitle() {
        return scaningTitle;
    }

    public void setScaningTitle(String scaningTitle) {
        this.scaningTitle = scaningTitle == null ? null : scaningTitle.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ip=").append(ip);
        sb.append(", source=").append(source);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", scaningTime=").append(scaningTime);
        sb.append(", scaningTitle=").append(scaningTitle);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}