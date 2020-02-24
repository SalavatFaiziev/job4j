package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        HtmlReport h = new HtmlReport();
        String s = h.generate("name", "body");
        System.out.println(s);

        JSONReport j = new JSONReport();
        String  s2 = j.generate("name", "body");
        System.out.println(s2);
    }
}
