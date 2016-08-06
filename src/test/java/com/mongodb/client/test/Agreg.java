package com.mongodb.client.test;

import static com.mongodb.client.dsl.AggregateExpression.*;

import org.bson.Document;
import org.junit.Test;

import com.mongodb.client.dsl.AggregateExpression;

public class Agreg {
	

	@Test
	public void agregTest() {
		AggregateExpression g = group(borough()).add("count", sum());
		System.out.println(g.toJson());
		
		Document document = new Document("$group", new Document("_id", "$borough").append("count", new Document("$sum", 1)));
		System.err.println(document.toJson());
	}
}
