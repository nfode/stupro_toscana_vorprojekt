package de.toscana.transformator.model;

/**
 * This enum class is used to seperate the different types of
 * implementation artifacts that can be defined in the model.xml
 */
public enum ArtifactType {
    CREATE("Create", false),
    START("Start", true),
    STOP("Stop", true);

    private String elementName;
    private boolean optional;

    ArtifactType(String elementName, boolean optional) {
        this.elementName = elementName;
        this.optional = optional;
    }

    /**
     * @return Returns the name of the element in the model.xml representing this ArtifactType
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * @return Returns true if the ArtifactType is not Required for parsing a proper model.
     */
    public boolean isOptional() {
        return optional;
    }
}
