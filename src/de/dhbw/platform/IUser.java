package de.dhbw.platform;

import java.util.List;
import java.util.Map;

public interface IUser {
    /**
     * Gibt die ID des Benutzers zurück (darf nicht <code>null</code> sein und muss über alle Benutezr-Datensätze eindeutig sein).
     */
    public int getId();

    /**
     * Gibt den Benutzernamen des Benutzers zurück.
     */
    public String getUsername();

    /**
     * Gibt eine Map mit allen Abzeichen (Schlüssel), die der Benutzer für den jeweiligen Ort (Wert) erhalten hat, zurück.
     */
    public Map<Badge, ILocation> getBadges();

    /**
     * Gibt eine Liste der besuchten Orte zurück.
     */
    public List<ILocation> getVisitedLocations();

    /**
     * Gibt eine Liste der besuchten Orte inkl. der Anzahl der Besuche zurück.
     */
    public Map<ILocation, Integer> getVisitedLocationsWithScores();
}
