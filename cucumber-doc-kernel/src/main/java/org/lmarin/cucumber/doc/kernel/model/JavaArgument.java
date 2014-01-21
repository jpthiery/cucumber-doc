/**
 * Copyright (C) 2014 Jean-Pascal THIERY (jpascal@lmarin.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
