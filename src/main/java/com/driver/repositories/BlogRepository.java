package com.driver.repositories;


import com.driver.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}