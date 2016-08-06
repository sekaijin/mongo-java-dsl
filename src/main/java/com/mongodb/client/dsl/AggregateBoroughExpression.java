package com.mongodb.client.dsl;

public class AggregateBoroughExpression extends AggregateExpression {

	private AggregateBoroughExpression() {
		super();
		this.key = "$borough";
	}

	static AggregateBoroughExpression instenciate() {
		return new AggregateBoroughExpression();
	}

}
