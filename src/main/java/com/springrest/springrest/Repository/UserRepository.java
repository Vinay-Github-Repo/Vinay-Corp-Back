package com.springrest.springrest.Repository;

import com.springrest.springrest.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    Users getByEmail(String email);
}
