package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter le prénom du client ");
        String firstName = scanner.nextLine();
        System.out.println("Enter le nom du client ");
        String lastName = scanner.nextLine();
        System.out.println("Enter le numéro de téléphone du client ");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter l'identifiant du client ");
        int id = scanner.nextInt();

        Customer customer = new Customer(firstName, lastName, phoneNumber, id);

        System.out.println("============================");
        System.out.println("====== Menu Principal ======");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Créer un compte");
        System.out.println("3. Effectuer un dépôt");
        System.out.println("4. Effectuer un retrait");
        System.out.println("5. Afficher les transactions et le solde");
        System.out.println("6. Quitter");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                customer.displayAccounts();
                break;
            case 2:
                System.out.println("============================");
                System.out.println("====== Créer un compte ======");
                System.out.println("1. Compte courant");
                System.out.println("2. Compte d'épargne");
                System.out.println("3. Compte payant");
                int accountChoice = scanner.nextInt();
                switch (accountChoice) {
                    case 1:
                        CurrentAccount currentAccount = new CurrentAccount(customer);
//                        customer.addAccount();
                        break;
                    case 2:
                        SavingAccount savingAccount = new SavingAccount(customer);
//                        customer.addAccount();
                        break;
                    case 3:
                        PayingAccount payingAccount = new PayingAccount(customer);
//                        customer.addAccount();
                        break;
                    default:
                        System.out.println("Choix invalide");
                        break;
                }
                break;
            case 3:
                System.out.println("============================");
                System.out.println("====== Effectuer un dépôt ======");
                System.out.println("1. Compte courant");
                System.out.println("2. Compte d'épargne");
                System.out.println("3. Compte payant");
                int depositChoice = scanner.nextInt();

                break;




}