/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author bende
 */
public class BookingHistory_PDF {
    
    int action = 0;
    
    public void setAction(int num){
        this.action = num;
    }
    
    public int getAction(){
        return action;
    }
    
    public void generate_cusBooking_histtory(){
        
        try{
            String file_name = "PDF_customer_booking\\Customer_Rental_2022.pdf";
            Document cus_docx = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(cus_docx, new FileOutputStream(file_name));
            
            //write table here
            PdfPTable cus_pdf = new PdfPTable(4);
            cus_pdf.addCell("Booking ID");
            cus_pdf.addCell("Car ID");
            cus_pdf.addCell("Car Name");
            cus_pdf.addCell("Rent Price");
            cus_pdf.addCell("Booking Status");
            
            for(int row=0; row<=50; row++){
                for(int col=0; col<=4; col++){
                    cus_pdf.addCell(String.format("row %s", "col %s", row, col));
                }
            }
            
            
            
            
            cus_docx.open();
            //adding heading
            Paragraph line = new Paragraph("Prestige Car Rental - Customer ");
            cus_docx.add(line); 
            cus_docx.add(new com.itextpdf.text.Paragraph("\n"));
            cus_docx.add(cus_pdf);
    
        
        cus_docx.close();
        }            
        catch (Exception e){
                //error
        }
    
    }
    
}
