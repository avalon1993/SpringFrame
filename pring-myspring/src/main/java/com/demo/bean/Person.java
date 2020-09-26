package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements DisposableBean, InitializingBean, BeanFactoryAware, BeanNameAware {

    private String name;

    Person() {
        System.out.println("Constructor of person bean is invoked!1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method of person is invoked3");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName method of person is invoked2");
    }

    public void init() {
        System.out.println("custom init method of person bean is invoked!6");
    }

    //Bean initialization code  equals to
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method of person bean is invoked!5");
    }

    //Bean destruction code
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean Destroy method of person bean is invoked!8");
    }

    public void destroyMethod() {
        System.out.println("custom Destroy method of person bean is invoked!9");
    }

}