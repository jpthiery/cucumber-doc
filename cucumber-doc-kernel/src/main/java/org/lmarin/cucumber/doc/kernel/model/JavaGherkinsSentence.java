package org.lmarin.cucumber.doc.kernel.model;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class JavaGherkinsSentence implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String sentence;

	private final GherkinsType type;

	public JavaGherkinsSentence(String sentence, GherkinsType type) {
		super();
		if (StringUtils.isBlank(sentence)) {
			throw new IllegalArgumentException("sentence can't be null.");
		}
		if (type == null) {
			throw new IllegalArgumentException("type can't be null.");
		}
		this.sentence = sentence;
		this.type = type;
	}

	public String getSentence() {
		return sentence;
	}

	public GherkinsType getType() {
		return type;
	}

}
