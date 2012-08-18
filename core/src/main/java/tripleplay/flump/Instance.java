package tripleplay.flump;

import playn.core.Layer;

/**
 * A created instance of a Flump symbol.
 */
public interface Instance
{
    /**
     * The layer that displays this instance.
     */
    Layer layer ();

    void update (float dt);
}
