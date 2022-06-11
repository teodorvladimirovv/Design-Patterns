public class Factory {
    public static Toys getToys(String toyType){
        if(toyType == null){
            return null;
        }
        if(toyType.equalsIgnoreCase("Balls")){
            return new Balls();

        } else if(toyType.equalsIgnoreCase("Motorcycles")){
            return new Motorcycles();

        }
        return null;
    }
}
