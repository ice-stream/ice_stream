package com.ice.service;



import com.ice.entities.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/7/17.
 */

public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();


}
