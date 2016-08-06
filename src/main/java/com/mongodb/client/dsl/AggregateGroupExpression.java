package com.mongodb.client.dsl;

import org.bson.Document;

public class AggregateGroupExpression extends AggregateExpression {

	private Document group;
	
	private AggregateGroupExpression() {
		super();
		this.document = new Document();
		this.key = "$group";
	}

	static AggregateGroupExpression instenciate(AggregateExpression value) {
		AggregateGroupExpression expression = new AggregateGroupExpression();
		expression.group = new Document("_id", value.getKey());
		expression.document.put(expression.getKey(), expression.group);
		return expression;
	}
	
	public AggregateGroupExpression add(String key, AggregateExpression value) {
		this.group.put(key, value.getDocument());
		return this;		
	}
	

}
