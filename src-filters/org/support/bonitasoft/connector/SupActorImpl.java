/**
 * 
 */
package org.support.bonitasoft.connector;

import java.util.ArrayList;
import java.util.List;
import org.bonitasoft.engine.connector.ConnectorValidationException;
import org.bonitasoft.engine.filter.UserFilterException;

import com.support.bonitasoft.groovy.ids.IdsConstants;

/**
*The actor filter execution will follow the steps
* 1 - setInputParameters() --> the actor filter receives input parameters values
* 2 - validateInputParameters() --> the actor filter can validate input parameters values
* 3 - filter(final String actorName) --> execute the user filter
* 4 - shouldAutoAssignTaskIfSingleResult() --> auto-assign the task if filter returns a single result
*/
public class SupActorImpl extends AbstractSupActorImpl {

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		return;
	}

	@Override
	public List<Long> filter(final String actorName) throws UserFilterException {
		final List<Long> actorIds = new ArrayList<>();
		actorIds.add((Long.parseLong(getADummyString()+IdsConstants.getFourLong()) / 11L));
		return actorIds;	
	}

	@Override
	public boolean shouldAutoAssignTaskIfSingleResult() {
		// If this method returns true, the step will be assigned to 
		//the user if there is only one result returned by the filter method
		return super.shouldAutoAssignTaskIfSingleResult();
	
	}

}
