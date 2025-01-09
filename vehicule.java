public class vehicule {
    
    private String nom;
    private String marque;
    private String annee;
    private int nbDeRoue;
    private String typeCaburant;
    private boolean moteur;
    private boolean contact;
    private boolean accelerateur;
    private boolean frein;


    public vehicule(String nom, String marque, String annee, int nbDeRoue, String typeCaburant, boolean moteur, boolean contact, boolean accelerateur, boolean frein) {

        this.nom = nom;
        this.marque = marque;
        this.annee = annee;
        this.nbDeRoue = nbDeRoue;
        this.typeCaburant = typeCaburant;
        this.moteur = moteur;
        this.contact = contact;
        this.accelerateur = accelerateur;
        this.frein = frein;
        
    }

    public String getNom(){
        return nom;
    }

    public String getMarque(){
        return marque;
    }

    public String getAnnee(){
        return annee;
    }

    public int getNbDeRoue(){
        return nbDeRoue;
    }

    public String getTypeCaburant(){
        return typeCaburant;
    }

    public boolean Moteur(){
        return moteur;
    }

    public boolean isContact(){
        return contact;
    }

    public boolean isAccelerateur(){
        return accelerateur;
    }






















} //fin de class