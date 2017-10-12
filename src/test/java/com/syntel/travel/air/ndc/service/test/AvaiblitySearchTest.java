//@formatter:off
 /*
 * @(#)AvaiblitySearchTest.java
 * 
 * Copyright (C) 2012, Syntel Private Limited . The program(s) herein may be used and/or
 * copied only with the written permission of Syntel Private Limited or in accordance with the terms and conditions stipulated in the
 * agreement/contract under which the program(s) have been supplied. 
 * 
 * $Creation Date:Jul 27, 2017
 * $Revision: v1.0
 * $Created By: Syntel Inc.
 * 
 * $History:
 * Jul 27, 2017	New Class Created by CM33871
 */
 //@formatter:on
package com.syntel.travel.air.ndc.service.test;

import com.syntel.travel.air.ndc.service.rest.AvailabilitySearch;

//@formatter:off
/**
* TODO
*
* @author Syntel Inc.
* @version 1.0, Jul 27, 2017 
**/
//@formatter:on
public class AvaiblitySearchTest {

	/**
	 * mAIN
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvailabilitySearch search = new AvailabilitySearch();
		search.invokeNDC("HAM", "DXB");
	}

}
