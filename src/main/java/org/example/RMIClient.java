package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMIClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
//        Envoyer une requête au serveur
        Iproduct stob = (Iproduct) Naming.lookup("rmi://localhost:1099/P");
//  Création d'une instance produit dans notre tableau
        stob.create(new Produit(123L,"wael" , 20.5F));
//        Afficher le produit appelé
        System.out.println(stob.read(123L));
    }
}
