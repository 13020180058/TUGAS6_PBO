/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAbstract;

/**
 *
 * @author ASUS-PC
 */
public class Hewan extends MakhlukHidup {
    private String kakiEmpat, kakiDua ;
    public Hewan(String kakiEmpat, String kakiDua){
        this.kakiEmpat = kakiEmpat;
        this.kakiDua   = kakiDua;
    }
    
    public void berdiri (){
        System.out.println("Kambing berdiri menggunakan :  " +kakiEmpat);
        System.out.println("Ayam berdiri menggunakan    :  " + kakiDua);
    }    
}

