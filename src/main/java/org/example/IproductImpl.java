package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class IproductImpl extends UnicastRemoteObject implements Iproduct {

    Hashtable<Long,Produit> prods =new Hashtable<Long, Produit>() ;
    protected IproductImpl() throws RemoteException {
    }

    @Override
    //    Créer un nouveau produit
    public void create(Produit produit) throws RemoteException {
        this.prods.put(produit.getCode(),produit);

    }
    //    accéeder à un produit
    @Override
    public Produit read(Long code) throws RemoteException {

        return prods.get(code) ;

    }
    //mise à jour d'un produit
    @Override
    public void update(Produit produit) throws RemoteException {
        this.prods.put(produit.getCode(),produit) ;

    }
    //Supression d'un produit
    @Override
    public void del(Long code) throws RemoteException {

         this.prods.remove(code) ;




    }





}
