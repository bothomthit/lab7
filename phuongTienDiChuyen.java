/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Acer
 */
abstract class phuongTienDiChuyen {
  protected final String loaiPhuongTien;
  protected final HangSanXuat hangSanXuat;

    public phuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
  public void layTenHangSanXuat(){
      
  }
public void batDau(){
          
      }
public void tangToc(){
    
}
public void dungLai(){
    
}
abstract double layVanToc();

}

