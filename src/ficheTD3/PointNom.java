package ficheTD3;


public class PointNom extends Point{

 private String name;
    
    public PointNom (String name, double x, double y){
        super (x,y);
        this.name = name;        
    }
    
    
    public String AfficheCord ()
    {
        return   ""+name + "("+ getX() +","+ getY() +")";
    }
    
    
    public void setName(String name){
    this.name = name;
    }
    public String getname(){
    return name;
    }
  }
