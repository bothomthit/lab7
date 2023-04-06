/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Acer
 */
public class HangSanXuat {
    
    public String tenHangSanXuat;

    public String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }
    

    /**
     * Get the value of tenQuocGia
     *
     * @return the value of tenQuocGia
     */
    public String getTenQuocGia() {
        return tenQuocGia;
    }

    /**
     * Set the value of tenQuocGia
     *
     * @param tenQuocGia new value of tenQuocGia
     */
    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    /**
     * Get the value of tenHangSanXuat
     *
     * @return the value of tenHangSanXuat
     */
    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    /**
     * Set the value of tenHangSanXuat
     *
     * @param tenHangSanXuat new value of tenHangSanXuat
     */
    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public HangSanXuat() {
    }

}
