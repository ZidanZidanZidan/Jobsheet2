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
public class TestKeluarga {
    public static void main(String[]args){
        EncapKeluarga keluarga = new EncapKeluarga();
        keluarga.setnameSendiri("Zidan");
        keluarga.setnameAyah("");
        keluarga.setnameIbu("");
        keluarga.setnameSaudara("Bintang");
        keluarga.setAddress("Perum. MAS, Lawang");
        keluarga.setHobi("Memancing");
        keluarga.setCitacita("Pengusaha");
        keluarga.setUmur(16);
        System.out.println("Nama         : "+keluarga.getnameSendiri());
        System.out.println("Nama Ayah    : "+keluarga.getnameAyah());
        System.out.println("Nama Ibu     : "+keluarga.getnameIbu());
        System.out.println("Alamat       : "+keluarga.getAddress());
        System.out.println("Hobi         : "+keluarga.getHobi());
        System.out.println("Cita - Cita  : "+keluarga.getCitacita());
        System.out.println("Umur         : "+keluarga.getUmur());
    }
    
}
