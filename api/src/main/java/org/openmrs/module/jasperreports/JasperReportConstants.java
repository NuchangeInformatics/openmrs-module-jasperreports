/**
 * 
 */
package org.openmrs.module.jasperreports;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 * 
 */
public class JasperReportConstants {

	public static final String SQL_FILE = "/org/openmrs/module/jasperreport/currentDrugsEncounters.sql";

	// concept ID for concept that records a paitients current drugs
	public static final String DTHF_ARV_DRUG_LIST = "1419";
	
	public static final String CSV_FILENAME = "tmpDrugCombinations.csv";
	public static final String PEPFAR_REPORT_NAME = "PEPFAR_QUARTERLY.jrxml";
	
	public static final String GENERATED_REPORT_DIR_NAME = "generated";
	
	public static final List<Class<?>> parameterClasses = new ArrayList<Class<?>>();

	public static final String DATE_FORMAT = "dd/MM/yyyy";
	static {
		parameterClasses.add(java.lang.String.class);
		parameterClasses.add(java.lang.Integer.class);
		parameterClasses.add(java.util.Date.class);
	}	
}