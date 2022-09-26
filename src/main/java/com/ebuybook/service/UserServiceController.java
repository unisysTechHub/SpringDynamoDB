package com.ebuybook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebuybook.service.posttableitem.JetNewsDynamoDB;
import com.ebuybook.service.posttableitem.PostsTableItem;
import com.ebuybook.service.posttableitem.TestAccessLevel;
@Controller
@ComponentScan("com.ebuybook.service.posttableitem")
public class UserServiceController {
	@Autowired
	JetNewsDynamoDB JetNewsService;

	@GetMapping("/{item}")
	@ResponseBody
	PostsTableItem getPostitem(@PathVariable String item) {
		
		List<PostsTableItem> itemList = JetNewsService.getTableItem(PostsTableItem.class, "post10");
		System.out.println("@Ramesh" + itemList.get(0).postid);
	
		return itemList.get(0);

	}

}
