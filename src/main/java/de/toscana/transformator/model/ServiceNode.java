package de.toscana.transformator.model;

import org.w3c.dom.Element;

import java.util.List;
import java.util.Map;

/**
 * This class represents a service node.
 */
public class ServiceNode extends Node{

    private List<String> deploymentArtifacts;
    private Map<ArtifactType, String> implementationArtifacts;
    private Node parent;
    private List<ConnectsToRelationship> sourceConnections;
    private List<ConnectsToRelationship> targetConnections;


    public ServiceNode(Element nodeElement) throws ParsingException {
        super(nodeElement);
    }

    @Override
    protected void parseSpecificData(Element element) throws ParsingException {

    }

    @Override
    protected boolean isParsable(Element element) {
        return false;
    }

    public boolean hasImplementationArtifact(ArtifactType type) {
        return implementationArtifacts.containsKey(type);
    }

    public String getImplementationArtifact(ArtifactType type) {
        if(hasImplementationArtifact(type)) {
            return implementationArtifacts.get(type);
        }
        return null;
    }

    public List<String> getDeploymentArtifacts() {
        return deploymentArtifacts;
    }

    public Node getParent() {
        return parent;
    }

    public List<ConnectsToRelationship> getSourceConnections() {
        return sourceConnections;
    }

    public List<ConnectsToRelationship> getTargetConnections() {
        return targetConnections;
    }
}
