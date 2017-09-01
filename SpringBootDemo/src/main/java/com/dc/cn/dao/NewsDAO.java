package com.dc.cn.dao;

import com.dc.cn.entity.News3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by wenxye on 2017/8/21.
 */
@Repository
public interface NewsDAO extends JpaRepository<News3,String>
{
    @Query("select t from News3 t where t.company= :company and t.type = :type")
    List searchNews(@Param("company") String company,@Param("type") String type);
}