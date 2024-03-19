# API E-commerce - README

## Introduction
Bienvenue dans la documentation de l'API E-commerce. Cette API a été développée dans le cadre d'une formation en architecture n-tier pour un site e-commerce. Elle permet de gérer les fonctionnalités principales d'un site de commerce électronique, telles que la gestion des produits, des paniers et des utilisateurs.

## Architecture
L'API E-commerce suit une architecture n-tier, ce qui signifie qu'elle est divisée en plusieurs couches logiques pour garantir la séparation des préoccupations et améliorer la maintenabilité et la scalabilité du système. Voici les principales couches de l'architecture :
- **Couche Présentation** : Cette couche est responsable de la gestion des requêtes HTTP entrantes et de la fourniture des réponses appropriées. Elle comprend les contrôleurs API qui reçoivent les requêtes des clients et interagissent avec les autres couches de l'application.
  
- **Couche Business** : Cette couche contient la logique métier de l'application. Elle gère la logique complexe liée aux produits, aux commandes, aux utilisateurs, etc. Elle traite les données reçues des contrôleurs, applique les règles métier et interagit avec la couche d'accès aux données. Elle comprend les services, les DTO et les convert.
  
- **Couche Persistance** : Cette couche est responsable de l'accès aux données. Elle communique avec la base de données pour récupérer, insérer, mettre à jour ou supprimer des données. Elle utilise des entités et des repository pour gérer les opérations de base de données.

## Installation et Configuration
Pour installer et configurer l'API E-commerce, suivez les étapes ci-dessous :
1. Clonez le dépôt depuis GitHub : `https://github.com/Thomas6A/e-commerceAPI`.
2. Accédez au répertoire du projet : `cd e-commerceAPI`.
3. Installez la base de données en accédant au répertoire Docker e-commerce : `cd Docker e-commerce` et entrez la commande `docker compose up`: .
4. Démarrez l'API : Exécutez l'application depuis votre environnement de développement.
5. Pour le front associé à cette API : `https://github.com/Thomas6A/e-commerceFront`

## Auteurs

https://github.com/Thomas6A

https://github.com/NicolasDrp