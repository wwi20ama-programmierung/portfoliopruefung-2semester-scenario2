# Aufgaben für die ortsbasierte Empfehlungsplattform

## Basis-Aufgaben

Im Quell-Ordner sind eine `Application`-Klasse und eine Reihe von *Interfaces* vorgegeben.
Ein Interface ist eine leere Klassenvorlage, die vorgibt, welche Methoden
eine Klasse haben muss.

Ihre Aufgaben bestehen zunächst darin, diese Interfaces zu implementieren,
d. h. Sie sollen Klassen bereitstellen, die die Methoden der Interfaces implementieren.

Dabei verwendet man das Schlüsselwort ```implements```, um dem Compiler
mitzuteilen, dass man ein bestimmtes Interface implementiert.
Der Compiler prüft dann den eigenen Code darauf, ob das Interface korrekt
umgesetzt wurde.

Ihre Klassen dürfen neben den vom Interface vorgegebenen Methoden noch weitere
enthalten, wenn Sie das für sinnvoll halten. Die Interfaces dürfen allerdings nicht geändert werden!

Am Ende dieses Abschnitts sollte eine einfache, funktionierende Anwendung stehen,
mit der Ortsbesuche registriert und abgefragt werden können. Für jeden Ort soll eine Rangliste geführt werden, sowie für jeden Nutzenden automatisiert Abzeichen vergeben werden:

| Abzeichen | Mindestbesuche |
| --------- | -------------- |
| **Newbie** | 1 |
| **Supporter** | 50 |
| **Host** | 100 |


## Fortgeschrittene Aufgaben

Erweitern Sie die Applikation, so dass mehr Informationen und Zusammenhänbge gespeichert bzw. abgerufen werden können. Alternativ/zusätzlich können Sie auch die Benutzbarkeit verbessern.

Hier einige Ideen bzw. Beispiele:

* Orte können bewertet werden, statt nur einzuchecken.
  * Anzeige einer Rangliste der beliebtesten Orte
  * Generierung von Empfehlungen: "Wer Ort A gut fand, mochte auch Ort B"
* Identifizierung von "Touristenmagneten": Orte, die in letzter Zeit besonders häufig besucht wurden.
* Eingabe von Beschreibungen/Informationen zu den Orten.
  * allgemeine Reiseinfos
  * tagesaktuelle Infos wie Wassertemperatur am Strand, Andrang in einem Restaurant etc.
* GUI-Anwendung für den Reiseführer

*Hinweis*: Sie müssen nicht alle obigen Ideen umsetzen.
Suchen Sie sich etwas aus, das Ihnen sinnvoll und machbar erscheint und erweitern Sie die Anwendung entsprechend. Falls Sie weitere Ideen haben, können Sie diese auch gerne umsetzen. Die Basisaufgaben müssen zum Bestehen der Prüfung vollständig umgesetzt werden!
