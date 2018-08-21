/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author ZIDANE
 */
public class EncapKeluarga {
    private String nameSendiri;
    private String nameAyah;
    private String nameIbu;
    private String nameSaudara;
    private String address;
    private String hobi;
    private String citacita;
    private int umur;
    
    public String getnameSendiri(){
        return nameSendiri;
    }
    public String getnameAyah(){
        return nameAyah;
    }
    public String getnameIbu(){
        return nameIbu;
    }
    public String getnamesaudara(){
        return nameSaudara;
    }
    public String getAddress(){
        return address;
    }
    public String getCitacita(){
        return citacita;
    }
    public String getHobi(){
        return hobi;
    }
    public int getUmur(){
        return umur;
    }
    public void setnameSendiri(String newnameSendiri){
        nameSendiri = newnameSendiri;
    }
    public void setnameAyah(String newnameAyah){
        nameAyah = newnameAyah;
    }
    public void setnameIbu(String newnameIbu){
        nameIbu = newnameIbu;
    }
    public void setnameSaudara(String newnameSaudara){
        nameSaudara=newnameSaudara;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setHobi(String newHobi){
        hobi = newHobi;
    }
    public void setCitacita(String newCitacita){
        citacita=newCitacita;
    }
    public void setUmur(int newUmur){
        umur = newUmur;
    }
    
}
