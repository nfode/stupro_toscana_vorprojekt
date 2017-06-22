package de.toscana.transformator.model;

import org.w3c.dom.Element;

/**
 * This class reperesents the ConnectsTo relationship in a model.xml
 */
public class ConnectsToRelationship extends Relationship {

    private String implementationArtifact;

    public ConnectsToRelationship(Element relElement, TOSCAliteModel model) throws ParsingException {
        super(relElement, model);
    }

    @Override
    protected void parseSpecific(Element element) throws ParsingException {
        //TODO Implement parsing of the implementation artifact
    }

    public String getImplementationArtifact() {
        return implementationArtifact;
    }
}
