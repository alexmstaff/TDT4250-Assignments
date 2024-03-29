/**
 */
package StudyProgramme.impl;

import StudyProgramme.Programme;
import StudyProgramme.Semester;
import StudyProgramme.Specialization;
import StudyProgramme.StudyProgrammePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StudyProgramme.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link StudyProgramme.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link StudyProgramme.impl.ProgrammeImpl#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link StudyProgramme.impl.ProgrammeImpl#getProgrammeSpecializaton <em>Programme Specializaton</em>}</li>
 *   <li>{@link StudyProgramme.impl.ProgrammeImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammeSemester() <em>Programme Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> programmeSemester;

	/**
	 * The cached value of the '{@link #getProgrammeSpecializaton() <em>Programme Specializaton</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSpecializaton()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> programmeSpecializaton;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgrammePackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getProgrammeSemester() {
		if (programmeSemester == null) {
			programmeSemester = new EObjectContainmentEList<Semester>(Semester.class, this, StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER);
		}
		return programmeSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getProgrammeSpecializaton() {
		if (programmeSpecializaton == null) {
			programmeSpecializaton = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON);
		}
		return programmeSpecializaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgrammePackage.PROGRAMME__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER:
				return ((InternalEList<?>)getProgrammeSemester()).basicRemove(otherEnd, msgs);
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON:
				return ((InternalEList<?>)getProgrammeSpecializaton()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME__NAME:
				return getName();
			case StudyProgrammePackage.PROGRAMME__CODE:
				return getCode();
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER:
				return getProgrammeSemester();
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON:
				return getProgrammeSpecializaton();
			case StudyProgrammePackage.PROGRAMME__DURATION:
				return getDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyProgrammePackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
				getProgrammeSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON:
				getProgrammeSpecializaton().clear();
				getProgrammeSpecializaton().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyProgrammePackage.PROGRAMME__DURATION:
				setDuration((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgrammePackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
				return;
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON:
				getProgrammeSpecializaton().clear();
				return;
			case StudyProgrammePackage.PROGRAMME__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyProgrammePackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgrammePackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SEMESTER:
				return programmeSemester != null && !programmeSemester.isEmpty();
			case StudyProgrammePackage.PROGRAMME__PROGRAMME_SPECIALIZATON:
				return programmeSpecializaton != null && !programmeSpecializaton.isEmpty();
			case StudyProgrammePackage.PROGRAMME__DURATION:
				return duration != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
