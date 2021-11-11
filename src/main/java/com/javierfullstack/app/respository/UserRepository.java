package com.javierfullstack.app.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javierfullstack.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
