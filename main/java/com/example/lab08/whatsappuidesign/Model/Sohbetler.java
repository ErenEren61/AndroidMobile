package com.example.lab08.whatsappuidesign.Model;

/**
 * Created by Lab08 on 25.03.2018.
 */

public class Sohbetler {
    private int id;
    private String adSoyad;
    private String aciklama;
    private String zaman;
    private String resimUrl;

    public Sohbetler(int id, String adSoyad, String aciklama, String zaman, String resimUrl) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.aciklama = aciklama;
        this.zaman = zaman;
        this.resimUrl = resimUrl;
    }

    public Sohbetler() {
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        this.zaman = zaman;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }
}
