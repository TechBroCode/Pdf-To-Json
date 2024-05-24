package com.jetswift.upwork;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String FILE_PATH = "D:/Jetbrains/intellij/projects/Upwork/UpWork/src/main/assets/docs/310-stockport_grammar_school-11+Mathematics-2017.pdf";
    public static void main(String[] args) {
        String response = "";
        PdfReader pdfReader = null;
        String fileContent = "";
        var stringBuilder = new StringBuilder();
        try {
            var inputStream = new FileInputStream(FILE_PATH);
            pdfReader = new PdfReader(inputStream);
            pdfReader.setAppendable(true);
            var numberOfPages = pdfReader.getNumberOfPages();
            for (int i = 0; i < numberOfPages; i++) {
               var pageDictionary = pdfReader.getPageN(i);
               /*fileContent = pageDictionary.getAsDict()*/
            }
            stringBuilder.append(fileContent);
            response = stringBuilder.toString();
            pdfReader.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}