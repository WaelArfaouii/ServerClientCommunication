package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Iproduct extends Remote {
    //    Créer un nouveau produit
    public void create(Produit produit) throws RemoteException;
    //    accéeder à un produit
    public  Produit read(Long code) throws RemoteException;
    //mise à jour d'un produit
    public void update(Produit produit)  throws RemoteException;
    //Supression d'un produit
    public void del(Long code)  throws RemoteException;

}
