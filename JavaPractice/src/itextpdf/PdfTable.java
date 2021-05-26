package itextpdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfTable {

	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\손종호\\Desktop\\table.pdf"));
			document.open();
			
			//5개 열의 테이블 생성
			PdfPTable tb = new PdfPTable(5);
			tb.setWidthPercentage(100);
			tb.setWidths(new int[] {10, 20, 20, 20, 10});
			
			PdfPCell blank = new PdfPCell();
			PdfPCell info1 = new PdfPCell(new Paragraph("가", setFont(12)));
			PdfPCell info2 = new PdfPCell(new Paragraph("나", setFont(10)));
			PdfPCell info3 = new PdfPCell(new Paragraph("다", setFont(15)));
			
			blank.setFixedHeight(30);
			
			info1.setHorizontalAlignment(Element.ALIGN_CENTER);
			info2.setHorizontalAlignment(Element.ALIGN_CENTER);
			info3.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			//1행
			tb.addCell(blank);
			tb.addCell(blank);
			tb.addCell(blank);
			tb.addCell(blank);
			tb.addCell(blank);
			
			//2행
			tb.addCell(blank);
			tb.addCell(info1);
			tb.addCell(info2);
			tb.addCell(info3);
			tb.addCell(blank);
			
			document.add(tb);
			
			document.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//ttf 글꼴을 사용 안하면 한글 출력이 안된다
	public static Font setFont(int size) {
		String fontPath = "font/malgun.ttf";
		BaseFont bf = null;
		Font font = null;
		try {
			bf = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			font = new Font(bf, size, Font.NORMAL);
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return font;
	}

}
