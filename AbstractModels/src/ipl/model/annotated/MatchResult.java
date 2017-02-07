package ipl.model.annotated;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * @model
 */
public enum MatchResult implements Enumerator {
	/**
	 * @model name="TIE" literal="Match Tie"
	 */
	TIE(0, "TIE", "Match Tie"),
	/**
	 * @model name="ABANDONED" literal="Match Abandoned"
	 */
	ABANDONED(1, "ABANDONED", "Match Abandoned"),
	/**
	 * @model name="WINNER_A" literal="Won by Team A"
	 */
	WINNER_A(2, "WINNER_A", "Won by Team A"),
	/**
	 * @model name="WINNER_B" literal="Won by Team B"
	 */
	WINNER_B(3, "WINNER_B", "Won by Team B"),
	/**
	 * @model name="UNDER_PROGRESS" literal="Under Progress"
	 */
	UNDER_PROGRESS(4, "UNDER_PROGRESS", "Under Progress");

	/**
	 * The '<em><b>TIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIE
	 * @model literal="Match Tie"
	 * @generated
	 * @ordered
	 */
	public static final int TIE_VALUE = 0;
	/**
	 * The '<em><b>ABANDONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABANDONED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABANDONED
	 * @model literal="Match Abandoned"
	 * @generated
	 * @ordered
	 */
	public static final int ABANDONED_VALUE = 1;
	/**
	 * The '<em><b>WINNER A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINNER A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINNER_A
	 * @model literal="Won by Team A"
	 * @generated
	 * @ordered
	 */
	public static final int WINNER_A_VALUE = 2;
	/**
	 * The '<em><b>WINNER B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINNER B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINNER_B
	 * @model literal="Won by Team B"
	 * @generated
	 * @ordered
	 */
	public static final int WINNER_B_VALUE = 3;
	/**
	 * The '<em><b>UNDER PROGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDER PROGRESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDER_PROGRESS
	 * @model literal="Under Progress"
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_PROGRESS_VALUE = 4;
	/**
	 * An array of all the '<em><b>Match Result</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MatchResult[] VALUES_ARRAY =
		new MatchResult[] {
			TIE,
			ABANDONED,
			WINNER_A,
			WINNER_B,
			UNDER_PROGRESS,
		};
	/**
	 * A public read-only list of all the '<em><b>Match Result</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MatchResult> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Match Result</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchResult get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchResult result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Result</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchResult getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchResult result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Result</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchResult get(int value) {
		switch (value) {
			case TIE_VALUE: return TIE;
			case ABANDONED_VALUE: return ABANDONED;
			case WINNER_A_VALUE: return WINNER_A;
			case WINNER_B_VALUE: return WINNER_B;
			case UNDER_PROGRESS_VALUE: return UNDER_PROGRESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MatchResult(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
