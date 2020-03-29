package com.liuc.service.pojo;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //通用 Mapper 警告信息:
    // <[EntityColumn{table=user, property='id', column='id', javaType=int, jdbcType=null,
    // typeHandler=null, id=true, identity=false, blob=false, generator='null', orderBy='null', insertable=true, updatable=true, order=DEFAULT}]>
    // 使用了基本类型，基本类型在动态 SQL 中由于存在默认值，因此任何时候都不等于 null，建议修改基本类型为对应的包装类型!
    @Column
    private int id;

    private String userName;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
