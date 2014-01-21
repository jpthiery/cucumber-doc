package org.lmarin.cucumber.doc.kernel.model;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class JavaArgument implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;
	
	private final String type;
	
	private final int index;
	
	private String comment;

	public JavaArgument(int index, String type, String name) {
		super();
		if (StringUtils.isEmpty(name)) {
			throw new IllegalArgumentException("name can't be null.");
		}
		if (StringUtils.isEmpty(type)) {
			throw new IllegalArgumentException("type can't be null.");
		}
		if (index < 0) {
			throw new IllegalArgumentException("index can't be negative.");
		}
		this.index = index;
		this.type = type;
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getIndex() {
		return index;
	}
		
}
