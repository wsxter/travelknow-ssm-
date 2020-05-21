package cn.wsxter.dao;

import cn.wsxter.domain.Customer;

import java.util.HashMap;
import java.util.List;

//操作数据库中User表中的类
public interface  UserDao {
    //输入用户名密码，查找，返回一个符合条件的用户
    //Customer findUserByUsernameAndPassword(String username, String password);
    //添加用户
   void addUser(Customer customer);

   Customer finduser(Customer customer);

    //根据用户名找用户并返回
    //Customer findbyUsername(String username);
    //根据用户id查找用户并返回
    //Customer findbuUserid(int userid);

    //根据用户id，返回其用户名
   // String findbyUserid(int user_id);

    //查询用户个数
   int findTotalCount();

    //limit 查找，传入开始页码star  和 size大小
    List<Customer> findByPage(HashMap map);

    //删除用户
    void deluser(int user_id);

    //设置用户状态status为1
    void gooduser(int user_id);

    //更新用户
    void update(Customer customer);
}
