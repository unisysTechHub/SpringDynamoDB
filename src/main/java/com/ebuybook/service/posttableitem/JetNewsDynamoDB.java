package com.ebuybook.service.posttableitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.ebuybook.service.EBuyAWSCredentials;

@Service
@ComponentScan()
public
class JetNewsDynamoDB {
   private AmazonDynamoDB client = null;

   @Autowired
    EBuyAWSCredentials eBuyAWSCredentials;
   void configureDynamoDBClient( )
   {
	   System.out.println("@Ramesh configure DynamoDb client");
       client =new  AmazonDynamoDBClient(eBuyAWSCredentials);
       

   }

   @SuppressWarnings("deprecation")
private AmazonDynamoDBClient getClient() {
	   if (client == null) {
		   configureDynamoDBClient();
	   }
	   client.setRegion(Region.getRegion(Regions.US_EAST_1));
	   return (AmazonDynamoDBClient) client;
   }
   

   DynamoDBMapper mapper() { 
    	  return new DynamoDBMapper(getClient());

    	}

   public List<PostsTableItem> getTableItem(  Class<PostsTableItem> tableItem, String value  ) 
   {
	   PostsTableItem tableItemIstance;
	   System.out.println("@Ramesh" + tableItem.getTypeParameters().length);
	   DynamoDBQueryExpression<PostsTableItem> queryExpression = null;
	try {
		tableItemIstance = tableItem.newInstance();
		tableItemIstance.postid = value;
	        queryExpression = new DynamoDBQueryExpression<PostsTableItem>();
	       queryExpression.withHashKeyValues(tableItemIstance);
	      // System.out.println("@Ramesh" "afterHash key");
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 	       return mapper().query(PostsTableItem.class,queryExpression);

       

   }

    void saveTableItem( PostsTableItem  tableItem)
   {
           mapper().save(tableItem);
   }

}

//fun markupsDB(markups : List<com.example.jetnewsreproduce.model.Markup>) :List<Markup>
//
//       =    List(markups.size){Markup().apply{this.type = markups[it].type.name
//                                              this.start =markups[it].start
//                                              this.end  = markups[it].end
//                                              this.href =  markups[it].href}}
//
//fun loadJetNewsPostsTable(posts : List<Post>)
//{   val count : AtomicInteger = AtomicInteger(0)
//   posts.forEach { post ->
//
//         val postsTableItem = PostsTableItem()
//           postsTableItem.postid = "post" +  count.incrementAndGet()
//           postsTableItem.id = post.id
//           val postAuthor = PostAuthor().apply{this.name =post.metadata.author.name
//                                           url = post.metadata.author.url}
//           val metadata = Metadata().apply { this.author =postAuthor
//                                             this.date = post.metadata.date
//                                             this.readTimeMinutes = post.metadata.readTimeMinutes
//                                           }
//           postsTableItem.metadata = metadata
//           postsTableItem.paragraphs = List<Paragraph>(post.paragraphs.size){
//               val markups = markupsDB(post.paragraphs[it].markups)
//               Paragraph().apply {  type = post.paragraphs[it].type.name
//
//                   text = post.paragraphs[it].text
//                   this.markups = markups}
//
//           }
//
//           postsTableItem.publication = Publication().apply{this.name = post.publication!!.name
//                                                           logoUrl =post.publication.logoUrl}
//           postsTableItem.title = post.title
//           postsTableItem.subtitle = post.subtitle
//           postsTableItem.url = post.url
//           GlobalScope.async { JetNewsDynamoDB.saveTableItem(postsTableItem) }
//     }
//}