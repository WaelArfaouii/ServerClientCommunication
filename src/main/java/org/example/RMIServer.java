package org.example;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
//        Création d'un port serveur
        LocateRegistry.createRegistry(1099) ;
//        Création d'un produit
        IproductImpl p = new IproductImpl();
//        Définition d'URL que le client va envoyer sa requête sur lui
        Naming.rebind("rmi://localhost:1099/P",p );
//        Message indicatif
        System.out.println("connecté");
    }
}
