package Labs.SYSC2004L9;

import java.util.List;

public interface Actor
    {
        void act(List<Actor> newActors);
        abstract public boolean isActive();
    }