class Minor extends Guest{
    public Minor(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Minor:::" + super.toString();
    }
}