package com.tensquare.manager.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/*
 * @Description: ManagerFilter
 * @Author: Mr. Jf
 * @Time: 2020/4/16 13:07
 */
@Component
public class ManagerFilter extends ZuulFilter {
  @Override
  public String filterType() {
    return "pre";
  }
  
  @Override
  public int filterOrder() {
    return 0;
  }
  
  @Override
  public boolean shouldFilter() {
    return true;
  }
  
  @Override
  public Object run() throws ZuulException {
    System.out.println("Zuul filter...");
    return null;
  }
}
