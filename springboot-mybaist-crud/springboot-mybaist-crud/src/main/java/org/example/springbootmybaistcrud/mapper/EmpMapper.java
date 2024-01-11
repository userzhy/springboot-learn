package org.example.springbootmybaistcrud.mapper;

import org.apache.ibatis.annotations.*;
import org.example.springbootmybaistcrud.pojo.Emp;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    //根据ID删除数据
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    //新增员工
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            " values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    public void update(Emp emp);
}