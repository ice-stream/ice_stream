package com.ice.service.impl;

import com.ice.dao.DeptDao;
import com.ice.entities.Dept;
import com.ice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/17.
 */
@Service
public class DeptServiceImpl  implements DeptService
{
     @Autowired
      private DeptDao dao;




    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
