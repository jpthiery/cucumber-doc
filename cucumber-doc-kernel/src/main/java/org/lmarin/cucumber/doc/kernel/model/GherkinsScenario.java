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
