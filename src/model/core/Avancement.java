package model.core;

import java.util.ArrayList;

/**
 * Created by ambie on 29/03/2017.
 */
public class Avancement {
    private boolean reussi;
    private Exercice exercice;
    private ArrayList<Tentative> tentatives;

    public Avancement(Exercice exercice) {
        this.reussi = false;
        this.exercice = exercice;
        tentatives = new ArrayList<>();
    }

    public void setReussi() {
        this.reussi = true;
    }

    public boolean isReussi() {
        return reussi;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void addTentative(Tentative t) {
        if (!tentatives.contains(t))
            this.tentatives.add(t);
    }

    public Tentative getTentative(int i){
        if (i < tentatives.size()){
            return tentatives.get(i);
        }
        return null;
    }

    public boolean isOneTentative(){
        return tentatives.size() != 0;
    }

    public Tentative getLastTentative(){
        return tentatives.get(tentatives.size()-1);
    }

	public Tentative getLastTentativeCorigee() {
		Tentative ret = null;
		for(Tentative t : tentatives)
		{
			if(null != t.getCorrection())
			{
				ret = t;
			}
		}
		return ret;
	}
}
