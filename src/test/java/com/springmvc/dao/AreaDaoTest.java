package com.springmvc.dao;

import com.springmvc.BaseTest;
import com.springmvc.entity.Area;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areas = areaDao.queryArea();
        if (areas != null) {
            for (Area area : areas) {
                System.out.println(area.getAreaId() + "\t" + area.getAreaName() + "\t" + area.getPriority() + "\t" + area.getCreateTime());
            }
        }
    }
}
