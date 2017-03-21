package com.suneee.repository;

import com.suneee.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/3/17.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
