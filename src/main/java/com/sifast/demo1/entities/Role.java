package com.sifast.demo1.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private Long idRole;

    private String roleName;

    private Boolean actived;

    public Role(String roleName, Boolean actived) {
        super();
        this.roleName = roleName;
        this.actived = actived;
    }

    public Role() {
        super();
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getActived() {
        return actived;
    }

    public void setActived(Boolean actived) {
        this.actived = actived;
    }

}
