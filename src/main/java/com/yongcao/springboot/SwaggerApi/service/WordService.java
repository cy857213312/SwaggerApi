package com.yongcao.springboot.SwaggerApi.service;


import com.yongcao.springboot.SwaggerApi.entity.Table;

import java.util.List;

public interface WordService {
    public List<Table> tableList(String jsonUrl);
}
