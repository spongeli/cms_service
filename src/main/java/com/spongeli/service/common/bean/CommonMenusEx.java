package com.spongeli.service.common.bean;

import java.util.List;

/**
 * @Description
 * @Author spongeli
 * @Date 2020/1/2 10:14
 **/
public class CommonMenusEx {
    private List<CommonMenusEx> childrenList;

    public List<CommonMenusEx> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<CommonMenusEx> childrenList) {
        this.childrenList = childrenList;
    }
}
