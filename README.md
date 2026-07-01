# Kickbox Tracker – Backend

REST-API für die Kickbox-Tracker-App, gebaut mit Java und Spring Boot.

## Tech Stack

- Java 26
- Spring Boot 4
- PostgreSQL (Trainingsdaten)
- MongoDB (Notizen & Tags)
- Maven

## Setup

### Voraussetzungen
- Java 26+
- Maven
- PostgreSQL (läuft lokal auf Port 5432)
- MongoDB (läuft lokal auf Port 27017)

### Datenbank anlegen
```bash
createdb kickbox_tracker
```

### Konfiguration
`src/main/resources/application.properties` anpassen:
```properties
spring.datasource.username=DEIN_USERNAME
```

### Starten
```bash
./mvnw spring-boot:run
```

API läuft dann auf `http://localhost:8080`

## API Endpoints

### Training Sessions (PostgreSQL)
| Method | Endpoint | Beschreibung |
|--------|----------|-------------|
| GET | /api/sessions | Alle Sessions abrufen |
| GET | /api/sessions/{id} | Eine Session abrufen |
| POST | /api/sessions | Neue Session anlegen |
| DELETE | /api/sessions/{id} | Session löschen |

### Training Notes (MongoDB)
| Method | Endpoint | Beschreibung |
|--------|----------|-------------|
| GET | /api/notes | Alle Notizen abrufen |
| GET | /api/notes/by-session/{id} | Notizen zu einer Session |
| POST | /api/notes | Neue Notiz anlegen |
| DELETE | /api/notes/{id} | Notiz löschen |

## Projektstruktur

```
src/main/java/at/alessandro/kickboxtracker/
├── controller/    # REST-Endpunkte
├── service/       # Business-Logik
├── repository/    # Datenbankzugriff
└── model/         # Entities & Enums
```