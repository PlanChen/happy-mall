package cn.happymall.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Created by chenlili on 18/7/17.
 * Redisson注入
 */
@Configuration
@ComponentScan
@EnableCaching
public class RedissonConfig {

    @Bean(destroyMethod="shutdown")
    public RedissonClient redisson() throws IOException {
        return Redisson.create(Config.fromYAML(new ClassPathResource("redisson-conf.yml").getInputStream()));
    }

}
