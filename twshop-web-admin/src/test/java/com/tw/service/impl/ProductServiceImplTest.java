//package com.tw.twshop.service.impl;
//
//import Product;
//import ProductService;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//
//
///**
// * Created by tengw on 2017/5/21.
// */
////这是JUnit的注解，通过这个注解让SpringJUnit4ClassRunner这个类提供Spring测试上下文。
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@WebAppConfiguration
//public class ProductServiceImplTest {
//
//
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//@Autowired
//private ProductService productService;
//    @Test
//    public void findAll() throws Exception {
//        List<Product> list;
//        list = productService.findAll();
//        for (Product product:list)
//            System.out.print(product.getId());
//    }
//
//    @Test
//    public void insert() throws Exception {
//        Product product= new Product();
//        product.setPsn("psn");
////        product.setShowimg("showimg");
////        product.setProductname("tyui");
////        product.setAddtime(new Date());
////        product.setCategoryid((short)0);
////        product.setCostprice(new BigDecimal(0));
//        product.setDescription("tyui");
////        product.setDisplayorder((short)0);
////        product.setIsbest((byte)0);
////        product.setIshot((byte)0);
////        product.setIsnew((byte)0);
////        product.setIspromotion((byte)0);
////        product.setIsshowprice((byte)0);
////        product.setMarketprice(new BigDecimal(0));
////        product.setPromotionprice(new BigDecimal(0));
////        product.setReviewcount(0);
////        product.setSalecount(0);
//        product.setState((byte)0);
////        product.setStockcount(0);
////        product.setUpdatetime(new Date());
////        product.setVisitcount(0);
//
//        productService.insert(product);
//    }
//}