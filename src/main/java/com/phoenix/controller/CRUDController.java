package com.phoenix.controller;

import com.phoenix.service.CRUDService;
import com.phoenix.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage")
public class CRUDController {

    @Autowired
    private CRUDService crudService;

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(){
        String insertSql = "";
        return crudService.add(insertSql);
    }


    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(){
        String updateSql = "";
        return crudService.update(updateSql);
    }

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(){
        String deleteSql = "";
        return crudService.delete(deleteSql);
    }


    /**
     * 查询
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Object query(){
        String selectSql = "";
        return crudService.query(selectSql);
    }
}
