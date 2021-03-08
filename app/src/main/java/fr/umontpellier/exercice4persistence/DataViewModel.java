package fr.umontpellier.exercice4persistence;

import androidx.lifecycle.ViewModel;

public class DataViewModel extends ViewModel {

    String planning1 = "08h-10h : Rencontre client Dupont";
    String planning2 = "10h-12h : Travailler le dossierr recrutement";
    String planning3 = "14h-16h : Réunion équipe";
    String planning4 = "16h-18h : Préparation dossier vente.";

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
