/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年3月3日 下午3:05:25
 * @version V1.0.0
 */
package com.mm.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
  * @ClassName: StockApplication
  * @Description: TODO
  * @author Meng1
  * @date 2020年3月3日 下午3:05:25
  *
  */
@SpringBootApplication
@MapperScan({"com.mm.stock.module.*.*.dao"})
@EnableDiscoveryClient
public class StockApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }
}
