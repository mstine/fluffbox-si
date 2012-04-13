package com.fluffbox.si.transformer;

import com.fluffbox.si.model.Transaction;

public class TransactionToCsvTransformer {

	public String transform(Transaction transaction) {
		StringBuilder builder = new StringBuilder();
		return builder.append(transaction.getCustomerId())
				.append(",")
				.append(transaction.getAccountNumber())
				.append(",")
				.append(transaction.getSpeakerId())
				.append(",")
				.append(transaction.getKioskId())
				.append(",")
				.append(transaction.getDate())
				.append(",")
				.append(transaction.getAmount())
				.toString();
	}
	
}
