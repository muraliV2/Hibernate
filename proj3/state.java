package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class state {
	
	
	@Id
		private int  StateId;
		private String  StateName;
		private String StateCode;
		private String CountryName;
		public int getStateId() {
			return StateId;
		}
		public void setStateId(int stateId) {
			StateId = stateId;
		}
		public String getStateName() {
			return StateName;
		}
		public void setStateName(String stateName) {
			StateName = stateName;
		}
		public String getStateCode() {
			return StateCode;
		}
		public void setStateCode(String stateCode) {
			StateCode = stateCode;
		}
		public String getCountryName() {
			return CountryName;
		}
		public void setCountryName(String countryName) {
			CountryName = countryName;
		}


}
