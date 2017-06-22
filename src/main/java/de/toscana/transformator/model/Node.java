package de.toscana.transformator.model;

import org.w3c.dom.Element;

import java.util.List;
import java.util.Map;

/**
 * Root class to represent a topology node.
 */
public abstract class Node {
    /**
     * Stores the name of the node. As in toscalite this represents the unique identifier for this node.
     */
    protected String name;
    /**
     * Stores all key-value properties described in the read model.xml file.
     * This map is always created. If a node has no properties, the map will be empty.
     */
    protected Map<String, String> properties;
    /**
     * Stores the children of this node (HostedOn Relationship). if a node has no children this is a empty list
     */
    protected List<Node> children;

    public Node(Element nodeElement) throws ParsingException {
        if(!isValidElement(nodeElement)) {
            throw new ParsingException("The given Element is not a valid Node!");
        }
        //TODO: Implement Parsing Operations for a Node

        parseSpecificData(nodeElement);
    }

    private boolean isValidElement(Element nodeElement) {
        //TODO implement check to find out if a given node is valid to be parsed.
        return isParsable(nodeElement);
    }

    /**
     * This method has to implement parsing operations specific to the type of node being implemented.
     *
     * @param element The DOM element to parse From
     */
    protected abstract void parseSpecificData(Element element) throws ParsingException;

    /**
     * This method has to check if a node is valid to be parsed.
     * It has to check if all the required elements/attributes needed for successful parsing are available.
     *
     * @param element The element to check on
     * @return True if the Element is parsable, false otherwise.
     */
    protected abstract boolean isParsable(Element element);

    /**
     * @return the name attribute (see name attribute)
     */
    public String getName() {
        return name;
    }

    /**
     * @return the Properties map (See properties attribute)
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * @return The list of children of this node. if the node has no children the list is empty.
     */
    public List<Node> getChildren() {
        return children;
    }
}
