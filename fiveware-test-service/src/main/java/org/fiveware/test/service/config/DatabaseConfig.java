package org.fiveware.test.service.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan({ "org.fiveware.test.model" })
@EnableJpaRepositories(basePackages = "org.fiveware.test.service.repository")
public class DatabaseConfig {
	
	@Inject
	private Environment env;

	@Primary
	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName(this.env.getProperty("database.driverClassName"));

		ds.setUrl(this.env.getProperty("database.url"));

		ds.setUsername(this.env.getProperty("database.username"));

		ds.setPassword(this.env.getProperty("database.password"));

		return ds;
	}
}
