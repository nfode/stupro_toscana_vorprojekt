package de.toscana.transformator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents a complete, parsed topology.
 */
public class TOSCAliteModel {
    /**
     * Stores all nodes in the Topology. Maps name to the node instance
     */
    private Map<String, Node> nodes;
    /**
     * Stores all Relationship instances
     */
    private List<Relationship> relationships;
    /**
     * This list stores all machine nodes in the parsed topology
     */
    private List<MachineNode> machines;

    /**
     * Given the contents of a model.xml this constructor parses a Object representation of the model.xml
     * @param xmlContent Text content of a model.xml file
     */
    public TOSCAliteModel(String xmlContent) throws ParsingException{
        nodes = new HashMap<>();
        relationships = new ArrayList<>();
        machines = new ArrayList<>();
        //TODO Implement Parsing
    }

    /**
     * Returns the Node instance for a given name.
     * If a node does not exist with the given name null gets returned
     */
    public Node getNodeByName(String name) {
        return nodes.get(name);
    }

    public Map<String, Node> getNodes() {
        return nodes;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public List<MachineNode> getMachines() {
        return machines;
    }
}
