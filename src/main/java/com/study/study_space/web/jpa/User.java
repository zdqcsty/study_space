package com.study.study_space.web.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
public class User {

    @Id // 添加一个空的id标识，因为jpa在映射实体是需要一个id，这个必须
    @Column(name = "name")
    String name;

    @Column(name = "age")
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
