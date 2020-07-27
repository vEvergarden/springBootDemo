//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.ldap.core.LdapTemplate;
//import org.springframework.ldap.core.support.LdapContextSource;
//
//@Configuration
//public class ldapConfirguration {
//
//    @Value("${spring.ldap.url}")
//    private String ldapUrl;
//
//    @Value("${spring.ldap.base}")
//    private String ldapBase;
//
//    @Value("${spring.ldap.userName}")
//    private  String ldapUserName;
//
//    @Value("${spring.ldap.password}")
//    private String ldapPassWord;
//
//    private String ldapReferral = "follow";
//
//
//    @Bean
//    public LdapTemplate ldapTemplate(){
//        return new LdapTemplate(contextSourceTarget());
//    }
//
//    @Bean
//    public LdapContextSource contextSourceTarget(){
//        LdapContextSource ldapContextSource = new LdapContextSource();
//
//        ldapContextSource.setUrl(ldapUrl);
//        ldapContextSource.setBase(ldapBase);
//        ldapContextSource.setUserDn(ldapUserName);
//        ldapContextSource.setPassword(ldapPassWord);
//        ldapContextSource.setReferral(ldapReferral);
//
//        return ldapContextSource;
//
//    }
//
//}
