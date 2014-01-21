package org.lmarin.cucumber.doc.kernel.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

public class GherkinsFeature implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;

	private final List<GherkinsSentence> gherkinsSentences;
	
	private List<GherkinsScenario> scenarii;

	public GherkinsFeature(String name, List<GherkinsSentence> gherkinsSentences) {
		super();
		if (StringUtils.isEmpty(name)) {
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

	public List<GherkinsScenario> getScenarii() {
		return scenarii;
	}

	public void setScenarii(List<GherkinsScenario> scenarii) {
		this.scenarii = scenarii;
	}
	
}
