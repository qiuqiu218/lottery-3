package com.github.chengbin.auth.reflect;

/**
 * @author zhangcb
 * @created 2018-02-02 16:39.
 */
public class User {

    private Long id;

    private String name;


    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
