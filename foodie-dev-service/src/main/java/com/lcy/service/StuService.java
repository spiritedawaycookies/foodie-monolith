package com.lcy.service;

import com.lcy.pojo.Stu;

public interface StuService {

    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

    public void saveParent();
    public void saveChildren();
}
