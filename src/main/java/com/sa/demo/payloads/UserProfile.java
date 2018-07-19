package com.sa.demo.payloads;

import java.time.Instant;

/**
 * All rights Reserved, Designed by Popping Lim
 *
 * @Author: Popping Lim
 * @Date: 2018/7/10
 * @Todo:
 */
public class UserProfile {
    private Long id;
    private String username;
    private Instant joinedAt;


    public UserProfile(Long id, String username, Instant joinedAt) {
        this.id = id;
        this.username = username;
        this.joinedAt = joinedAt;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }
}
