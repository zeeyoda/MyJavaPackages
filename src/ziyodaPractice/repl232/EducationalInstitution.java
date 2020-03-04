package ziyodaPractice.repl232;

public class EducationalInstitution {
    int years;


    public EducationalInstitution(int y){
        years=y;
    }

    public String graduationRequirements(){
        String d = years+" years of study";
        return d;
    }
}
