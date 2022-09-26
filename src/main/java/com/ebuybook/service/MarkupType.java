package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public enum  MarkupType {
   Link,
   Code,
   Italic,
   Bold,
}