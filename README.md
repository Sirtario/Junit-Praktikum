# Junit-Praktikum

## Gruppenmitglieder

Phillip Eckstein
Michel Hecker
Michael Oesterle
Alec Sicheneder

## Kommentare

Dieses Projekt wurde auf Basis der uns zur Verfügung gestellten Musterlösung erstellt.
Einige Fehlerbehandlungen waren in dieser noch nicht implementiert und wurden von uns bei/nach der Implementation der Tests eingefügt.

## Ideen zu weiteren Testcases

Einzelne kleine Funktionen konnten nicht getestet werden, da dafür eigene Getter implementiert werden müssten, der Zugang zu diesen Variablen allerdings nicht gewünscht ist.
Ein Beispiel dafür ist die AddVehicle-Funktion. Um zu kontrollieren, ob ein Vehicle tatsächlich hinzugefügt wurde, müsste man auf die private Liste Vehicles zugreifen können. Dies ist aber in gegebenem Rahmen nicht möglich.
Ein anderer Testfall, welcher uns aufgefallen ist, während wir die Testfälle geschrieben ist, dass zum Beispiel die verschiedenen Operating-Environments nicht verändert werden können, da die Oberklassen von den Fahrzeugen abstrakt sind und die VehicleBase selbst ist ein Interface und somit nicht veränderbar, weil man Interfaces nicht instanziieren kann.

## Anmerkungen zu Test TestbookingCustomerWithSameID

Da die ID der Customer nicht einzigartig ist kommt es zu Komplikationen wenn zwei Customer die selbe ID haben, da innerhalb der Methoden nicht bei Customern mit der selben ID unterschieden wird.
