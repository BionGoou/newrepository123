package com.awe.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {

    private String name;

    private Integer age;

    private Boolean isHappy;

    private Date brith;

    private Map<String,Object> map;

    private List<Object> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getHappy() {
        return isHappy;
    }

    public void setHappy(Boolean happy) {
        isHappy = happy;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHappy=" + isHappy +
                ", brith=" + brith +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
