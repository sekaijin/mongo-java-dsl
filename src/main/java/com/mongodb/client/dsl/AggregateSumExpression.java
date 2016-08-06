package com.mongodb.client.dsl;

import org.bson.Document;

public class AggregateSumExpression extends AggregateExpression {

	private AggregateSumExpression() {
		super();
		this.document = new Document();
		this.key = "$sum";
	}

	static AggregateSumExpression instenciate() {
		AggregateSumExpression expression = new AggregateSumExpression();
		expression.document.put(expression.getKey(), 1);
		return expression;
	}
	
	static AggregateSumExpression instenciate(String name) {
		AggregateSumExpression expression = new AggregateSumExpression();
		expression.document.put(expression.getKey(), name);
		return expression;
	}
	

}
