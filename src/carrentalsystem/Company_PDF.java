/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import Class.Booking;
import Class.Payment;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author bende
 */
public class Company_PDF {
    int action = 0;
    
    public void setAction(int num){
        this.action = num;
    }
    
    public int getAction(){
        return action;
    }

    
    public void GeneratePDF(){
                //PrestigeCarRental_2022.pdf
        try{
            String file_name = "PDF_Car\\PrestigeCarRental_2022.pdf";
            Document docx = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(docx, new FileOutputStream(file_name));
            
            
            docx.open();
            //adding heading
            Paragraph line = new Paragraph("Prestige Car Rental");
            docx.add(line); 
            docx.add(new com.itextpdf.text.Paragraph("\n"));

            //table to show all data
            PdfPTable data_table = new PdfPTable(4);
            PdfPCell cell1 = new PdfPCell(new Phrase ("Total Electric Car"));
            data_table.addCell(cell1);
            
            PdfPCell cell2 = new PdfPCell(new Phrase ("Total Conventional Car"));
            data_table.addCell(cell2);
            
            PdfPCell cell3 = new PdfPCell(new Phrase ("Total Customer Number"));
            data_table.addCell(cell3);
            
            PdfPCell cell4 = new PdfPCell(new Phrase ("Total Company Revenue"));
            data_table.addCell(cell4);
            
            //adding data
            Powered_Type power_typed = new Powered_Type();
            int elec = power_typed.doCalculateElectricCar();
            String elec_s = String.valueOf(elec);
            data_table.addCell(elec_s);
            
            int conv = power_typed.doCalculateConvenctionalCar();
            String convention = String.valueOf(conv);
            data_table.addCell(convention);
            
            Booking booking = new Booking();
            int get_num = booking.calTotalCustomer();
            String convert_num = String.valueOf(get_num);
            data_table.addCell(convert_num);
            
            Payment pay = new Payment();
            double rent_price = pay.TotalRevenue();
            String convert_price = String.valueOf(rent_price);
            data_table.addCell(convert_price);
            
            docx.add(data_table);
            docx.add(new com.itextpdf.text.Paragraph("\n"));
            //table data end here
            
            Paragraph total_car = new Paragraph("Total Car: " + power_typed.doCalculateTotalCar());
            docx.add(total_car); 
            docx.add(new com.itextpdf.text.Paragraph("\n"));
            
            Paragraph available_car = new Paragraph("Total Available Car: " + power_typed.doCalculateAvailableCar());
            docx.add(available_car); 
            docx.add(new com.itextpdf.text.Paragraph("\n"));
            
            Paragraph not_available_car = new Paragraph("Total Not-Available Car: " + power_typed.doCalculateNotAvailableCar());
            docx.add(not_available_car); 
            docx.add(new com.itextpdf.text.Paragraph("\n"));
            
            
            docx.close();
        }catch (Exception e){
                //error
        }
    }
}
