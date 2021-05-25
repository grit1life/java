package itextpdf;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCopy {

	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\손종호\\Desktop\\copy.pdf"));
			document.open();
			
			PdfContentByte canvas = writer.getDirectContent();
			PdfReader reader = new PdfReader("pdf/print.pdf");
			//pdf 내용이 여러장일 경우
			for(int num =1, size = reader.getNumberOfPages(); num <= size; num++) {
				PdfImportedPage page = writer.getImportedPage(reader, num);
				document.newPage();
				canvas.addTemplate(page, 0, 0);
			}
			document.close();
			
		} catch (IOException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
