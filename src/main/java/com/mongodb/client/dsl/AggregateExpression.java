package com.mongodb.client.dsl;

import org.bson.Document;

public class AggregateExpression {
	
	Document document = null;
	String key = null;
	
	public AggregateExpression() {
		super();
	}

	Document getDocument() {
		return document;
	}

	String getKey() {
		return key;
	}

	public String toJson() {
		return (null==document)?"null":document.toJson();
	}
	
	public static AggregateSumExpression sum() {
		return AggregateSumExpression.instenciate();
	}

	public static AggregateSumExpression sum(String name) {
		return AggregateSumExpression.instenciate(name);
	}

	public static AggregateGroupExpression group(AggregateExpression expression) {
		return AggregateGroupExpression.instenciate(expression);
	}

	public static AggregateBoroughExpression borough() {
		return AggregateBoroughExpression.instenciate();
	}
}