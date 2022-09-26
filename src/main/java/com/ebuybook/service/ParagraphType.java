package com.ebuybook.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public enum  ParagraphType {
   Title,
   Caption,
   Header,
   Subhead,
   Text,
   CodeBlock,
   Quote,
   Bullet,
}