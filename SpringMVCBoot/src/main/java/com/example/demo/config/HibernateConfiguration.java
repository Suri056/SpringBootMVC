package com.example.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class HibernateConfiguration {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setAnnotatedPackages("com.example.demo");
		factoryBean.setPackagesToScan("com.example.demo");
		Properties hibernateProperties  = new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		hibernateProperties.put("hibernate.show_sql", "true");
		factoryBean.setHibernateProperties(hibernateProperties);
		return factoryBean;
	}
	
	
}
