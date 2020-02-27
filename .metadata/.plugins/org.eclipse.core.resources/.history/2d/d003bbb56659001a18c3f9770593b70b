/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.ServidorBD;
import ceffective.TipoBaseDatos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor BD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ceffective.impl.ServidorBDImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ceffective.impl.ServidorBDImpl#getSistemaManejador <em>Sistema Manejador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorBDImpl extends ServidorImpl implements ServidorBD {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoBaseDatos TIPO_EDEFAULT = TipoBaseDatos.RELACIONAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoBaseDatos tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSistemaManejador() <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaManejador()
	 * @generated
	 * @ordered
	 */
	protected static final String SISTEMA_MANEJADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSistemaManejador() <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaManejador()
	 * @generated
	 * @ordered
	 */
	protected String sistemaManejador = SISTEMA_MANEJADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorBDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.SERVIDOR_BD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoBaseDatos getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoBaseDatos newTipo) {
		TipoBaseDatos oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.SERVIDOR_BD__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSistemaManejador() {
		return sistemaManejador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemaManejador(String newSistemaManejador) {
		String oldSistemaManejador = sistemaManejador;
		sistemaManejador = newSistemaManejador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.SERVIDOR_BD__SISTEMA_MANEJADOR, oldSistemaManejador, sistemaManejador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.SERVIDOR_BD__TIPO:
				return getTipo();
			case CeffectivePackage.SERVIDOR_BD__SISTEMA_MANEJADOR:
				return getSistemaManejador();
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
			case CeffectivePackage.SERVIDOR_BD__TIPO:
				setTipo((TipoBaseDatos)newValue);
				return;
			case CeffectivePackage.SERVIDOR_BD__SISTEMA_MANEJADOR:
				setSistemaManejador((String)newValue);
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
			case CeffectivePackage.SERVIDOR_BD__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CeffectivePackage.SERVIDOR_BD__SISTEMA_MANEJADOR:
				setSistemaManejador(SISTEMA_MANEJADOR_EDEFAULT);
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
			case CeffectivePackage.SERVIDOR_BD__TIPO:
				return tipo != TIPO_EDEFAULT;
			case CeffectivePackage.SERVIDOR_BD__SISTEMA_MANEJADOR:
				return SISTEMA_MANEJADOR_EDEFAULT == null ? sistemaManejador != null : !SISTEMA_MANEJADOR_EDEFAULT.equals(sistemaManejador);
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", sistemaManejador: ");
		result.append(sistemaManejador);
		result.append(')');
		return result.toString();
	}

} //ServidorBDImpl
