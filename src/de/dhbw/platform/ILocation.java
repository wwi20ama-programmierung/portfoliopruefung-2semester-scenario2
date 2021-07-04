package de.dhbw.platform;

public interface ILocation {
    /**
     * Gibt die ID des Orts zurück (darf nicht <code>null</code> sein und muss über alle Ort-Datensätze eindeutig sein).
     */
    public int getId();

    /**
     * Gibt den Namen des Orts zurück.
     */
    public String getName();

    /**
     * Gibt die Adresse des Orts zurück
     */
    public String getAddress();

    /**
     * Gibt die Rangliste des Orts zurück
     */
    public ILeaderboard getLeaderboard();

    /**
     * Ermöglicht den Check-In für einen User an diesem Ort.
     */
    public void checkIn(IUser user);
}
