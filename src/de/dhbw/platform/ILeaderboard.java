package de.dhbw.platform;

public interface ILeaderboard {
    /**
     * Gibt die Anzahl der Besuche am Ranglistenort für den angegebenen Benutzer zurück.
     */
    public int getScore(IUser user);

    /**
     * Gibt die aktuelle Ranglistenpositionen für den angegeben Benutzer zurück (<code>-1</code>, falls der Nutzer den Ort noch nicht besucht hat).
     */
    public int getPosition(IUser user);

    /**
     * Gibt die Anzahl aller Einträge in der Rangliste zurück.
     */
    public int getEntriesCount();

    /**
     * Gibt das Benutzerobjekt an der übergebenen Position zurück (<code>null</code>, falls der Benutzer nicht in der Rangliste existiert).
     *
     * @param position
     * @return
     */
    public IUser getUserAtPosition(int position);

    /**
     * Gibt den Ort zurück, für den diese Rangliste erstellt wurde.
     */
    public ILocation getLocation();
}
