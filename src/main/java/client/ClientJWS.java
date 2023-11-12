package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientJWS {
    public static void main(String[] args) {

            // Création d'une instance de BanqueService en utilisant le service généré BanqueServiceService
            // et en appelant la méthode getBanqueServicePort() pour obtenir le point d'accès au service.
            BanqueService BanqueService = new BanqueServiceService().getBanqueServicePort();

            // Appel de la méthode "conversion" du service web avec l'argument 5
            // et affichage du résultat retourné par la méthode.
            System.out.println(BanqueService.conversion(5));
            //Appel de la méthode "getComptes" du service web
             List<Compte> listeComptes = BanqueService.getComptes();
             System.out.println("Liste des comptes : ");
            // Parcours de la liste des comptes et affichage des informations
            for (Compte compte : listeComptes) {
            System.out.println("Solde : " + compte.getSolde());
            System.out.println("code : " + compte.getCode());
    }
}}
