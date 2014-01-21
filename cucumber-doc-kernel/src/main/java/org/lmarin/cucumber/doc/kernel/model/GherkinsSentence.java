package org.lmarin.cucumber.doc.kernel.model;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class GherkinsSentence implements Serializable {

	private static final long serialVersionUID = 1L;

	private String businessSentence;

	private GherkinsType type;

	public GherkinsSentence(String businessSentence, GherkinsType type) {
		super();
		if (type == null) {
			throw new IllegalArgumentException("type can't be null.");
		}
		if (StringUtils.isEmpty(businessSentence)) {
			throw new IllegalArgumentException("businessSentence can't be null.");
		}
		this.businessSentence = businessSentence;
		this.type = type;
	}

	public String getBusinessSentence() {
		return businessSentence;
	}

	public void setBusinessSentence(String businessSentence) {
		this.businessSentence = businessSentence;
	}

	public GherkinsType getType() {
		return type;
	}

	public void setType(GherkinsType type) {
		this.type = type;
	}

}
