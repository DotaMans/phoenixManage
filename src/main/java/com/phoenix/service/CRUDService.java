package com.phoenix.service;

import com.phoenix.vo.Result;

import java.util.List;
import java.util.Map;

/**
 * Created by cgt on 17-12-7.
 */
public interface CRUDService {

    Result add(String sql);

    Result update(String sql);

    Result delete(String sql);


    List<Map<String, Object>> query(String sql);

}
