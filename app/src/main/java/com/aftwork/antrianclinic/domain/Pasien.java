package com.aftwork.antrianclinic.domain;

import java.math.BigInteger;

public class Pasien {
    private String nomorIdentitas;
    private String namaPasien;
    private BigInteger nomorAntrian;
    private String jenisLayanan;

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(String nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public BigInteger getNomorAntrian() {
        return nomorAntrian;
    }

    public void setNomorAntrian(BigInteger nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }
}
