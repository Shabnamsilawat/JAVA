package Aggregation;

public class Address {
    private String City;
    private String Country;
    private String Street;
    private int PostNumber;

    public Address(String City, String Country, String Street, int PostNumber){
        this.City = City;
        this.Country = Country;
        this.Street = Street;
        this.PostNumber= PostNumber;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public void setStreet (String Street){
        this.Street = Street;
    }
    public void setPostNumber (int PostNumber){
        this.PostNumber = PostNumber;
    }
    public String getCity(){
        return City;
    }
    public String getCountry(){
     return Country;
    }
    public String getStreet(){
        return Street;
    }
    public int getPostNumber(){
        return PostNumber;
    }
    }

