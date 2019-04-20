package com.phoenix.service;

import com.phoenix.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CRUDServiceImp implements CRUDService {

    @Autowired
    @Qualifier("phoenixJdbcTemplate")
    JdbcTemplate phoenixJdbcTemplate;

    @Override
    public Result add(String insertSql) {

        phoenixJdbcTemplate.update(insertSql);

        return new Result(true,"数据添加成功");
    }

    @Override
    public Result update(String updateSql) {
        int res = phoenixJdbcTemplate.update(updateSql);
        return new Result(true,"数据更新成功");
    }

    @Override
    public Result delete(String deleteSql) {
        phoenixJdbcTemplate.update(deleteSql);
        return new Result(true,"数据删除成功");

    }

    @Override
    public List<Map<String, Object>> query(String selectSql) {
        return phoenixJdbcTemplate.queryForList(selectSql);
    }
}
