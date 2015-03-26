/**
 * 
 */
package com.genability.client.api.request;

import java.io.Serializable;
import java.util.List;

import org.apache.http.NameValuePair;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mihle
 * 
 */
public class GetAccountTariffsRequest extends AbstractGetNRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String accountId;
	private Long masterTariffId;
	private String[] tariffTypes;

	/**
	 * Private member variable for SerivceTypes.
	 */
	private String[] serviceTypes;

	/**
	 * Private member variable for Privacy.
	 */
	private String[] privacy;

	private DateTime effectiveOn;
	private DateTime fromDateTime;
	private DateTime toDateTime;
	private Boolean isActive;
	private Boolean includeNotApplicable;
	private Boolean populateRates;
	private Boolean populateProperties;
	private String providerAccountId;

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the masterTariffId
	 */
	public Long getMasterTariffId() {
		return masterTariffId;
	}

	/**
	 * @param masterTariffId
	 *            the masterTariffId to set
	 */
	public void setMasterTariffId(Long masterTariffId) {
		this.masterTariffId = masterTariffId;
	}

	/**
	 * @return the tariffTypes
	 */
	public String[] getTariffTypes() {
		return tariffTypes;
	}

	/**
	 * @param tariffTypes
	 *            the tariffTypes to set
	 */
	public void setTariffTypes(String[] tariffTypes) {
		this.tariffTypes = tariffTypes;
	}

	/**
	 * @return the serviceTypes
	 */
	public String[] getServiceTypes() {
		return serviceTypes;
	}

	/**
	 * @param serviceTypes
	 *            the serviceTypes to set
	 */
	public void setServiceTypes(String[] serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

	public String[] getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String[] privacy) {
		this.privacy = privacy;
	}

	/**
	 * @return the effectiveOn
	 */
	public DateTime getEffectiveOn() {
		return effectiveOn;
	}

	/**
	 * @param effectiveOn
	 *            the effectiveOn to set
	 */
	public void setEffectiveOn(DateTime effectiveOn) {
		this.effectiveOn = effectiveOn;
	}

	/**
	 * @return the fromDateTime
	 */
	public DateTime getFromDateTime() {
		return fromDateTime;
	}

	/**
	 * @param fromDateTime
	 *            the fromDateTime to set
	 */
	public void setFromDateTime(DateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	/**
	 * @return the toDateTime
	 */
	public DateTime getToDateTime() {
		return toDateTime;
	}

	/**
	 * @param toDateTime
	 *            the toDateTime to set
	 */
	public void setToDateTime(DateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the includeIneligible
	 */
	public Boolean getIncludeNotApplicable() {
		return includeNotApplicable;
	}

	/**
	 * @param includeIneligible
	 *            the includeIneligible to set
	 */
	public void setIncludeNotApplicable(Boolean includeNotApplicable) {
		this.includeNotApplicable = includeNotApplicable;
	}
	

	/**
	 * @return the populateRates
	 */
	public Boolean getPopulateRates() {
		return populateRates;
	}


		/**
	 * @param populateRates
	 *            the populateRates to set
	 */
	public void setPopulateRates(Boolean populateRates) {
		this.populateRates = populateRates;
	}


		/**
	 * @return the populateProperties
	 */
	public Boolean getPopulateProperties() {
		return populateProperties;
	}


		/**
	 * @param populateProperties
	 *            the populateProperties to set
	 */
	public void setPopulateProperties(Boolean populateProperties) {
		this.populateProperties = populateProperties;
	}

	/**
	 * @return the providerAccountId
	 */
	public String getProviderAccountId() {
		return providerAccountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setProviderAccountId(String providerAccountId) {
		this.providerAccountId = providerAccountId;
	}

	//
	@Override
	@JsonIgnore
	public List<NameValuePair> getQueryParams() {

		List<NameValuePair> qparams = super.getQueryParams();
		
		addParam(qparams, "providerAccountId", providerAccountId);


		return qparams;
		
	}	
	
}