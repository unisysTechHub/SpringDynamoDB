package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Markup {
   @DynamoDBAttribute(attributeName = "type")
   String type = null;

   @DynamoDBAttribute(attributeName = "start")
   String start = null;

   @DynamoDBAttribute(attributeName = "end")
   String end = null;

   @DynamoDBAttribute(attributeName = "href")
   String href = null;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getStart() {
	return start;
}

public void setStart(String start) {
	this.start = start;
}

public String getEnd() {
	return end;
}

public void setEnd(String end) {
	this.end = end;
}

public String getHref() {
	return href;
}

public void setHref(String href) {
	this.href = href;
}
   
}