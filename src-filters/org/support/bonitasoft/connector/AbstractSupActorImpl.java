/**
 * 
 */
package org.support.bonitasoft.connector;

import org.bonitasoft.engine.filter.AbstractUserFilter;
import org.bonitasoft.engine.connector.ConnectorValidationException;

/**
 * This abstract class is generated and should not be modified.
 */
public abstract class AbstractSupActorImpl extends AbstractUserFilter {

	protected final static String ADUMMYSTRING_INPUT_PARAMETER = "aDummyString";

	protected final java.lang.String getADummyString() {
		return (java.lang.String) getInputParameter(ADUMMYSTRING_INPUT_PARAMETER);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getADummyString();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("aDummyString type is invalid");
		}

	}

}
