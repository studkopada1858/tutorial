# Git und IntelliJ

Ziel dieses Tutorials ist es Sie mit einem professionellen Entwicklungsprozess vertraut zu machen.
Viele Unternehmen verwenden den sogenannten [Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow), bei dem der `master` Branch stets aktuell ist, und Features (oder Bugfixes) auf jeweils separaten Branches entwickelt werden.


Ziel dieser Übung ist es Sie mit `git` und IntelliJ vertraut zu machen.
Es gibt ein ca. 15-minütiges [webbasiertes Tutorial](https://try.github.io/levels/1/challenges/1), welches Sie umbedingt machen sollten, sowie ein sehr detailliertes [Buch zu Git](https://git-scm.com/book/de/v1), welches ein ideales Nachschlagewerk ist.


# Meilensteine

In dieser Übung werden Sie das Grundschema der nächsten Übungen kennenlernen und verinnerlichen.
Dazu werden Sie

- einen persönlichen _Fork_ dieses Repositories erstellen,
- das Projekt in IntelliJ auschecken,
- einen eigenen _Branch_ erstellen,
- das Problem finden, warum die Testcases fehlschlagen,
- Ihre Lösung _committen_ und _pushen_, und abschliessend
- den Branch mit Ihrer Lösung in den `master` Branch _mergen_.

> Hinweis: Es ist nicht zwingend notwendig für jede Übung einen Fork zu erstellen, jedoch ist es hilfreich, wenn Sie Ihre Arbeit auf Github sichern oder mit Kommilitonen zusammenarbeiten möchten.

> Hinweis: Sollten Sie keinen kostenlosen Github Account wünschen, so können Sie die Angaben zwar anonym auschecken, aber weder einen Fork erstellen, noch Änderungen pushen.


# Vorarbeiten

## JDK installieren

Siehe [separate Dokumentation](docs/win-install-jdk.md).


## Git installieren

Windows: Siehe [separate Dokumentation](docs/win-install-git.md).

OS X: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Sie können auch die [XCode Command Line Tools installieren](http://osxdaily.com/2014/02/12/install-command-line-tools-mac-os-x/).

Linux: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Verwenden Sie am besten den Paketmanager Ihrer Distribution.


## Einen Fork erstellen

- Öffnen Sie die Webseite des Repository https://github.com/hsro-wif-oop/tutorial, und loggen Sie sich ein.
- Klicken Sie rechts oben auf die Schaltfläche "Fork", um einen privaten Fork zu erstellen.


## Clone in IntelliJ

- Starten Sie IntelliJ; sollten Sie noch ein Projekt geöffnet haben, so schließen Sie es bitte.
- Klicken Sie "Checkout from Version Control" und dann "Git".
- Geben Sie die Adresse **Ihres** forks an, z.B. https://github.com/maxmustermann/tutorial (Hinweis: Die URL muss Ihren Accountnamen enthalten!)
- Wählen Sie "Ja" bzw. "Yes" um eine IDEA Struktur anzulegen.
- Wählen Sie im nächsten Fenster ("Import Project") die Option "Import project from external model" sowie "Gradle".
- Übernehmen Sie im nächsten Fenster alle Standardeinstellungen.

> Hinweis: Sie können auch das offizielle Repository klonen, dann können Sie aber nicht pushen (Sie besitzen keine Schreibrechte).


## Fehler finden und beheben

Das Projekt im `master` Branch kompiliert zwar, allerdings schlägt der Testcase fehl.

- Navigieren Sie im Projektexplorer (linke Seite) zu `src/test/java/GreetingTest`, und öffnen Sie die Datei.
- Klicken Sie den kleinen grünen Playbutton am linken Rand des Editorfeldes, auf Höhe des Klassennamens, und beobachten Sie die Ausgabe.
- Identifizieren, lokalisieren und beheben Sie das Problem (Hinweis: Die Testklasse soll natürlich **nicht** verändert werden!).
- Verifizieren Sie dass der Test nun positiv durchläuft.


# Branch erstellen, committen und pushen


- Mit `git status` können Sie sehen, welche Dateien Sie geändert haben.
- Erstellen Sie einen neuen Branch, entweder in der Konsole (`git checkout -b <branch-name>`), oder in IntelliJ: Rechts unten am Rand steht "Git: master", klicken Sie dort und wählen Sie "+ Create Branch", und wählen Sie einen Namen, z.B. `loesung`.
- Fügen Sie nun die korrigierten Dateien mit `git add <datei>` zu Ihrem geplanten Commit hinzu, oder rechts-klicken Sie auf die Klassendatei und wählen Sie `Git -> Add`.
- Wenn Sie alle Dateien hinzugefügt haben, können Sie mit `git commit -m "Ihre freigewählte Nachricht"` den Commit abschließen und mit `git push` den Commit auf den Server laden, 
- _Alternativ:_ Wählen Sie in der Menüleiste `VCS -> Commit Changes`, um die Änderungen zu committen und zu pushen.
	Fügen Sie eine Nachricht hinzu, und wählen Sie "Commit and Push" (bewegen Sie dazu die Maus auf "Commit", es erscheint ein PopUp)

> Hinweis: Git Befehle können Sie auch in IntelliJ unter dem Reiter "Terminal" (Statusleiste unten) eingeben.


## Branch verifizieren und mergen

> Hinweis: Dieser Teil funktioniert nur, wenn Sie einen eigenen Fork erstellt haben, ansonsten müssen Sie lokal mergen.

- Navigieren Sie auf die Webseite Ihres Forks, und klicken Sie auf "Branches".
- Klicken Sie nun für Ihren Branch auf die Schaltfläche "New pull request", um die Änderungen zum `master` branch zu begutachten und den Pull Request zu erstellen.
- Auf der nächsten Seite (bzw. unter "Pull Requests") können Sie den Merge bestätigen, und so die Änderungen in Ihren `master` branch einbringen.

Gratulation, Sie haben Ihre erste Lösung eingebracht!


## Hinweise zu IntelliJ auf Windows

- Es kann sein, dass Sie die Speichereinstellung für die virtuelle Maschine ändern müssen:
    ![vm-settings-windows](docs/res/vm-settings-windows.jpg "Windows VM Memory Settings")
- Dokumentation zum [Embedded Local Terminal](https://www.jetbrains.com/help/idea/2017.3/working-with-embedded-local-terminal.html)
- [Einrichtung von Git in IntelliJ](http://stackoverflow.com/questions/21676150/setup-git-in-intellij-terminal)
