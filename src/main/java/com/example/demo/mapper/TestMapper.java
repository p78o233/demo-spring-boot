package com.example.demo.mapper;/*
 * @author p78o2
 * @date 2019/10/17
 */

import com.example.demo.entity.po.Test;
import com.example.demo.entity.vo.Money;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    @Select("select * from test")
    List<Test> getAllTest();

//    #{} 代表默认在字符两端加上''   #{id}  这个要和  param 里面的名字一致
    @Select("select * from test where id = #{id}")
    List<Test> getTestEquals(@Param("id")int id);

//    ${} 代表的意思是原样插入，但是这个会容易sql注入，所以除了like别的地方别用
    @Select("select * from test where name like '%${name}%'")
    List<Test> getTestLike(@Param("name")String name);

//    因为id在数据库里面设计了自增所以插入时不需要id字段，然后可以直接用对象和get 方法当作传入参数
//    insert update delete 操作成功之后都会返回一个数字 这个数字就是成功操作了多少行
    @Insert("insert into test (name) values (#{t.name})")
    int insertTest(@Param("t")Test test);

    @Update("update test set name = #{t.name} where id = #{t.id}")
    int updateTest(@Param("t")Test test);

//    这个是物理删除
    @Delete("delete from test where id = #{id}")
    int deleteTest(@Param("id")int id);

    @Select("select * from money")
    List<Money> getMoney();
}
