/*******************************************************************************
 * Copyright 2016 Matthew J. Dovey (www.ceridwen.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.ceridwen.util.versioning;

public class LibraryIdentifier {
	protected String libraryName;
	protected String vendorId;
	
	public LibraryIdentifier(String vendorId, String libraryName) {
		this.libraryName = libraryName;
		this.vendorId = vendorId;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof LibraryIdentifier)) {
			return false;
		}
		
		if (this.libraryName == null) {
			if (((LibraryIdentifier)obj).libraryName != null) {
				return false;
			}
		} else { 
			if (!(this.libraryName.equals(((LibraryIdentifier)obj).libraryName))) {
				return false;
			}
		}
		
		if (this.vendorId == null) {
			if (((LibraryIdentifier)obj).vendorId != null) {
				return false;
			}
		} else { 
			if (!(this.vendorId.equals(((LibraryIdentifier)obj).vendorId))) {
				return false;
			}
		}

		return true;
	}
	
	public int hashCode() {
		return new String(vendorId + ":" + libraryName).hashCode();		
	}
	
	
}
