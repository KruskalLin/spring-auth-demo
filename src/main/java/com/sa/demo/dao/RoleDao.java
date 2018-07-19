package com.sa.demo.dao;

import com.sa.demo.entity.Role;
import com.sa.demo.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * All rights Reserved, Designed by Popping Lim
 *
 * @Author: Popping Lim
 * @Date: 2018/7/9
 * @Todo:
 */
@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}