package com.management.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("班级信息")
public class Classes {

    @ApiModelProperty("班级ID")
    private Integer id;

    @ApiModelProperty("班级名")
    private String name;

    @ApiModelProperty("专业")
    private String major;

    /**
     * 班级人数
     */
    @ApiModelProperty("班级人数")
    private Integer num;

    @ApiModelProperty("入学年份")
    private Integer year;

    @ApiModelProperty("辅导员")
    private String counsellor;

    /**
     * 班级编号
     */
    @ApiModelProperty("班级编号")
    private String classId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", num=" + num +
                ", year=" + year +
                ", counsellor='" + counsellor + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
