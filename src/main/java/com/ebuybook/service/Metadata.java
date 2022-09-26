package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Metadata {
   @DynamoDBAttribute(attributeName = "author")
   String author= null;

   @DynamoDBAttribute(attributeName = "date")
   String date = null;

   @DynamoDBAttribute(attributeName = "readTimeMinutes")
   String readTimeMinutes = null;

}
