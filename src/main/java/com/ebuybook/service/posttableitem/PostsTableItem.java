package com.ebuybook.service.posttableitem;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.ebuybook.service.EBuyAWSCredentials;
import com.ebuybook.service.Metadata;
import com.ebuybook.service.Paragraph;
import com.ebuybook.service.Publication;

@DynamoDBTable(tableName = "Posts")
public class PostsTableItem
{
   @DynamoDBHashKey(attributeName = "postid")
   public String postid  =  "post10";

   @DynamoDBAttribute(attributeName = "id")
    String id = "null";

   @DynamoDBAttribute(attributeName = "title")
   String title  = "null";

   @DynamoDBAttribute(attributeName = "subtitle")
   String subtitle = "null";

   @DynamoDBAttribute(attributeName = "url")
   String url= null;

   @DynamoDBAttribute(attributeName = "publication")
   Publication  publication = new Publication();

   @DynamoDBAttribute(attributeName = "metadata")
   Metadata  metadata =  new Metadata();


   @DynamoDBAttribute(attributeName = "paragraphs")
   List<Paragraph> paragraphs = new ArrayList<Paragraph>();


public String getPostid() {
	return postid;
}


public void setPostid(String postid) {
	this.postid = postid;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getSubtitle() {
	return subtitle;
}


public void setSubtitle(String subtitle) {
	this.subtitle = subtitle;
}


public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}


public Publication getPublication() {
	return publication;
}


public void setPublication(Publication publication) {
	this.publication = publication;
}


public Metadata getMetadata() {
	return metadata;
}


public void setMetadata(Metadata metadata) {
	this.metadata = metadata;
}


public List<Paragraph> getParagraphs() {
	return paragraphs;
}


public void setParagraphs(List<Paragraph> paragraphs) {
	this.paragraphs = paragraphs;
}


}








