package com.training.model;

import java.util.*;

public class Doctor {
	private int docId;
	private String docName;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int docId, String docName) {
		super();
		this.docId = docId;
		this.docName = docName;
		
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + docId;
		result = prime * result + ((docName == null) ? 0 : docName.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docId != other.docId)
			return false;
		if (docName == null) {
			if (other.docName != null)
				return false;
		} else if (!docName.equals(other.docName))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + "]";
	}
	
	
	
	

}
