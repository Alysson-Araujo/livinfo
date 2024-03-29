package com.livinfo.backendlivinfo.repositories;


import com.livinfo.backendlivinfo.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
