/**
 * WSDBFetchServerLegacy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.ac.ebi.www.ws.services.WSDbfetch;

public interface WSDBFetchServerLegacy extends java.rmi.Remote {

    /**
     * Get a database entry (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#fetchdata_query_format_style)
     */
    public java.lang.String fetchData(java.lang.String query, java.lang.String format, java.lang.String style) throws java.rmi.RemoteException, uk.ac.ebi.jdbfetch.exceptions.DbfConnException, uk.ac.ebi.jdbfetch.exceptions.DbfNoEntryFoundException, uk.ac.ebi.jdbfetch.exceptions.DbfException, uk.ac.ebi.jdbfetch.exceptions.DbfParamsException, uk.ac.ebi.www.ws.services.WSDbfetch.InputException;

    /**
     * Get a set of database entries (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#fetchbatch_db_ids_format_style)
     */
    public java.lang.String fetchBatch(java.lang.String db, java.lang.String ids, java.lang.String format, java.lang.String style) throws java.rmi.RemoteException, uk.ac.ebi.jdbfetch.exceptions.DbfConnException, uk.ac.ebi.jdbfetch.exceptions.DbfNoEntryFoundException, uk.ac.ebi.jdbfetch.exceptions.DbfException, uk.ac.ebi.jdbfetch.exceptions.DbfParamsException, uk.ac.ebi.www.ws.services.WSDbfetch.InputException;

    /**
     * Get a list of available databases (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#getsupporteddbs)
     */
    public java.lang.String[] getSupportedDBs() throws java.rmi.RemoteException;

    /**
     * Get a list of databases and formats (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#getsupportedformats)
     */
    public java.lang.String[] getSupportedFormats() throws java.rmi.RemoteException;

    /**
     * Get a list of formats for a given database (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#getdbformats_db)
     */
    public java.lang.String[] getDbFormats(java.lang.String db) throws java.rmi.RemoteException, uk.ac.ebi.jdbfetch.exceptions.DbfParamsException;

    /**
     * Get a list of available styles for a given database and format
     * (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#getformatstyles_db_format)
     */
    public java.lang.String[] getFormatStyles(java.lang.String db, java.lang.String format) throws java.rmi.RemoteException, uk.ac.ebi.jdbfetch.exceptions.DbfParamsException;

    /**
     * Get a list of databases, formats and styles (see http://www.ebi.ac.uk/Tools/webservices/services/dbfetch#fetchdata_query_format_style)
     */
    public java.lang.String[] getSupportedStyles() throws java.rmi.RemoteException;
}
