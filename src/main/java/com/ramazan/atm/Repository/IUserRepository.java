package com.ramazan.atm.Repository;


import com.ramazan.atm.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
