package com.ebuybook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.amazonaws.auth.AWSCredentials;

@Component
@PropertySource("classpath:application.properties")
public class EBuyAWSCredentials implements AWSCredentials{
	@Autowired
    Environment env;

	@Override
	public String getAWSAccessKeyId() {
		// TODO Auto-generated method stub
		  System.out.println("@Ramesh acess key" + env.getProperty("aws_access_key") );
		return env.getProperty("aws_access_key");
	}

	@Override
	public String getAWSSecretKey() {
		// TODO Auto-generated method stub
	return env.getProperty("aws_secret_key");
	}

}

