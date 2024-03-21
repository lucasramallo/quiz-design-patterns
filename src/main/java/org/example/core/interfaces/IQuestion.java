package org.example.core.interfaces;

import java.util.UUID;
import java.util.ArrayList;

import org.example.core.domain.Alternative;

public interface IQuestion {
    public UUID getID();
    public void setDescription(String description);
    public String getDescription();
    public void setAlternatives(ArrayList<Alternative> alternatives);
    public ArrayList<Alternative> getAlternatives();
    
}
