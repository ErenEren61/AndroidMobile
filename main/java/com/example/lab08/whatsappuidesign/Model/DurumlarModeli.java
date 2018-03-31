package com.example.lab08.whatsappuidesign.Model;

/**
 * Created by Lab08 on 31.03.2018.
 */

public class DurumlarModeli {

    private int id;
    private String adSoyad;
    private String resimUrl;
    private String paylasimZamani;

    public DurumlarModeli(int id, String adSoyad, String resimUrl, String paylasimZamani) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.resimUrl = resimUrl;
        this.paylasimZamani = paylasimZamani;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }

    public String getPaylasimZamani() {
        return paylasimZamani;
    }

    public void setPaylasimZamani(String paylasimZamani) {
        this.paylasimZamani = paylasimZamani;
    }



}
