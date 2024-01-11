package org.example.springbootmybaistcrud;

import org.example.springbootmybaistcrud.mapper.EmpMapper;
import org.example.springbootmybaistcrud.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class SpringbootMybaistCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void deleteTest() {
        empMapper.delete(17);
    }

    //新增员工
    @Test
    public void testInsert(){
        //构造员工对象
        Emp emp = new Emp();
        emp.setUsername("Tom3");
        emp.setName("汤姆3");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行新增员工信息操作
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate2(){
        //要修改的员工信息
        Emp emp = new Emp();
        emp.setId(2);
        emp.setUsername("Tom111");
        emp.setName("汤姆111");

        emp.setUpdateTime(LocalDateTime.now());

        //调用方法，修改员工数据
        empMapper.update(emp);
    }
}
