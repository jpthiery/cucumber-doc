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
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

public class JavaStepDefinition implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String signature;

	private final JavaGherkinsSentence javaGherkinsSentence;

	private final List<JavaArgument> arguments;

	private String documentation;

	private List<String> category;

	public JavaStepDefinition(String signature, JavaGherkinsSentence javaGherkinsSentence, List<JavaArgument> arguments) {
		super();
		if (StringUtils.isEmpty(signature)) {
			throw new IllegalArgumentException("signature can't be null.");
		}
		if (javaGherkinsSentence == null) {
			throw new IllegalArgumentException("javaGherkinsSentence can't be null.");
		}
		if (CollectionUtils.isEmpty(arguments)) {
			throw new IllegalArgumentException("arguments can't be null.");
		}
		this.signature = signature;
		this.javaGherkinsSentence = javaGherkinsSentence;
		this.arguments = arguments;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getSignature() {
		return signature;
	}

	public JavaGherkinsSentence getJavaGherkinsSentence() {
		return javaGherkinsSentence;
	}

	public List<JavaArgument> getArguments() {
		return arguments;
	}

}
