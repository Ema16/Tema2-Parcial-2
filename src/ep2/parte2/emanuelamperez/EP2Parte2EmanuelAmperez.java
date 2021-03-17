/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2.parte2.emanuelamperez;

/**
 *
 * @author eampe
 */
public class EP2Parte2EmanuelAmperez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Employee EddieMacz = new Employee("Emanuel Marlon Fabricio", "Amperez Tahuico", 15);
        EddieMacz.getFullName();
        
        EmployeeSalary es = new EmployeeSalary();
        es.printSalaryReport(EddieMacz);
    }
    
}
