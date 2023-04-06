/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Acer
 */
public class mayBay extends phuongTienDiChuyen {

    public String loaiNhienLieu;

    /**
     * Get the value of loaiNhienLieu
     *
     * @return the value of loaiNhienLieu
     */
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    /**
     * Set the value of loaiNhienLieu
     *
     * @param loaiNhienLieu new value of loaiNhienLieu
     */
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public mayBay(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }
    public void catCanh(){
        
    }
public void haCanh(){
    
}
   
    @Override
   public double layVanToc() {
        
        return 0;
        
    
    } 
 
}
