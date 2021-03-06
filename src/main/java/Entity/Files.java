package Entity;

import java.text.DateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Files {

    private String emailUtilisateur;
    private String url;
    private double weight;
    private long dateCreation;
    private String type;
    private long id;
    private String statut;
    private String name;
    //[START keys]
    public static final String EMAIL = "userEmail";
    public static final String URL = "url";
    public static final String WEIGHT = "weight";
    public static final String DATE = "creationDate";
    public static final String TYPE = "type";
    public static final String ID = "id";
    public static final String STATUT = "statut";
    public static final String NAME = "name";
    // [END keys]

    public Files(String newEmail,String name, String newUrl, double newWeight, String newType){
        this.emailUtilisateur = newEmail;
        this.url = newUrl;
        this.weight = newWeight;
        this.type = newType;
        this.name = name;
        this.id = 0;
        this.statut = "Alive";
        this.dateCreation = System.currentTimeMillis();
    }

    public Files(String newEmail,String name, String newUrl, double newWeight, String newType,long id, String statut, long date){
        this.emailUtilisateur = newEmail;
        this.url = newUrl;
        this.weight = newWeight;
        this.type = newType;
        this.name = name;
        this.id = id;
        this.statut = statut;
        this.dateCreation = date;
    }

    //GETTER//
    public String getEmailUtilisateur(){
        return this.emailUtilisateur;
    }

    public String getUrl(){
        return this.url;
    }

    public double getWeight(){
        return this.weight;
    }

    public long getDateCreation(){
        return this.dateCreation;
    }

    public String getType(){
        return this.type;
    }

    public long getId(){
        return this.id;
    }

    public String getStatut(){
        return this.statut;
    }

    public String getName(){
        return this.name;
    }

    //SETTER//
    public void setEmailUtilisateur(String data){
        this.emailUtilisateur = data;
    }

    public void setUrl(String data){
        this.url = data;
    }

    public void setWeight(double data){
        this.weight = data;
    }

    public void setDateCreation(long data){
        this.dateCreation = data;
    }

    public void setType(String data){
        this.type = data;
    }

    public void setId(long data){
        this.id = data;
    }

    public void setStatut(String data){
        this.statut = data;
    }

    public void setName(String name) {
        this.name = name;
    }

    //FUNCTION//

    public void deleteFile(){
        this.statut = "ToDelete";
    }

    public String toString(){
        String res = "FILE DATA : \n";
        res += "Poster : " + this.emailUtilisateur + "\n";
        res += "Url : " + this.url + "\n";
        res += "Weight : " + this.weight + "\n";
        res += "Date Creation : " + this.dateCreation + "\n";
        res += "Type : " + this.type + "\n";
        res += "ID : " + this.id + "\n";
        res += "Statut : " + this.statut + "\n";
        return res;
    }
}
