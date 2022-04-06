package com.tekwill.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc(int stocIdAtribuit, String adresaMagazinAtribuita){
        stocId = stocIdAtribuit;
        adresaMagazin = adresaMagazinAtribuita;
        cartileDinStoc = new ArrayList<>();
    }
    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc;

    public void adaugaCarteInStoc(Carte carteaAdaugata){
this.cartileDinStoc.add(carteaAdaugata);
        System.out.println(carteaAdaugata.toString() + " a fost adaugata cu succes in stocul: "  + stocId +
                " de pe adresa " + adresaMagazin);
    }
    public void stergeCarteaDinStoc(Carte cartePeCareOStergem){
      boolean carteaAFostStearsa =  this.cartileDinStoc.remove(cartePeCareOStergem);
      if (carteaAFostStearsa){
          System.out.println(cartePeCareOStergem.toString() + " a fost stearsa cu succes din stocul " + stocId + " de pe adresa " + adresaMagazin);
      } else{
          System.out.println("Stergerea nu a avut loc");
      }
    }
    public boolean existaCarteaInAcestStoc(Carte  carteInvestigata){
        return this.cartileDinStoc.contains(carteInvestigata);
    }
    public int numarDeCartiInStoculCurent(){
        return this.cartileDinStoc.size();
    }
    public boolean esteStoculGol(){
        return this.cartileDinStoc.isEmpty();
    }
    public void afiseazaCartileDinStoc(){
        System.out.println(this.cartileDinStoc);
    }

    }

