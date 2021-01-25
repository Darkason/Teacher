package com.day15;

import java.math.BigDecimal;

/**
 * @auth admin
 * @date 2021/1/21
 * @Description
 */
public class Emp {

    private Integer id;
    // e_name
    // hello_world  helloWorld
    private String eName;
    private String job;
    private BigDecimal sal;

    public Emp() {
    }

    public Emp(Integer id, String eName, String job, BigDecimal sal) {
        this.id = id;
        this.eName = eName;
        this.job = job;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
