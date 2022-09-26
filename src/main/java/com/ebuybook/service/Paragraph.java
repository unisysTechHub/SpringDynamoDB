package com.ebuybook.service;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Paragraph {
   @DynamoDBAttribute(attributeName = "type")
   String type = null;

   @DynamoDBAttribute(attributeName = "text")
   String text = null;

//   @DynamoDBAttribute(attributeName = "markups")
//   List<Markup>  markups = new ArrayList<Markup>();

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

//public List<Markup> getMarkups() {
//	return markups;
//}
//
//public void setMarkups(List<Markup> markups) {
//	this.markups = markups;
//}
   
}
