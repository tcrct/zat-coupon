package com.zat.coupon.dto;

public class UserDto implements java.io.Serializable {

    private String name;

    public UserDto() {
    }

    public UserDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
