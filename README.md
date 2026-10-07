<h1 align="center">TT - Gestion des Stagiaires</h1>

<p align="center"><b>Application de bureau Java pour la gestion des stagiaires de Tunisie Télécom</b></p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-Swing-ED8B00?logo=openjdk&logoColor=white" alt="Java Swing">
  <img src="https://img.shields.io/badge/NetBeans-IDE-1B6AC6?logo=apachenetbeanside&logoColor=white" alt="NetBeans">
  <img src="https://img.shields.io/badge/JDBC-Base%20de%20donnees-4479A1?logo=databricks&logoColor=white" alt="JDBC">
  <img src="https://img.shields.io/badge/rs2xml-Tables-555555" alt="rs2xml">
</p>

---

## À propos

**TT - Gestion des Stagiaires** est une application de bureau développée en **Java (Swing)** avec **NetBeans**, dans le cadre d'un stage à **Tunisie Télécom**. Elle permet à l'administration de gérer les stagiaires accueillis, les agents encadrants et les établissements d'origine, avec une recherche rapide.

Les données sont stockées dans une base de données relationnelle accessible via **JDBC**.

---

## Fonctionnalités

| Module | Description |
|---|---|
| Authentification | Écran de connexion sécurisé et gestion des mots de passe |
| Stagiaires | Ajout, modification, suppression et consultation des stagiaires |
| Agents | Gestion des agents encadrants |
| Facultés / Instituts | Gestion des établissements d'origine des stagiaires |
| Recherche | Recherche rapide des stagiaires |
| Interface | Écran de démarrage (splash) et menu principal |

---

## Structure du projet

```
telecome/
├── src/telecome/
│   ├── Telecome.java        # Point d'entrée
│   ├── splash.java          # Écran de démarrage
│   ├── Login.java           # Connexion
│   ├── Authentication.java
│   ├── passwords.java       # Gestion des mots de passe
│   ├── Menu.java            # Menu principal
│   ├── stagiaire.java       # Gestion des stagiaires
│   ├── agent.java           # Gestion des agents
│   ├── faculté.java         # Gestion des facultés
│   └── recherche.java       # Recherche
├── lib/
│   └── rs2xml.jar           # Affichage des ResultSet dans les JTable
└── nbproject/
```

---

## Installation et lancement

### Prérequis

- JDK 8 ou supérieur
- NetBeans
- Un serveur de base de données et son driver JDBC

### Étapes

1. Cloner le dépôt :

```bash
git clone https://github.com/nourelhoudaachour2/TT--Gestion-des-Stagiaires.git
```

2. Ouvrir le projet dans NetBeans (`File`, `Open Project`).
3. Ajouter les bibliothèques au projet (clic droit sur `Libraries`, `Add JAR/Folder`) :
   - `lib/rs2xml.jar`
   - le driver JDBC de la base de données utilisée
4. Créer la base de données et configurer la connexion (URL, utilisateur, mot de passe) dans les classes de connexion.
5. Lancer `Telecome.java` (`Run`).

---

## Technologies utilisées

`Java` · `Swing` · `NetBeans` · `JDBC` · `rs2xml`

---

## Auteure

**Nour El Houda Achour**
Cycle Ingénieur Génie Logiciel et Applications, IT Business School (ITBS)
Stage à Tunisie Télécom

GitHub : [@nourelhoudaachour2](https://github.com/nourelhoudaachour2)
