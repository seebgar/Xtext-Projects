/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.Servidor;
import ceffective.TamanoServidor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ceffective.impl.ServidorImpl#getTamano <em>Tamano</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorImpl extends RecursoImpl implements Servidor {
	/**
	 * The default value of the '{@link #getTamano() <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamano()
	 * @generated
	 * @ordered
	 */
	protected static final TamanoServidor TAMANO_EDEFAULT = TamanoServidor.MICRO;

	/**
	 * The cached value of the '{@link #getTamano() <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamano()
	 * @generated
	 * @ordered
	 */
	protected TamanoServidor tamano = TAMANO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.SERVIDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamanoServidor getTamano() {
		return tamano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamano(TamanoServidor newTamano) {
		TamanoServidor oldTamano = tamano;
		tamano = newTamano == null ? TAMANO_EDEFAULT : newTamano;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.SERVIDOR__TAMANO, oldTamano, tamano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.SERVIDOR__TAMANO:
				return getTamano();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeffectivePackage.SERVIDOR__TAMANO:
				setTamano((TamanoServidor)newValue);
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
			case CeffectivePackage.SERVIDOR__TAMANO:
				setTamano(TAMANO_EDEFAULT);
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
			case CeffectivePackage.SERVIDOR__TAMANO:
				return tamano != TAMANO_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tamano: ");
		result.append(tamano);
		result.append(')');
		return result.toString();
	}

} //ServidorImpl
