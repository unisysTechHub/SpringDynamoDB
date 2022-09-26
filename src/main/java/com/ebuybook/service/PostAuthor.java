package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class PostAuthor {
   @DynamoDBAttribute(attributeName = "name")
   String name = null;

   @DynamoDBAttribute(attributeName = "url")
   String url = null;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}
   
}
