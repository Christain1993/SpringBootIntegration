package com.bus365.test;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.bus365.root.RootController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RootController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class MonsterlanApplicationTests {
   @Autowired
   DataSourceProperties dataSourceProperties;

   @Autowired
   ApplicationContext applicationContext;

   @Test
   public void contextLoads() {
      // 获取配置的数据源
      DataSource dataSource = applicationContext.getBean(DataSource.class);
      // 查看配置数据源信息
      System.out.println(dataSource);
      System.out.println(dataSource.getClass().getName());
      System.out.println(dataSourceProperties);
      //执行SQL,输出查到的数据
      JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
      List<?> resultList = jdbcTemplate.queryForList("select * from user");
      System.out.println("===>>>>>>>>>>>" + resultList.toString());
   }
}
