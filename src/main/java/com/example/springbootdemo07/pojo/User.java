package com.example.springbootdemo07.pojo;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

/**
 * ClassName: User
 * Package: com.example.springbootdemo07
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */

public class User {

    @NotBlank(message = "姓名不允许为空！")
    @Length(min = 2,max = 10,message = "姓名长度错误，姓名长度2-10！")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Min(18)
    private int age;

    @NotBlank(message = "地址不能为空！")
    private String address;

    @Pattern(regexp = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$", message = "手机号格式错误")
    private String phone;
    @Email(message = "邮箱格式错误")
    private String email;

    // 省略get和set方法

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
