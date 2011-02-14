package chapter9;

/**
 * This file taken directly out of page 303 of ISBN 0-13-222158-6
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object.
     */
    public GeometricObject() {
        this.dateCreated = new java.util.Date();
    }

    /**
     * Accessor.
     *
     * @return: String  color of the object.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Mutator.
     *
     * @param: String new color of the object.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Accessor.
     *
     * @return: boolean if the object is filled.
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * Mutator.
     *
     * @param: boolean whether the object should be filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Accessor.
     *
     * @return: java.util.Date the date the object was created.
     */
    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Accessor, overridden.
     *
     * @return: String a full explanation of the current state of the object's
     * properties.
     */
    public String toString() {
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }
}
