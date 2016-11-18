# Explorations d'utilisation (ou pas) des mocks

## Sujet

Développer un driver qui permet de piloter un système de portes automatiques, en commençant par la fonctionnalité d'ouverture d'une porte.

Le contrat avec l'autre qui développe le reste de l'appli est le suivant :

```java
public interface Driver {
	void openGate(int gateNumber);
}
```

Le système se pilote en envoyant des trames ASCII sur le port série, comme par exemple "OG2" pour ouvrir la porte N° 2.


## Question

Comment développer un tel module (package) en TDD, et donc comment tester, avec ou sans mocks, that is the question...

## Participation

Tu peux contribuer en proposant tes solutions en mettant tes sources dans des packages "monNom.uneSolution".
