package com.sun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: suntaozhang
 * @create: 2019-07-26
 * @since 0.0.1
 **/
@RefreshScope
@RestController
public class Refresh {

  @Value("${properties.name}")
  private String name;

  @GetMapping("/refresh")
  public String testRefresh(){
    return "refresh:" + name;
  }
}
