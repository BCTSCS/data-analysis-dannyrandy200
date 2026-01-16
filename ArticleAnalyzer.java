import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ArticleAnalyzer {

    private ArrayList<String> stopWords; //load from FileOperators
    private ArrayList<Article> articles; //load from FileOperators json 

    public ArticleAnalyzer(){
        stopWords = FileOperator.getStringList("stopwords.txt");
        System.out.println("Stop words count: "+stopWords.size());
        articles = new ArrayList<Article>();
        System.out.println("Articles count: "+articles.size());

    }

    public static void main(String[] args) {
        ArticleAnalyzer analyzer = new ArticleAnalyzer();
        ArrayList<String> lines = FileOperator.getStringList("data.txt");
        String line = lines.get(0);
        Article article = analyzer.parseJson(line);
        System.out.println(article);
    }

    public void addStopWord(String word){

    }

    public void addArticle(Article article){

    }

    public Article parseJson(String jsonLine) {
        //use Pattern and matcher to create
        Article result;

        Pattern l = Pattern.compile("\"link\":\\s*\"([^\"]+)\"");  //regex to extract words
        Pattern h = Pattern.compile("\"headline\":\\s*\"([^\"]+)\"");  //regex to extract words
        Pattern c = Pattern.compile("\"category\":\\s*\"([^\"]+)\"");  //regex to extract words
        Pattern t = Pattern.compile("\"date\":\\s*\"([^\"]+)\"");  //regex to extract words
        Pattern a = Pattern.compile("\"author\":\\s*\"([^\"]+)\"");  //regex to extract words
        Pattern d = Pattern.compile("\"short_description\":\\s*\"([^\"]+)\"");  //regex to extract words

        Matcher lm = l.matcher(jsonLine); //parameter - line of text
        Matcher hm = h.matcher(jsonLine); //parameter - line of text
        Matcher cm = c.matcher(jsonLine); //parameter - line of text
        Matcher tm = t.matcher(jsonLine); //parameter - line of text
        Matcher am = a.matcher(jsonLine); //parameter - line of text
        Matcher dm = d.matcher(jsonLine); //parameter - line of text

        String lt = lm.find() ? lm.group(1) : ""; //extract the destined part
        String ht = hm.find() ? hm.group(1) : ""; //extract the destined part
        String ct = cm.find() ? cm.group(1) : ""; //extract the destined part
        String tt = tm.find() ? tm.group(1) : ""; //extract the destined part
        String at = am.find() ? am.group(1) : ""; //extract the destined part
        String dt = dm.find() ? dm.group(1) : ""; //extract the destined part

        result = new Article(lt, ht, ct, tt, at, dt);

        return result;



    }  

    // public String removeStopWords(String text) {
    //     //remove stop words from Description
    //     String result;

    //     return result;
    // }

}
