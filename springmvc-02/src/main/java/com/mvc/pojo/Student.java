package com.mvc.pojo;

/**
 * @author: 小强
 * @date: 2021/11/11 0011
 * @IDE: IntelliJ IDEA
 */
public class Student {
    private int stu_id;
    private String stu_name;
    private Banji banji;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Banji getBanji() {
        return banji;
    }

    public void setBanji(Banji banji) {
        this.banji = banji;
    }
}
