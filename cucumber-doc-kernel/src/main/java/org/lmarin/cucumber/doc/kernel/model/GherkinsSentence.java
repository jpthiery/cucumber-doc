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
