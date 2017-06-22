package de.toscana.transformator.model;

import org.w3c.dom.Element;

/**
 * This class is the base class representing the common properties of a relationship
 */
public abstract class Relationship {

    /**
     * Stores the instance of the source node
     */
    protected Node source;
    /**
     * Stores the instance of the target node
     */
    protected Node target;

    /**
     * Parses a relationship from the given DOM element
     *
     * @param relElement the DOM element to parse from
     * @param model      needed to get Node instances by name1
     * @throws ParsingException gets thrown if the element cannot get parsed into a java object.
     *                          For example: the element is no Relationship
     */
    public Relationship(Element relElement, TOSCAliteModel model) throws ParsingException {
        //TODO Implement relationship parsing
        parseSpecific(relElement);
    }

    /**
     * This method gets called during the parsing process. It should be used to parse all
     * relationship specific Elements/attributes
     *
     * @param element The element to Parse from
     * @throws ParsingException see Constructor
     */
    protected void parseSpecific(Element element) throws ParsingException {

    }

    public Node getSource() {
        return source;
    }

    public Node getTarget() {
        return target;
    }
}
