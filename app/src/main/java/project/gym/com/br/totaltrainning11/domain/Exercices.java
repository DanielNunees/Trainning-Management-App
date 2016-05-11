package project.gym.com.br.totaltrainning11.domain;

/**
 * Created by DanielPC on 05/11/2015.
 */
public class Exercices {

    private String exerciceName;
    private String category;
    private int series;
    private int repetitions;
    private String  charge;
    private  int photo;

    public Exercices(){};

    public Exercices(String exercice,String category,int photo){
            this.exerciceName = exercice;
            this.category = category;
            this.photo = photo;
    }

    public String getExerciceName () {
        return exerciceName;
    }

    public String getCategory() {
        return category;
    }

    public int getSeries() {
        return series;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public String getCharge() {
        return charge;
    }

    public int getPhoto() {
        return photo;
    }

    public void setExercice(String exercice) {
        this.exerciceName = exercice;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setCharge(String  charge) {
        this.charge = charge;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
