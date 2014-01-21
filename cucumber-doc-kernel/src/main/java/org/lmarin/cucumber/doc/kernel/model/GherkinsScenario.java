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

public class GherkinsScenario implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;

	private final List<GherkinsSentence> gherkinsSentences;

	public GherkinsScenario(String name, List<GherkinsSentence> gherkinsSentences) {
		super();
		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException("name can't be null.");
		}
		if (CollectionUtils.isEmpty(gherkinsSentences)) {
			throw new IllegalArgumentException("gherkinsSentences can't be null.");
		}

		this.name = name;
		this.gherkinsSentences = gherkinsSentences;
	}

	public String getName() {
		return name;
	}

	public List<GherkinsSentence> getGherkinsSentences() {
		return gherkinsSentences;
	}

}
