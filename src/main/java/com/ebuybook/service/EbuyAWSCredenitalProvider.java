package com.ebuybook.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;



public class EbuyAWSCredenitalProvider implements AWSCredentialsProvider {

	@Override
	public AWSCredentials getCredentials() {
		// TODO Auto-generated method stub
		return new EBuyAWSCredentials();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
