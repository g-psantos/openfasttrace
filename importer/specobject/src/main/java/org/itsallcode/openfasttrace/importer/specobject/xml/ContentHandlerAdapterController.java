package org.itsallcode.openfasttrace.importer.specobject.xml;

/**
 * A controller that allows finishing the parsing.
 */
public interface ContentHandlerAdapterController
{
    /**
     * Tell the controller that this handler is finished with parsing the XML
     * sub tree.
     */
    void parsingFinished();
}
