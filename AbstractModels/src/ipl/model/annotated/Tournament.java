package ipl.model.annotated;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Tournament extends EObject {
	/**
	 * @model type="Team" containment="true"
	 */
	EList<Team> getTeams();
	/**
	 * @model type="Venue" containment="true"
	 */
	EList<Venue> getVenues();
	/**
	 * @model type="Match" containment="true"
	 */
	EList<Match> getMatches();
}
