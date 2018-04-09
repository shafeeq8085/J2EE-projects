# Demo Anwendung

Diese Demoanwendung demonstriert Konfigurationsmechanismen und den Umgang mit sicherheitskritischen Umgebungsparamtertn.

## Struktur des Maven Builds
### Modul leap-demo-spring-app-war
Erzeugt das war-File leap-demo-spring-app.war


### Modul leap-demo-spring-app-deployment
Ordner Struktur:
* `config`: Enthält Umgebungsspezifische Konfiguration/Deploymentdeskriptoren pro Stage
    * `dev`
    * `uat`
    * `prod`
    
    Für jede Stage gibt es sowohl Konfigration für eine Openshift Deployment als auch für ein Cloudfoundry Deployment.
* `deployment`: 
    * `filtered`
    * `unfiltered`

### Build


#### Maven
mvn clean install -P dev,install-local,bgu-crp,!prod

Die Umgebungsvariable `WLP_DIR` muss gesetzt sein und auf eine entsprechende Liberty instanz zeigen

#### Umgebungsvariablen für WLP

```
KEYSTORE_PASSWORD=Y2hhbmdlaXQ= (base64codiert changeit)
MASTER_KEY=JZXdIJEZq97UTP6akLXbbnGTBRagqL8YY4x1S5pGVJg5XJ/4k0Si0vpQGdbxinAJWerrKGFETTyuw/DYxgDl+Q==
```

Nach dem starten ist die Anwendung unter http://localhost:8080/hello erreichbar