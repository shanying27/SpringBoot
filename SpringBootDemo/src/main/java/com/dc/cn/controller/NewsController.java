package com.dc.cn.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.dc.cn.service.NewsService;
import net.sf.json.JsonConfig;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wenxye on 2017/8/22.
 */
@RestController
@RequestMapping("/dc")
public class NewsController
{
    @Autowired
    private NewsService newsservice;
    @RequestMapping("/main")
    public void getNewController(HttpServletRequest req,HttpServletResponse rep){
        String company = req.getParameter("name");
        String type = req.getParameter("type");
        List  list = newsservice.showNewsService(company, type);
        JsonConfig jc = new JsonConfig();
        jc.setExcludes(new String[]{"content","createdate","type","link","dept","content_big","firstpic_big","newtype","modifier","company","modifydate","contenttype"});
        JSONArray s = JSONArray.fromObject(list,jc);
        Map<String,Object> map = new HashMap();
        if(list.size()>0){
            map.put("success",true);
        }else{
            map.put("success",false);
        }

        map.put("data", s);
        String jsonresult = JSON.toJSONString(map);

        PrintWriter p = null;
        try {

            rep.setCharacterEncoding("UTF-8");
            rep.setContentType("text/html");
            p = rep.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.write(jsonresult);
        p.close();
    }
}
