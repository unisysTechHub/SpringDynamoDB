package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Publication {
   @DynamoDBAttribute(attributeName = "name")
   String name  = null;

   @DynamoDBAttribute(attributeName = "logoUrl")
   String logoUrl = null;
}
