package com.dc.cn.service;

import com.dc.cn.dao.NewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wenxye on 2017/8/22.
 */
@Service
public class NewsService
{
    @Autowired
    private NewsDAO newsdao;

    public List showNewsService(String company,String type){
        return newsdao.searchNews(company,type);
    }
}
